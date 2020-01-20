package scripts;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import data.Data;
import seleniumProject.User;
import seleniumProject.Xpath;

public class LoginScript {
	
//Websites
	String jupiterToys = "https://jupiter.cloud.planittesting.com/#/home";
	
	ArrayList<User> userList = new ArrayList<User>();
	ArrayList<Xpath> xpathList = new ArrayList<Xpath>();
	
	Data xpathChoice = new Data();
	Data userChoice = new Data();
	WebDriver driver = createDriver();
	
	public LoginScript() {
		
		goToWebsite();
		loginValidUser();
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
			System.out.println(driver.getTitle()+" has been loaded for login check");
		}
//METHOD - Login user		
		public void loginValidUser() {
			
			//driver.findElement(By.xpath(xpathChoice.hamburgerMenuXpath.xpath)).click();
			driver.findElement(By.xpath(xpathChoice.loginXpath.xpath)).click();
			driver.findElement(By.xpath(xpathChoice.usernameInputXpath.xpath)).sendKeys(userChoice.validUser.username);
			driver.findElement(By.xpath(xpathChoice.passwordInputXpath.xpath)).sendKeys(userChoice.validUser.password);
			driver.findElement(By.xpath(xpathChoice.submitLoginXpath.xpath)).click();
			
		//Print out username	
			WebElement user = driver.findElement(By.xpath(xpathChoice.loggedInUserXpath.xpath));
			String username = user.getText();
			System.out.println(username+" has been logged in");
		}
//METHOD - Quit driver
		public void quitDriver() {
			
			driver.close();
			driver.quit();		
	}
}