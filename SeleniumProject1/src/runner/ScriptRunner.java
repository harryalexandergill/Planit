package runner;

import scripts.ContactScript;
import scripts.InvalidLoginScript;
import scripts.LoginScript;
import scripts.ShoppingCartScript;

@SuppressWarnings("unused")
public class ScriptRunner {

//**************************************
//	Runner works by running any script that is not commented out
//	If a script is not commented out it will run a new instance of that script
//	Scripts can be run multiple times by creating multiple instances of that script
// 	 e.g. 
//			//LoginScript example = new LoginScript //This script will not run a login script
//		  	LoginScript example 2 = new LoginScript //This script will run the first login script
//			LoginScript example 3 = new LoginScript //This script will run another login script
//	
//**************************************
	
	public static void main(String[] args) {
	
		//LoginScript validLogin = new LoginScript();  //Ex 1
		//ContactScript completeContact = new ContactScript(); //Ex 2
		//ShoppingCartScript completeShop = new ShoppingCartScript(); //Ex 3
		//InvalidLoginScript invalidLogin = new InvalidLoginScript(); //Ex 4
	}
}