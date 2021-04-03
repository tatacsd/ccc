package j1;

import java.util.Scanner;

public class ccc2014j1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("First angle >> ");
		int firstAngle = keyboard.nextInt();
		
		System.out.print("Second angle >> ");
		int secondAngle = keyboard.nextInt();
		
		System.out.print("Third angle >> ");
		int thirdAngle = keyboard.nextInt();
		
		
		int sumAngles = firstAngle + secondAngle + thirdAngle;
		
		boolean twoDifferentAngles = firstAngle != secondAngle || firstAngle != thirdAngle || secondAngle != thirdAngle;
		boolean twoEquals = firstAngle == secondAngle || firstAngle == thirdAngle || secondAngle == thirdAngle;
		
		
				
		if (firstAngle == 60 && secondAngle == 60 && thirdAngle ==60) {
			System.out.println("Equilateral");
		} else if (sumAngles == 180 && twoDifferentAngles) {
			System.out.println("Scalene");
		} else if (sumAngles == 180 && twoEquals) {
			System.out.println("Isosceles");
		} else if (sumAngles != 180) {
			System.out.println("Error");
		}
		
		keyboard.close();
	}

}
