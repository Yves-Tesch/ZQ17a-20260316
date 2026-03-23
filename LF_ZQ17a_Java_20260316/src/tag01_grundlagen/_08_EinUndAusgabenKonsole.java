package tag01_grundlagen;

import java.util.Scanner;

public class _08_EinUndAusgabenKonsole {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Bitte gib deinen Namen ein: ");
		
		String name = myScanner.nextLine();
		
		System.out.println("Hallo, " + name + "!");
		
		myScanner.close();
	}

}
