package tag04_05_uebungen;

import javax.swing.JOptionPane;

public class _02_1_ZahlenratenVerbessert {

	public static void main(String[] args) {
		final int MAX_RATEZAHL = 30;
		
		int zielZahl = (int) (Math.random() * MAX_RATEZAHL) + 1;
		String ratezahl = "";
		int versuche = 0;
		int zahl = 0;
		
		System.out.println(zielZahl);
		
		boolean hatGewonnen = false;
		boolean hatAbgebrochen = false;

		
		final int ANZAHL_ABBRUCHFRAGE = 10;
		final int ANZAHL_ABBRUCH = 30;

		JOptionPane.showMessageDialog(null, "Herzlich Willkommen zum Zahlenrate-Spiel! Viel Spaß beim Raten.");

		do {
			ratezahl = JOptionPane.showInputDialog("Bitte gib eine Zahl ein: ");
			if (ratezahl.isBlank()) {
				JOptionPane.showMessageDialog(null, "Bitte eine Zahl eingeben!!");
			} else {
				zahl = Integer.parseInt(ratezahl);
				versuche++;
				if (zahl == zielZahl) {
					hatGewonnen = true;
				} else {
					switch (versuche) {
					case ANZAHL_ABBRUCHFRAGE:
						String eingabe = JOptionPane
								.showInputDialog("Möchtest du abbrechen? " + "Antworte mit \"ja\" oder \"nein\".")
								.trim();
						hatAbgebrochen = eingabe.equalsIgnoreCase("ja");
						break;
					case ANZAHL_ABBRUCH:
						JOptionPane.showMessageDialog(null, "Für deine Gesundheit wird das Spiel beendet."
								+ " Starte es erneut, wenn du wieder spielen willst.");
						hatAbgebrochen = true;
						break;
					}
				}
			}

		} while (!hatGewonnen && !hatAbgebrochen);

		if (hatGewonnen) {
			JOptionPane.showMessageDialog(null, "Erfolgreich erraten! Bis zum nächsten mal.");
		} else {
			JOptionPane.showMessageDialog(null, "Leider nicht gewonnen. Bis zum nächsten mal.");
		}
	}
}
