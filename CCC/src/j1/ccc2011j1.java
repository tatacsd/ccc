package j1;

import java.util.Scanner;

public class ccc2011j1 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many antennas? >> ");
		int antennaNum = keyboard.nextInt();
		
		System.out.print("How many eyes? >> ");
		int eyesNum = keyboard.nextInt();
		
		
		if (antennaNum >= 3 && eyesNum <= 4) {
			System.out.println("TroyMartian");
		} 
			
		if (antennaNum <= 6 && eyesNum >= 2) {
			System.out.println("VladSaturnian");
		} 
		
		if (antennaNum <= 2 && eyesNum <= 3) {
			System.out.println("GraemeMercurian");
		}
		
		
		keyboard.close();
	}

}
