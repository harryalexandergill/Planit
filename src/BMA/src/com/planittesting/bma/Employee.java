package com.planittesting.bma;
import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {

		String fullName;
		int hours;
		LocalDate startDate;

		
//Getters & Setters		
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		
		
		public int getHours() {
			return hours;
		}
		public void setHours(int hours) {
			this.hours = hours;
		}
		
		
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public ArrayList<Skill> getSkillArrayList() {
			return null;
		}		
}