package tag01_uebungen;

import javax.swing.JOptionPane;

public class _06_1_ASCIIBerechnung {

	public static void main(String[] args) {
		// Eingabe
		String eingabe1 = JOptionPane.showInputDialog("Gib das erste Zeichen ein: ");
		char zeichen1 = eingabe1.charAt(0);

		String eingabe2 = JOptionPane.showInputDialog("Gib das zweite Zeichen ein: ");
		char zeichen2 = eingabe2.charAt(0);

		// Verarbeitung
		int asciiSumme = (int) zeichen1 + (int) zeichen2;

		// Ausgabe
		JOptionPane.showMessageDialog(null,
				"Die Summe der ASCII-Werte von " + zeichen1 + " und " + zeichen2 + " beträgt: " + asciiSumme);
	}
}
