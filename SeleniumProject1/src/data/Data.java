package data;

import java.util.Arrays;
import java.util.List;

import seleniumProject.User;
import seleniumProject.Xpath;

public class Data {

//List of Users	
	public User validUser = new User("test", "letmein", "Bruce", "definitelynotbatman@batcave.com", "A short test message", "1234876543215678", "Example text address");
	public User invalidUser = new User("test", "icantegetin", "Jason", "acrobatrobin@circus.com", "A slightly longer test message", "This isn't a number", "Example text address");

//Users put into an array that can be imported to any script
	public User[] listUser = {validUser, invalidUser};

		List<User> userPool = Arrays.asList(listUser);
		
//Jupiter toys xpaths as xpath objects with an xpath String
	public Xpath startShoppingXpath = new Xpath("//a[contains(.,'Start Shopping »')]");
	public Xpath loginXpath = new Xpath("//a[contains(.,'Login')]");
	public Xpath hamburgerMenuXpath = new Xpath("//a[@class='btn btn-navbar']");
	public Xpath shoppingCartXpath = new Xpath("//a[contains(.,'Cart')]");
	public Xpath usernameInputXpath = new Xpath("//input[@placeholder='User Name']");
	public Xpath passwordInputXpath = new Xpath("//input[@placeholder='Password']");
	public Xpath submitLoginXpath = new Xpath("//button[@type='submit'][contains(.,'Login')]");
	public Xpath loggedInUserXpath = new Xpath("//span[@class='user']");
	public Xpath contactXpath = new Xpath("//a[contains(.,'Contact')]");
	public Xpath forenameInputXpath = new Xpath("//input[@name='forename']");
	public Xpath emailInputXpath = new Xpath("//input[contains(@type,'email')]");
	public Xpath messageInputXpath = new Xpath("//textarea[contains(@placeholder,'Tell us about it..')]");
	public Xpath submitContactXpath = new Xpath("//a[contains(.,'Submit')]");
	public Xpath thanksMessageXpath = new Xpath("//strong[contains(.,'Thanks "+validUser.forename+"')]");
	public Xpath addressInputXpath = new Xpath("//textarea[@id='address']");
	public Xpath forenameErrorXpath = new Xpath("//span[contains(.,'Forename is required')]");
	public Xpath emailErrorXpath = new Xpath("//span[contains(.,'Email is required')]");
	public Xpath messageErrorXpath = new Xpath("//span[contains(.,'Message is required')]");
	public Xpath cardErrorXpath = new Xpath ("//span[contains(.,'Credit Card is required')]");
	public Xpath addressErrorXpath = new Xpath ("//span[contains(.,'Address is required')]");
	public Xpath buyTeddyXpath = new Xpath("(//a[contains(.,'Buy')])[1]");
	public Xpath buyStuffedFrogXpath = new Xpath("(//a[contains(.,'Buy')])[2]");
	public Xpath buyHandmadeDollXpath = new Xpath("(//a[contains(.,'Buy')])[3]");
	public Xpath buyFluffyBunnyXpath = new Xpath("(//a[contains(.,'Buy')])[4]");
	public Xpath buySmileyBearXpath = new Xpath("(//a[contains(.,'Buy')])[5]");
	public Xpath buyFunnyCowXpath = new Xpath("//*[@id=\"product-6\"]/div/p/a");
	public Xpath buyValentineBearXpath = new Xpath("(//a[contains(.,'Buy')])[7]");
	public Xpath buySmileyFaceXpath = new Xpath("(//a[contains(.,'Buy')])[8]");
	public Xpath cartTotalXpath = new Xpath ("//strong[contains(.,'Total:')]");
	public Xpath findTeddyXpath = new Xpath("(//h4[@class='product-title ng-binding'])[1]");
	public Xpath findStuffedFrogXpath = new Xpath("(//h4[@class='product-title ng-binding'])[2]");
	public Xpath findHandmadeDollXpath = new Xpath("(//h4[@class='product-title ng-binding'])[3]");
	public Xpath findFluffyBunnyXpath = new Xpath("(//h4[@class='product-title ng-binding'])[4]");
	public Xpath findSmileyBearXpath = new Xpath("(//h4[@class='product-title ng-binding'])[5]");
	public Xpath findFunnyCowXpath = new Xpath("(//h4[@class='product-title ng-binding'])[6]");
	public Xpath findValentineBearXpath = new Xpath("(//h4[@class='product-title ng-binding'])[7]");
	public Xpath findSmileyFaceXpath = new Xpath("(//h4[@class='product-title ng-binding'])[8]");
	public Xpath teddyPriceXpath = new Xpath("(//span[contains(@class,'product-price ng-binding')])[1]");
	public Xpath stuffedFrogPriceXpath = new Xpath("(//span[contains(@class,'product-price ng-binding')])[2]");
	public Xpath handmadeDollPriceXpath = new Xpath("(//span[contains(@class,'product-price ng-binding')])[3]");
	public Xpath fluffyBunnyPriceXpath = new Xpath("(//span[contains(@class,'product-price ng-binding')])[4]");
	public Xpath smileyBearPriceXpath  = new Xpath("(//span[contains(@class,'product-price ng-binding')])[5]");
	public Xpath funnyCowPriceXpath = new Xpath("(//span[contains(@class,'product-price ng-binding')])[6]");
	public Xpath valentineBearPriceXpath = new Xpath("(//span[contains(@class,'product-price ng-binding')])[7]");
	public Xpath smileyFacePriceXpath = new Xpath("(//span[contains(@class,'product-price ng-binding')])[8]");
	public Xpath cartQuantity1Xpath = new Xpath("(//input[@name='quantity'])[1]");
	public Xpath cartQuantity2Xpath = new Xpath("(//input[@name='quantity'])[2]");
	public Xpath checkOutXpath = new Xpath ("//a[contains(.,'Check Out')]");
	public Xpath cardTypeXpath = new Xpath ("//select[@id='cardType']");
	public Xpath cardNumberXpath = new Xpath("//input[contains(@placeholder,'1234 9876 1234 9876')]");
	public Xpath shopDetailsSubmitXpath = new Xpath("//*[@id=\"checkout-submit-btn\"]");
	public Xpath orderNumberXpath = new Xpath("(//strong[contains(@class,'ng-binding')])[2]");
	public Xpath invalidLoginErrorXpath = new Xpath("//strong[contains(.,'Your login details are incorrect')]");
	
	
//Xpaths into an array that can be imported into any script	as a string
	public Xpath[] listXpaths = {startShoppingXpath, loginXpath, hamburgerMenuXpath, shoppingCartXpath, usernameInputXpath, passwordInputXpath,
								submitLoginXpath, loggedInUserXpath, contactXpath, forenameInputXpath, emailInputXpath, messageInputXpath, submitContactXpath,
								thanksMessageXpath, forenameErrorXpath, emailErrorXpath, messageErrorXpath, buyTeddyXpath, buyStuffedFrogXpath, 
								buyHandmadeDollXpath, buyFluffyBunnyXpath, buySmileyBearXpath, buyFunnyCowXpath, buyValentineBearXpath, buySmileyFaceXpath, 
								cartTotalXpath, findTeddyXpath, findStuffedFrogXpath, findHandmadeDollXpath, findFluffyBunnyXpath, findSmileyBearXpath, 
								findFunnyCowXpath, findValentineBearXpath, findSmileyFaceXpath, teddyPriceXpath, stuffedFrogPriceXpath, handmadeDollPriceXpath, 
								fluffyBunnyPriceXpath, smileyBearPriceXpath, funnyCowPriceXpath, valentineBearPriceXpath, smileyFacePriceXpath, cartQuantity1Xpath, 
								cartQuantity2Xpath, checkOutXpath, cardNumberXpath, cardErrorXpath, shopDetailsSubmitXpath, addressErrorXpath, addressInputXpath, 
								orderNumberXpath, invalidLoginErrorXpath};
					
	List<Xpath> xpathPool = Arrays.asList(listXpaths);
}