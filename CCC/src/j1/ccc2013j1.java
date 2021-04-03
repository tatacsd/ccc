package j1;

import java.util.Scanner;

public class ccc2013j1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("The youngest childre age >> ");
		int youngAge = keyboard.nextInt();
		
		System.out.print("The middle childre age >> ");
		int middleAge = keyboard.nextInt();
		
		int ageDifference = middleAge - youngAge;
		
		int olderAge = middleAge + ageDifference;
		System.out.println(olderAge);
				
		keyboard.close();
	}

}
