package tag04_05_vertiefungen;

public class _01_SwitchCase {

	public static void main(String[] args) {
		// Switch Case Alternative für if-else-if - Konstruktionen
		
		// wird genutzt um die Lesbarkeit von langen if-else-if-Konstrukten zu verbessern
		
		// Sind potentiell effizienter, weil die JVM direkt weiß, ob ein Case existiert, oder nicht
		
		// Verwendbare Datentypen: 
		// Ganzzahlen: byte, short, int (alle außer long)
		// char
		// String
		// enum
		
		int jahreszeit = 1;
		
		switch (jahreszeit) {
		case 1: 
			System.out.println("Frühling");
			break;
		case 2:
			System.out.println("Sommer");
			break;
		case 3:
			System.out.println("Herbst");
			break;
		case 4:
			System.out.println("Winter");
			break;
		default: //optional, nicht zwingend notwendig
			System.out.println("Ungültige Jahreszahl.");
		}

	}

}
