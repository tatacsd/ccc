package j1;

import java.util.Scanner;

public class ccc2010j1 {
	
	
	public static void main(String[] args) {
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user 
		System.out.println("What is the n, Daddy?  (1 ≤ n ≤ 10) >>");
		int n = keyboard.nextInt(); 
		
		//number in one hand
		if(n == 1) {
			count = 1;
		} else if (n == 2) {
			count = 2;
		} else if (n == 3) {
			count = 2;
		} else if (n == 4) {
			count = 3;
		} else if (n == 5) {
			count = 3;
		} else if (n == 6) {
			count = 3;
		} else if (n == 7) {
			count = 2;
		} else if (n == 8) {
			count = 2;
		} else if (n == 9) {
			count = 1;
		} else if (n == 10) {
			count = 1;
		}
		
		System.out.println(count);
		
		keyboard.close();
	}
}

/*
 * int left = NUM > 5 ? 5 :NUM
 * int right = NUM - left
 * count = 0;
 * 
 * do {
 * left -= 1;
 * right += 1;
 * count++;
 * } while (left >= right);
 * 
 * System.out.println(count);
 */


