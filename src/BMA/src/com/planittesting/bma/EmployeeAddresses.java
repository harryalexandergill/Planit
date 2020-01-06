package com.planittesting.bma;

public class EmployeeAddresses {

	private String line1;
	private String line2;
	private String city;
	private String county;
	private String postcode;
	private String country;
	private String generatedAddress;
	
	public EmployeeAddresses(String line1, String line2, String city, String county, String postcode, String country) {
		
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.county = county;
		this.postcode = postcode;
		this.country = country;
	}
	
	public void setGenerateAddress() {
		
		this.generatedAddress = (line1 + "," + line2 + "," + city + "," + county + "," + postcode + "," + country);	
	}
	public String getGenerateAddress() {
		return generatedAddress;
	}
}