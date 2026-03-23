package tag01_uebungen;

public class _01_0_grundrechenartenNutzen {

	public static void main(String[] args) {
		int zahl1 = 16;
		int zahl2 = 4;
		
		final double PI = 3.14;
		
		// Berechnungen
		int addition = zahl1 + zahl2;
		int subtraktion = zahl1 - zahl2;
		int multiplikation = zahl1 * zahl2;
		int division = zahl1 / zahl2;
		double multiplikationPI = zahl1 * PI;
		
		// Ausgabe
		System.out.println("Ergebnis der Addition: " + addition);
		System.out.println("Ergebnis der Subtraktion: " + subtraktion);
		System.out.println("Ergebnis der Multiplikation: " + multiplikation);
		System.out.println("Ergebnis der Division: " + division );
		System.out.println("Ergebnis der Addition: " + multiplikationPI);

	}

}
