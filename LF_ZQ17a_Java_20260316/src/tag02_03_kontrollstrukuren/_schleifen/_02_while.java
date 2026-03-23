package tag02_03_kontrollstrukuren._schleifen;

public class _02_while {

	public static void main(String[] args) {
		// Kopfgesteuer Schleifen: Bedingung wird zu Beginn geprüft, das bedeutet, die Schleife
		// wird evtl. gar nicht ausgeführt, wenn die Bedingung nicht wahr ist
		
		// Fußgesteuer Schleifen: Bedingung wird zum Ende des Schleifenkörpers geprüft, weshalb
		// der Schleifenkörper mindestens einmal durchlaufen wird
		
		// While-Schleife gehört zu den kopfgesteuerten Schleifen
		
		
		int zaehler = 1;
		
		while (zaehler <= 5) {
			System.out.println("Aktueller Zähler: " + zaehler);
			zaehler++;
		}

	}

}
