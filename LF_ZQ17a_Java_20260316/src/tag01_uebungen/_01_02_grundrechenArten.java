package tag01_uebungen;

import javax.swing.JOptionPane;

public class _01_02_grundrechenArten {

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
		JOptionPane.showMessageDialog(null, "Ergebnis der Addition: " + addition + "\n"
				+ "Ergebnis der Subtraktion: " + subtraktion + "\n"
				+ "Ergebnis der Multiplikation: " + multiplikation + "\n" 
				+ "Ergebnis der Division: " + division + "\n" 
				+ "Ergebnis der Addition: " + multiplikationPI);
	}
}
