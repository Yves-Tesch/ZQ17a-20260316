package tag01_uebungen;

import javax.swing.JOptionPane;

public class _06_3_ASCIIBerechnungAlternativ {

	public static void main(String[] args) {
		// Eingabe
		int ziffer = Integer.parseInt(JOptionPane.showInputDialog("Gib ein einzelnes Zeichen ein von 0 bis 9: "));

		//Verarbeitung
		int ergebnis = ziffer * 10;

		// Ausgabe
		JOptionPane.showMessageDialog(null, "Das Zehnfache von " + ziffer + " beträgt: " + ergebnis);

	}

}
