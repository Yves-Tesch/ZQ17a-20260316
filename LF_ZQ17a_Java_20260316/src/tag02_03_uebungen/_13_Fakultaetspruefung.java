package tag02_03_uebungen;

import java.util.Scanner;

public class _13_Fakultaetspruefung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geben Sie bitte eine Zahl ein: ");
		long zahl = scanner.nextLong();
		
		if(zahl < 1) {
			System.err.println("Fakultäten sind immer >= 1");
		} else {
			long nummer = zahl;
			long teiler = 2;
			
			while(nummer % teiler == 0) {
				nummer /= teiler;
				teiler++;
			}
			
			if(nummer == 1) {
				System.out.println(zahl + " = " + (teiler-1) + "!");
			} else {
				System.out.println(zahl + " ist keine Fakultät.");
			}
		}
		
		scanner.close();

	}

}
