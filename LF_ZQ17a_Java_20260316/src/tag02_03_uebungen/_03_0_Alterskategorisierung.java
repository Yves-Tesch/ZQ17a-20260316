package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _03_0_Alterskategorisierung {

	public static void main(String[] args) {
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib bitte dein Alter ein: "));
		
		if(alter >= 0 && alter <= 12) {
			JOptionPane.showMessageDialog(null, "Du bist ein Kind.");
		} else if (alter <= 19) {
			JOptionPane.showMessageDialog(null, "Du bist ein Teenager.");
		} else if (alter <= 64) {
			JOptionPane.showMessageDialog(null, "Du bist ein Erwachsener.");
		} else if (alter <= 120) {
			JOptionPane.showMessageDialog(null, "Du bist ein Senior.");
		} else {
			JOptionPane.showMessageDialog(null, "Ungültige Eingabe.");
		}

	}

}
