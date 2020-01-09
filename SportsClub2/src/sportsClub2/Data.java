package sportsClub2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Data {
	
	Data() {
		Collections.shuffle(memberPool);
		}
	
//Member List - FirstName, LastName, Gender, DateOfBirth, Address, Nationality, Coach
		Members A = new Members("Will", "Russell", "Male", LocalDate.of(1992, 12, 21), "English", false);
		Members B = new Members("Lauren", "Barker", "Female", LocalDate.of(1998, 4, 18), "English", false);
		Members C = new Members("Phillip", "Thomas", "Male", LocalDate.of(2006, 7, 28), "English", false);
		Members D = new Members("Dan", "Sparkle", "Male", LocalDate.of(1989, 11, 7), "English", false);
		Members E = new Members("Mavis", "Olsson", "Female", LocalDate.of(1995, 1, 6), "English", false);
		Members F = new Members("Harriet", "Owen", "Female", LocalDate.of(2004, 5, 25), "English", false);
		Members G = new Members("Ethan", "Farrell", "Male", LocalDate.of(1993, 8, 7), "English", false);
		Members H = new Members("Matthew", "Heath", "Male", LocalDate.of(1999, 2, 11), "English", false);
		Members I = new Members("Luca", "Knight", "Female", LocalDate.of(2001, 11, 16), "English", false);
		Members J = new Members("Morgan", "Bishop", "Male", LocalDate.of(2008, 9, 29), "English", false);
		Members K = new Members("Callum", "Pickering", "Male", LocalDate.of(1990, 4, 30), "English", false);
		Members L = new Members("Nicole", "Hodgson", "Female", LocalDate.of(1996, 5, 3), "English", false);
		Members M = new Members("Sabastian", "Finch", "Male", LocalDate.of(2003, 12, 17), "English", false);
		Members N = new Members("Jayden", "Cartwright", "Male", LocalDate.of(2001, 10, 8), "English", false);
		Members O = new Members("Lewis", "Bartlett", "Male", LocalDate.of(2006, 5, 15), "English", false);
		Members P = new Members("Laura", "Yates", "Female", LocalDate.of(1992, 1, 22), "English", false);
		Members Q = new Members("Brandon", "Lee", "Male", LocalDate.of(2007, 3, 14), "English", false);
		Members R = new Members("Zoe", "Short", "Female", LocalDate.of(1998, 6, 13), "English", false);
		Members S = new Members("Tia", "Martin", "Female", LocalDate.of(2003, 10, 25), "English", false);
		Members T = new Members("Jamie", "Wilson", "Male", LocalDate.of(2009, 7, 10), "English", false);
		Members U = new Members("Kai", "O'Connor", "Male", LocalDate.of(2005, 8, 9), "English", false);
		Members V = new Members("Chelsea", "Sims", "Female", LocalDate.of(2000, 12, 1), "English", false);
		
		public Members[] listMember = {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V};

		List<Members> memberPool = Arrays.asList(listMember);
}