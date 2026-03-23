package tag02_03_kontrollstrukuren._schleifen;

public class _02_forSchleife {

	public static void main(String[] args) {
		// For-Schleife ist eine besondere Form der kopfgesteuerten Schleife
		
		// Wiederholt die Anweisung abhängig von Kontrollausdrücken im Schleifenkopf
		
		// Die Schleife wird häufig auch "Zählschleife" genannt
		
		// Die For-Schleife besteht drei Teilen: Der Initialisierungsblock (auch mehrere Initialisierungen möglich,
		// der Bedingungsblock (mehrere Bedingungen möglich) und die Update-Anweisung, alle Parts getrennt durch
		// Semikolon

		for(int i = 0; i <= 20; i++) {
			System.out.println("Wert von i: " + i);
		}
	}
}
