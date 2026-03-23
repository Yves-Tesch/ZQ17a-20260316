package tag04_05_uebungen.pseudocodeUebung;

import java.util.Scanner;

public class _02_CodeKontrolle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int richtigerCode = 2468;
		int versuche = 0;
		int eingabe = -1;
		
		while(eingabe != richtigerCode && versuche < 3) {
			System.out.println("Code eingeben: ");
			eingabe = scanner.nextInt();
			
			if(eingabe == richtigerCode) {
				System.out.println("Zugang erlaubt");
			} else {
				System.out.println("Falscher Code");
				versuche++;
			}
		}
		
		if (eingabe != richtigerCode) {
			System.out.println("Zugang gesperrt.");
		}
	}
}
