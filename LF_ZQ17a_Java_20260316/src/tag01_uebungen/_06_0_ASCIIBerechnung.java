package tag01_uebungen;

import javax.swing.JOptionPane;

public class _06_0_ASCIIBerechnung {

	public static void main(String[] args) {
		//Eingabe
		String eingabe = JOptionPane.showInputDialog("Gib ein einzelnes Zeichen ein: ");
		char zeichen1 = eingabe.charAt(0);
		
		//Verarbeitung
		int asciiWert = (int)zeichen1;
		
		//Ausgabe
		JOptionPane.showMessageDialog(null, "Der ASCII-Wert von " + zeichen1 + " ist: " + asciiWert);

	}

}
