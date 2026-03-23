package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _03_1_Alterskategorisierung {

	public static void main(String[] args) {
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib bitte dein Alter ein: "));

		if(alter < 0 || alter >= 120) {
			JOptionPane.showMessageDialog(null, "Bitte gültiges Alter eingeben, dass größer 0 ist und kleiner 120.");
		} else {
			String kategorie;
			if(alter <= 12) {
				kategorie = "Kind";
			} else if(alter <= 19) {
				kategorie = "Teenager";
			} else if(alter <= 64) {
				kategorie = "Erwachsener";
			} else {
				kategorie = "Senior";
			}
			JOptionPane.showMessageDialog(null, "Du bist ein " + kategorie + ".");
		}
	}
}
