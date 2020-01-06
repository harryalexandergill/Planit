package com.planittesting.bma;
import java.time.LocalDate;

public class BenchManager extends Employee {
		
	String displayText;
	
	BenchManager(String fullName, LocalDate startDate) {
		
		this.fullName = fullName;
		this.startDate = startDate;
	}
	
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText() {
		this.displayText = (getFullName() + getStartDate() + anyEmployeeAddress.getGenerateAddress());
	}
	
	EmployeeAddresses anyEmployeeAddress = new EmployeeAddresses(displayText, displayText, displayText, displayText, displayText, displayText);
}