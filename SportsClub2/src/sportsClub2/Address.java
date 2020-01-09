package sportsClub2;

public class Address { //extends Members {

	private String line1;
	private String line2;
	private String city;
	private String county;
	private String postcode;
	private String country;
	String generatedAddress;
	
	Address(String line1, String line2, String city, String county, String postcode, String country) {
		
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.county = county;
		this.postcode = postcode;
		this.country = country;
	}

//Getters & Setters
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
//Generate Address	
	public void getMemberAddress() {
		System.out.println(line1 + "," + line2 + "," + city + "," + county + "," + postcode + "," + country);
	}
}