package scripts;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import data.Data;
import seleniumProject.ToyPrices;
import seleniumProject.User;
import seleniumProject.Xpath;

public class ShoppingCartScript {

	//Websites
		String jupiterToys = "https://jupiter.cloud.planittesting.com/#/home";
		
		ArrayList<User> userList = new ArrayList<User>();
		ArrayList<Xpath> xpathList = new ArrayList<Xpath>();
		
		Data xpathChoice = new Data();
		Data userChoice = new Data();
		WebDriver driver = createDriver();
		float funnyCowPrice;
		float smileyFacePrice;
		
		public ShoppingCartScript() {
			
			goToWebsite();
			ToyPrices cowAndSmile = goToShop();
			smileyFacePrice = cowAndSmile.getCowPrice();
			funnyCowPrice = cowAndSmile.getSmileyPrice();
			goToCart();
			purchaseProducts();
			quitDriver();
		}
//METHOD - Chrome Web Driver
		public WebDriver createDriver() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgill\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver;
		}
//METHOD - Navigate to Website		
		public void goToWebsite() {
				
			driver.get(jupiterToys);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle()+" has been loaded for shopping cart check");
		}
//METHOD - Navigate to shop
		public ToyPrices goToShop() {
			
			WebDriverWait waitForFeedback = new WebDriverWait(driver, 30);
	//Go to shop & wait for products to appear	
			driver.findElement(By.xpath(xpathChoice.startShoppingXpath.xpath)).click();
			waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.buyFunnyCowXpath.xpath)));
	//Select products wanted
			driver.findElement(By.xpath(xpathChoice.buyFunnyCowXpath.xpath)).click();
			driver.findElement(By.xpath(xpathChoice.buySmileyFaceXpath.xpath)).click();
	//Get prices of products & convert to int
			String funnyCowFigure = driver.findElement(By.xpath(xpathChoice.funnyCowPriceXpath.xpath)).getText();
			funnyCowFigure = funnyCowFigure.replaceAll("[^\\d.]", "");
			float funnyCowPrice = Float.parseFloat(funnyCowFigure);
			
			String smileyFaceFigure = driver.findElement(By.xpath(xpathChoice.smileyFacePriceXpath.xpath)).getText();
			smileyFaceFigure = smileyFaceFigure.replaceAll("[^\\d.]", "");
			float smileyFacePrice = Float.parseFloat(smileyFaceFigure);
			
			ToyPrices cowAndSmile = new ToyPrices(funnyCowPrice, smileyFacePrice);
			
			return cowAndSmile;
		}
//METHOD - Go to shopping cart
		public void goToCart() {
			
			WebDriverWait waitForFeedback = new WebDriverWait(driver, 30);
	//Go to shopping cart & verify products
			waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.findSmileyFaceXpath.xpath)));
			waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.findFunnyCowXpath.xpath)));
	//Go to shopping cart
			driver.findElement(By.xpath(xpathChoice.shoppingCartXpath.xpath)).click();
			waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.cartTotalXpath.xpath)));
	//Add another funny cow to cart
			driver.findElement(By.xpath(xpathChoice.cartQuantity1Xpath.xpath)).clear();
			driver.findElement(By.xpath(xpathChoice.cartQuantity1Xpath.xpath)).sendKeys("2");
	//Verify price and quantity of products		
			String shoppingCartTotal = driver.findElement(By.xpath(xpathChoice.cartTotalXpath.xpath)).getText();
			shoppingCartTotal = shoppingCartTotal.replaceAll("[^\\d.]", "");
			float cartTotal = Float.parseFloat(shoppingCartTotal);
			
			int goodPrices = (Float.compare(cartTotal, smileyFacePrice+(2*funnyCowPrice)));
			
			if (goodPrices == 1)  {
				System.out.println("The correct price of "+cartTotal+" is shown in the cart total");
			}
			else {
				System.out.println("The incorrect price is shown in the cart total");
				}	
			}
//METHOD - Purchase products in the cart
		public void purchaseProducts() {
			
			WebDriverWait waitForFeedback = new WebDriverWait(driver, 30);
			
			driver.findElement(By.xpath(xpathChoice.checkOutXpath.xpath)).click();
			waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.shopDetailsSubmitXpath.xpath)));
			
			driver.findElement(By.xpath(xpathChoice.shopDetailsSubmitXpath.xpath)).click();
		//Sumbit with empty fields to validate error messages	
			try {
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.forenameErrorXpath.xpath)));
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.emailErrorXpath.xpath)));
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.addressErrorXpath.xpath)));
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.cardErrorXpath.xpath)));
				System.out.println("Expected errors have appeared when submitting with empty fields");
			}
			catch(Exception e) {
				System.out.println("Exception has occurred at invalid contact submit");
			}
		//Fill in payment fields & submit	
			try {
				driver.findElement(By.xpath(xpathChoice.forenameInputXpath.xpath)).sendKeys(userChoice.validUser.forename);
				waitForFeedback.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathChoice.forenameErrorXpath.xpath)));
				
				driver.findElement(By.xpath(xpathChoice.emailInputXpath.xpath)).sendKeys(userChoice.validUser.email);
				waitForFeedback.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathChoice.emailErrorXpath.xpath)));
				
				driver.findElement(By.xpath(xpathChoice.addressInputXpath.xpath)).sendKeys(userChoice.validUser.address);
				waitForFeedback.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathChoice.addressErrorXpath.xpath)));
				
				driver.findElement(By.xpath(xpathChoice.cardNumberXpath.xpath)).sendKeys(userChoice.invalidUser.cardNumber);
				waitForFeedback.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathChoice.cardErrorXpath.xpath)));
				System.out.println("Expected removal of errors when mandatory fields are completed");
				}
				catch (Exception e) {
					System.out.println("Exception has occurred while typing in contact details");
				}	
		//Validate order has been made and print out order number
				driver.findElement(By.xpath(xpathChoice.shopDetailsSubmitXpath.xpath)).click();
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.thanksMessageXpath.xpath)));
				
				WebElement orderNumber = driver.findElement(By.xpath(xpathChoice.orderNumberXpath.xpath));
				String orderNumberText = orderNumber.getText();
				
				
				WebElement thanksMessage = driver.findElement(By.xpath(xpathChoice.thanksMessageXpath.xpath));
				String thanksMessageText = thanksMessage.getText();
				System.out.println(thanksMessageText+" - Purchase has been successful. The order number is: "+orderNumberText);
			}
//METHOD - Quit driver
		public void quitDriver() {
				
			driver.close();
			driver.quit();		
	}			
}