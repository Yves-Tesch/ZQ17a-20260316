package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _10_DateiGroessenBerechnen {

	public static void main(String[] args) {
		int anzahlDateien = 0;
		double gesamtGroesseKB = 0;
		
		anzahlDateien = Integer.parseInt(JOptionPane.showInputDialog("Gib die Anzahl der Dateien ein: "));
		
		for(int i = 1; i <= anzahlDateien; i++) {
			gesamtGroesseKB += Double.parseDouble(JOptionPane.showInputDialog("Gib die Größe der Datei " + i 
					+ " in Kilobyte ein: "));
		}
		
		double gesamtGroesseMB = gesamtGroesseKB / 1000;
		double gesamtGroesseGB = gesamtGroesseMB / 1000;
		
		JOptionPane.showMessageDialog(null, String.format("Die Gesamtgröße der Dateien beträgt: \n"
				+ "%.2f KB\n"
				+ "%.2f MB\n"
				+ "%.2f GB", 
				gesamtGroesseKB, gesamtGroesseMB, gesamtGroesseGB));

	}

}
