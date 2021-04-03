package j2;

import java.util.Scanner;

public class ccc2014j2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Number of votes >> ");
		int numOfVotes = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.print("Sequence of votes >> ");
		String sequenceOfVotes = keyboard.nextLine();
		
		int countVotesA = 0;
		int countVotesB = 0;
		
		for(int i = 0; i < numOfVotes; i++) {
			if(sequenceOfVotes.charAt(i) == 'A') {
				countVotesA++;
			} else {
				countVotesB++;
			}
		}
		
		if(countVotesA == countVotesB) {
			System.out.println("Tie");
		} else if(countVotesA > countVotesB) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	
		keyboard.close();
		
		
		
		// Another techinique:
		
		
	}

}
