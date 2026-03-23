package tag01_uebungen;

import javax.swing.JOptionPane;

public class _07_Zeitumrechnung {

	public static void main(String[] args) {
		//Eingabe
		long millisekunden = Long.parseLong(JOptionPane.showInputDialog("Gib die Millisekunden ein: "));
		
		//Konstanten für die Umrechnung
		final long SEKUNDEN = 1000;			// 1 Sekunde = 1000 Millisekunden
		final long MINUTEN = 60 * SEKUNDEN;	// 1 Minute = 60 Sekunden
		final long STUNDEN = 60 * MINUTEN;	// 1 Stunde = 60 Minuten
		final long TAG = 24 * STUNDEN;		// 1 Tag = 24 Stunden
		final double JAHR = 365.2425 * TAG;	// 1 Jahr sind durchschnittlich 365.2425 Tage im gregorianischen Kalender
		
		//Berechnung Jahre
		long jahre = (long)(millisekunden / JAHR);
		long rest = (long)(millisekunden % JAHR);
		
		//Berechnung der Tage
		long tage = rest / TAG;
		rest = rest % TAG;
		
		//Berechnung der Stunden
		long stunden = rest / STUNDEN;
		rest = rest % STUNDEN;
		
		//Berechnung der Minuten
		long minuten = rest / MINUTEN;
		rest = rest % MINUTEN;
		
		//Berechnung der Sekunden
		long sekunden = rest / SEKUNDEN;
		rest = rest % SEKUNDEN;
		
		//Berechnung der Millisekunden
		long millisekundenRest = rest % SEKUNDEN;
		
		
		//Ausgabe
		JOptionPane.showMessageDialog(null, millisekunden + " Millisekunden entsprechen: \n"
				+ jahre + " Jahre, "
				+ tage + " Tage, "
				+ stunden + " Stunden, "
				+ minuten + " Minuten, "
				+ sekunden + " Sekunden, "
				+ millisekundenRest + " Millisekunden");
		
		
		
		

	}

}
