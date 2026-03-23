package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _08_Namenausgeben {

	public static void main(String[] args) {
		String namen = JOptionPane.showInputDialog("Bitte gib einen Namen ein, "
				+ "der wiederholt ausgegeben werden soll.");
		
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die Anzahl der Wiederholungen ein."));
		
		String ausgabe = "";
		final int MIN_WIEDERHOLUNGEN = 0;
		final int MAX_WIEDERHOLUNGEN = 30;
		
		if(anzahl > MAX_WIEDERHOLUNGEN || anzahl <= MIN_WIEDERHOLUNGEN) {
			JOptionPane.showMessageDialog(null, "Bitte gib nur eine Wiederholungsanzahl zwischen 1 und 30 ein.");
		} else {
			for(int i = 1; i <= anzahl; i++) {
				ausgabe += i + ": " + namen + "\n";
			}
			JOptionPane.showMessageDialog(null, ausgabe);
		}

	}

}
