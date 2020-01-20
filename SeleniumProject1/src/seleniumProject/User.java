package seleniumProject;

public class User {
	
	public String username;
	public String password;
	public String forename;
	public String email;
	public String message;
	public String cardNumber;
	public String address;
	
	public User(String username, String password, String forename, String email, String message, String cardNumber, String address) {
		
		this.username = username;
		this.password = password;
		this.forename = forename;
		this.email = email;
		this.message = message;
		this.cardNumber = cardNumber;
		this.address = address;
	}

//Username getter & setter
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
//Password getter & setter
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//Forename getter & setter
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
//Email getter & setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//Message getter & setter
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
//Card Number getter & setter
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
//Address getter & setter
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}