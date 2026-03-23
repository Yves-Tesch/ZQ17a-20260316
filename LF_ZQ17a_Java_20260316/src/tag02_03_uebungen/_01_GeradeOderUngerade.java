package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _01_GeradeOderUngerade {

	public static void main(String[] args) {
		// Eingabe
		int zahl = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl ein: "));
		
		// Verarbeitung
		if(zahl % 2 == 0) {
			JOptionPane.showMessageDialog(null, zahl + " ist eine gerade Zahl.");
		} else {
			JOptionPane.showMessageDialog(null, zahl + " ist eine ungerade Zahl.");
		}
	}
}
