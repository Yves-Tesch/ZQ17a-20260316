package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _05_Notenbewertung {

	public static void main(String[] args) {
		// Eingabe
		int note = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Note ein: "));
		
		// Verarbeitung
		String ergebnis = (note < 1 || note > 6) 
				? "Bitte nur Noten von 1-6 eingeben." 
				: (note <= 4) 
					? "Bestanden" 
					: "Nicht bestanden";
		
		//Ausgabe
		JOptionPane.showMessageDialog(null, "Deine Note ist: " + note + " - " + ergebnis);
		
		

	}

}
