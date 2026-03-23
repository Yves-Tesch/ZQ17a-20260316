package tag01_grundlagen;

public class _01_VariablenKonstanten {

	public static void main(String[] args) {
		// Variablen werden im camelCase geschrieben
		
		int zahl; // Variablendeklaration
		
		// System.out.println(zahl); Funktioniert nicht, da Zahl nicht initialisiert ist
		
		zahl = 10; // Variableninitialisierung
		
		System.out.println(zahl);
		
		zahl = zahl + 5 ;
		
		System.out.println(zahl);
		
		zahl = 33;
		
		System.out.println(zahl);
		
		int wert = 18; //Deklaration + Initialisierung
		
		// String der in Ausgabe verwendet wird
		
		String name = "Hans";
		
		System.out.println("Wie ist dein Name? " + name);
		
		
		// Konstanten
		final int ZAHL = 20;
		
		// ZAHL = 25; Konstanten können nach der Initialisierung nicht mehr verändert werden
		// ZAHL = ZAHL + 5; auch nicht möglich!
		// Konstanten werden komplett groß geschrieben und im "SCREAMING_SNAKE_CASE" geschrieben
		
		System.out.println("Der Wert der Konstanten beträgt: " + ZAHL);

	}

}
