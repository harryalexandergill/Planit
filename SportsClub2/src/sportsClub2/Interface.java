package sportsClub2;

public class Interface {

	public static void main(String[] args) {
				
		Data memberList = new Data();

		
//List of potential teams		
		Team generatedTeam = new Team();
					
//Generation of teams
		byte i = 0;
		for (Members player:memberList.memberPool) {
								
			switch (generatedTeam.userGenderInput) {
			
			case "Male":
			if ((player.isMale()) && (player.overSpecifiedAge(generatedTeam.userAgeInput)) && (i<generatedTeam.userPlayerCount)) {
				generatedTeam.teamList.add(player);
				i++;
				}
			break;
			case "Female":
			if ((!player.isMale()) && (player.overSpecifiedAge(generatedTeam.userAgeInput)) && (i<generatedTeam.userPlayerCount)) {
				generatedTeam.teamList.add(player);
				}
			break;
			case "Mixed":
			if ((player.overSpecifiedAge(generatedTeam.userAgeInput)) && (i<generatedTeam.userPlayerCount)) {
				generatedTeam.teamList.add(player);
				}
			break;
			default:
				System.out.println("No");
				}	
			}
//Call method to create team list		
		System.out.println(generatedTeam.toString());
		
//Team size logic - Is the team correct and if not why		
		if (generatedTeam.teamList.size() < 1) {
			System.out.println("There were no players matching your team criteria");
		}
		
		if (generatedTeam.teamList.size() < generatedTeam.userPlayerCount) {
			System.out.println("\nThere are only "+generatedTeam.teamList.size()+" players listed above that match your search criteria");
		}
		
		if (generatedTeam.coachChoice.contains("Yes")) {		
			System.out.println("\nYour team has been assigned a coach\n\n***********");
			}
		else {
			System.out.println("\nYour Team has not been assigned a coach\n\n***********");
		}
	}
}