package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import data.Data;
import seleniumProject.User;
import seleniumProject.Xpath;

public class ContactScript {

//Websites	
	String jupiterToys = "https://jupiter.cloud.planittesting.com/#/home";
		
	ArrayList<User> userList = new ArrayList<User>();
	ArrayList<Xpath> xpathList = new ArrayList<Xpath>();
		
	Data xpathChoice = new Data();
	Data userChoice = new Data();
	WebDriver driver = createDriver();
		
	public ContactScript() {
			
		goToWebsite();
		fillInContactDetails();
		quitDriver();
	}
//METHOD - create Chrome Web Driver
		public WebDriver createDriver() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgill\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			return driver;
		}	
//METHOD - Navigate to Website		
		public void goToWebsite() {
					
			driver.get(jupiterToys);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle()+" has been loaded for contact page check");
		}
//METHOD - Fill in contact details and submit
		public void fillInContactDetails() {
			
			WebDriverWait waitForFeedback = new WebDriverWait(driver, 30);
			
			/*driver.findElement(By.xpath(xpathChoice.hamburgerMenuXpath.xpath)).click(); // Needed for non maximised windows*/
			driver.findElement(By.xpath(xpathChoice.contactXpath.xpath)).click();
	//Verify error message when submitting with no details
			driver.findElement(By.xpath(xpathChoice.submitContactXpath.xpath)).click();
			
			try {
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.forenameErrorXpath.xpath)));
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.emailErrorXpath.xpath)));
				waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.messageErrorXpath.xpath)));
				System.out.println("Expected errors have appeared when submitting with empty fields");
			}
			catch(Exception e) {
				System.out.println("Exception has occurred at invalid contact submit");
			}
			
	//Type in details and check error messages are no longer visible after typing in the field
			
			try {
			driver.findElement(By.xpath(xpathChoice.forenameInputXpath.xpath)).sendKeys(userChoice.validUser.forename);
			waitForFeedback.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathChoice.forenameErrorXpath.xpath)));
			
			driver.findElement(By.xpath(xpathChoice.emailInputXpath.xpath)).sendKeys(userChoice.validUser.email);
			waitForFeedback.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathChoice.emailErrorXpath.xpath)));
			
			driver.findElement(By.xpath(xpathChoice.messageInputXpath.xpath)).sendKeys(userChoice.validUser.message);
			waitForFeedback.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathChoice.messageErrorXpath.xpath)));
			System.out.println("Expected removal of errors when mandatory fields are completed");
			}
			catch (Exception e) {
				System.out.println("Exception has occurred while typing in contact details");
			}
	//Submit completed contact form & print out thank you message			
			driver.findElement(By.xpath(xpathChoice.submitContactXpath.xpath)).click();
			
			waitForFeedback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathChoice.thanksMessageXpath.xpath)));
			
			WebElement thanksMessage = driver.findElement(By.xpath(xpathChoice.thanksMessageXpath.xpath));
			String thanksMessageText = thanksMessage.getText();
			System.out.println(thanksMessageText+" - contact feedback has been submitted successfully");
		}
//METHOD - Quit driver
		public void quitDriver() {
					
			driver.close();
			driver.quit();	
	}
}