package tag01_grundlagen;

import javax.swing.JOptionPane;

public class _09_EinUndAusgabeUeberGUI {

	public static void main(String[] args) {
		// Eingabe
		String name = JOptionPane.showInputDialog("Gib deinen Namen ein: ");
		
		// Ausgabe
		JOptionPane.showMessageDialog(null, "Hallo " + name + "! Schön, dass du hier bist.");

	}

}
