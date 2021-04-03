package j1;

import java.util.Scanner;

public class ccc2012j1 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the speed limit: ");
		int speedLimit = keyboard.nextInt();		
		
		System.out.print("Enter the recorded speed of the car: ");
		int speedCar = keyboard.nextInt();
		
		int f = 0;
		
		if(speedCar >=1 && speedCar <= speedLimit) {
			System.out.print("Congratulations, you are within the speed limit!");
		} 
		
		if(speedCar >= speedLimit+1 && speedCar <= speedLimit+20) {
			f = 100;
			System.out.printf("You are speeding and your fine is $%d.", f);
		} else if (speedCar >= speedLimit+21 && speedCar <= speedLimit+30) {
			f = 270;
			System.out.printf("You are speeding and your fine is $%d.", f);
		} else if (speedCar >= speedLimit+31) {
			f = 500;
			System.out.printf("You are speeding and your fine is $%d.", f);
		}
		keyboard.close();
	}
}
