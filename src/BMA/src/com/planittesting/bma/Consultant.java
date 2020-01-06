package com.planittesting.bma;

public class Consultant extends Employee {

	boolean assigned;
	String displayText;
	
	Consultant(boolean assigned) {
		
		this.assigned = assigned;
	}

//Getters & Setters	
	public boolean isAssigned() {
		return assigned;
	}
	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}

	
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText() {
		this.displayText = (getFullName() + isAssigned() + getStartDate() + anyEmployeeAddress.getGenerateAddress());
	}
	
	EmployeeAddresses anyEmployeeAddress = new EmployeeAddresses(displayText, displayText, displayText, displayText, displayText, displayText);
}