package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _12_Zahlenreihenfolge {
	
	public static void main(String[] args) {
		// Eingabe
		int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die erste Zahl ein: "));
		int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein: "));
		int zahl3 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die dritte Zahl ein: "));
		
		// Variablen zum Speichern der sortierten Zahlen
		int kleinste, mittlere, groesste;
		
		if(zahl1 <= zahl2 && zahl1 <= zahl3) {
			kleinste = zahl1;
			if(zahl2 <= zahl3) {
				mittlere = zahl2;
				groesste = zahl3;
			} else {
				mittlere = zahl3;
				groesste = zahl2;
			}
		} else if(zahl2 <= zahl1 && zahl2 <= zahl3) {
			kleinste = zahl2;
			if(zahl1 <= zahl3) {
				mittlere = zahl1;
				groesste = zahl3;
			} else {
				mittlere = zahl3;
				groesste = zahl2;
			}
		} else {
			kleinste = zahl3;
			if(zahl1 <= zahl2) {
				mittlere = zahl1;
				groesste = zahl2;
			} else {
				mittlere = zahl2;
				groesste = zahl3;
			}
		}
		
		// Ausgabe
		JOptionPane.showMessageDialog(null, "Die Zahlen in aufsteigender Reihenfolge: \n"
				+ kleinste + " " + mittlere + " " + groesste);
	}
}
