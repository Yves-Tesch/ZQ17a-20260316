package tag01_uebungen;

import javax.swing.JOptionPane;

public class _05_RechteckBerechnung {

	public static void main(String[] args) {
		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Länge ein: "));
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite ein: "));
		String masseinheit = JOptionPane.showInputDialog("Bitte geben Sie die Masseinheit ein: ");
		
		double flaeche = laenge * breite;
		double umfang = (2 * laenge + 2 * breite);
		
		JOptionPane.showMessageDialog(null, "Die eingebene Länge beträgt: " + laenge + masseinheit + "\n"
				+ "Die eingebene Breite beträgt: " + breite + masseinheit + "\n"
				+ "Der Umfang beträgt: " + umfang + masseinheit + "\n"
				+ "Die Fläche beträgt: " + flaeche + masseinheit);

	}

}
