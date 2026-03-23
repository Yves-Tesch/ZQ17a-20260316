package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _09_Fakultaet {

	public static void main(String[] args) {
		int ausgabe = 1;
		
		final int ZAHL = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine Zahl zwischen 0 um 10 ein:"));
		
		if(ZAHL >= 0 && ZAHL <= 10) {
			for(int i = 2; i <= ZAHL; i++) {
				ausgabe *= i;
			}
			
			JOptionPane.showMessageDialog(null, "Das Ergebnis der " + ZAHL + "! ist: " + ausgabe);
		} else {
			JOptionPane.showMessageDialog(null, ZAHL + " ist nicht gültig.");
		}
	}
}
