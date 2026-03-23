package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _06_RabattBerechnung {

	public static void main(String[] args) {
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Gib dein Alter ein: "));
		
		if (alter < 0) {
			JOptionPane.showMessageDialog(null, "Ungültiges Alter! Bitte positive Zahl eingeben.");
		} else {
			double preis = Double.parseDouble(JOptionPane.showInputDialog("Gib einen Preis ein:"));
			int rabattProzent = alter < 18 ? 20 : 10;
			
			double rabattBetrag = preis * rabattProzent / 100;
			double endPreis = preis - rabattBetrag;
			
			JOptionPane.showMessageDialog(null, "Du erhälst " + rabattProzent + "% Rabatt. Der Endpreis"
					+ " beträgt: " + String.format("%.2f", endPreis) + "€");
		}
		

	}

}
