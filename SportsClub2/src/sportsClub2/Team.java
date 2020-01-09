package sportsClub2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Team {
	
	public byte userAgeInput;
	public String userGenderInput;
	public byte userPlayerCount;
	public String coachChoice;
	String teamName;
	ArrayList<Members> teamList = new ArrayList<Members>();
	byte i;
	
	public Team() {
						
		teamNameQuestion();
		playerCountQuestion();
		ageQuestion();
		genderQuestion();
		coachQuestion();
	}
//Team Name	
	public void teamNameQuestion() {
		
	System.out.println("What would you like to name your new team?");
		
	while (i == 0) {
		@SuppressWarnings("resource")
		Scanner input3 = new Scanner(System.in);
		teamName = input3.nextLine();	
		
		if(teamName.isEmpty()) {
			System.out.println("You must give your team a name, please try again\n");
			}
		else {
			i++;
			}
		}
	}	
//Player Count
	public void playerCountQuestion() {
	
	System.out.println("How many players?");	
		
	while (i == 1) {
	try	{		
		@SuppressWarnings("resource")
		Scanner input4 = new Scanner(System.in);
		userPlayerCount = input4.nextByte();
		
		if(userPlayerCount >= 1) {
			i++;
			}
		else {
			System.out.println("You must have at least one player in the team, please try again\n");
		}
	}
	catch(InputMismatchException e){
		System.out.println("You must enter a reasonable whole number, please try again\n");
		}
	}
}
//Age selection
	public void ageQuestion() {	
		
	System.out.println("Minimum team age");	

	while (i == 2) {		
	try	{	
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		userAgeInput = input1.nextByte();
		
		if(userAgeInput >= 1) {
			i++;
			}
		else {
			System.out.println("Your players must be a valid age, please try again\n");
		}
	}
	catch(InputMismatchException e){
		System.out.println("You must enter a reasonable whole number, please try again\n");
		}
	}
}		
//Gender selection
	public void genderQuestion() {
		
	System.out.println("Male, Female or Mixed team?");
	
	while (i == 3) {
	try {			
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		userGenderInput = input2.nextLine();
		
		if ((userGenderInput.matches("Male")) || (userGenderInput.matches("Female")) || (userGenderInput.matches("Mixed"))) {
			i++;
			}
		else {
			System.out.println("You must select from Male, Female or Mixed. Please try again\n");
			}	
		}
	catch(Exception e){
		System.out.println("You must select from Male, Female or Mixed. Please try again\n");
		}
	}
}
//Build up team list	
	public String toString() {
		
		String teamNameList = "";
		
		for (Members player:this.teamList) {
			teamNameList = teamNameList + player.firstName+", ";
			}			
		return "\n************\nTeam Name: "+this.teamName+"\n\nMinimum Team Age: "+this.userAgeInput+"\n\n"+teamNameList;
	}	

//Coach selection
	public void coachQuestion() {
		
	System.out.println("Do you need a Coach?");
		
	while (i == 4) {
		@SuppressWarnings("resource")
		Scanner coachInput = new Scanner(System.in);
		coachChoice = coachInput.nextLine();
	
			if((coachChoice.matches("Yes")) || (coachChoice.matches("No"))) {
				i++;
				}
			else {
				System.out.println("Invalid input, please select again.\n");	
			} 
		} 
	}
}