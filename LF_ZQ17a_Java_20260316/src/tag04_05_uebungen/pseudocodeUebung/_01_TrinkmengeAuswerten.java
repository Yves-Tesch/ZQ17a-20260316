package tag04_05_uebungen.pseudocodeUebung;

import java.util.Scanner;

public class _01_TrinkmengeAuswerten {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tag;
		int glaeser;
		int summe;
		
		summe = 0;
		
		for(tag = 1; tag <= 5; tag++) {
			System.out.println("Wie viele Gläser hast am Tag " + tag + " getrunken? " );
			glaeser  = scanner.nextInt();
			summe += glaeser;
		}
		
		System.out.println("Insgeamt wurden " + summe + " Gläser getrunken.");
		
		if(summe >= 10) {
			System.out.println("Wochenziel erreicht.");
		} else {
			System.out.println("Wochenziel nicht erreicht.");
		}
		
		scanner.close();
	}
}
