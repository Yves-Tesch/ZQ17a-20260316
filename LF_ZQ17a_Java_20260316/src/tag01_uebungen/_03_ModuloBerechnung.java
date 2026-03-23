package tag01_uebungen;

import javax.swing.JOptionPane;

public class _03_ModuloBerechnung {

	public static void main(String[] args) {
		// Eingabe
		String eingabeZahl = JOptionPane.showInputDialog("Gib die erste Zahl ein: ");
		int zahl1 = Integer.parseInt(eingabeZahl);

		eingabeZahl = JOptionPane.showInputDialog("Gib die zweite Zahl ein: ");
		int zahl2 = Integer.parseInt(eingabeZahl);

		// Verarbeiten
		int rest = zahl1 % zahl2;

		// Ausgabe
		JOptionPane.showMessageDialog(null,
				"Der Rest der Division von " + zahl1 + " durch " + zahl2 + " ist " + rest + ".");

	}

}
