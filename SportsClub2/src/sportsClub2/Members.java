package sportsClub2;
import java.time.LocalDate;
import java.time.Period;

public class Members {

	String firstName;
	String lastName;
	String gender;
	LocalDate dateOfBirth;
	String nationality;
	Boolean coach;
	byte years;
	
	
	public Members(String firstName, String lastName, String gender, LocalDate dateOfBirth, String nationality, Boolean coach) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.coach = coach;
	}
	
//Name Methods	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//Gender Methods
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isMale() {
		if (gender=="Male") {
			return true;
		}
		else {
			return false;
		}	
	}
	
//Age Methods
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	private void updateAge(){
	    Period age = Period.between(this.getDateOfBirth(), LocalDate.now());
	    this.years = (byte)age.getYears();
	}  
	
	public void setYearsAge(byte years) {
	     updateAge();
	}
	
	public byte getYearsAge() {
	  if(this.years == 0)
	{
	      updateAge();
	}
	    return this.years;
	}
	
	public boolean overSpecifiedAge(byte userAgeInput) {
		
	    if (this.getYearsAge() >= userAgeInput) {
	    	return true;
	    	}
	    else {
	    	return false;
	    }
	}
	
//Other setters & getters
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Boolean getCoach() {
		return coach;
	}
	public void setCoach(Boolean coach) {
		this.coach = coach;
	}
}