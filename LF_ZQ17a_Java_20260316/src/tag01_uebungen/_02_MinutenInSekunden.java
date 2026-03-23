package tag01_uebungen;

import javax.swing.JOptionPane;

public class _02_MinutenInSekunden {

	public static void main(String[] args) {
		// Eingabe
		String eingabe = JOptionPane.showInputDialog("Gib die Anzahl der Minuten ein: ");
		int minuten = Integer.parseInt(eingabe);
		
		// Verarbeitung
		int sekunden = minuten * 60;
		
		// Ausgaben: Ergebnis anzeigen
		JOptionPane.showMessageDialog(null, minuten + " Minuten sind " + sekunden + " Sekunden.");
	}

}
