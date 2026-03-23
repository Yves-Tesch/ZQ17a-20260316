package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _04_DiscoEinlass2 {
	public static void main(String[] args) {
		boolean istAltGenug = JOptionPane.showInputDialog("Bist du 18 oder älter?").toLowerCase().equals("ja");

		String willkommen = "Herzlichen Willkommen in der Disco! ";
		String vipLounge = "Viel Spaß in der VIP-Lounge!";
		String ladiesNight = "Heute ist Ladies-Night. Du bekommst 15% Rabatt auf die Getränke.";

		// Guard Clause
		if (!istAltGenug) {
			JOptionPane.showMessageDialog(null, "Du kommst hier nicht rein!");
			return;
		}
		
		boolean istVIP = JOptionPane.showInputDialog("Bist du VIP?").toLowerCase().equals("ja");
		boolean istFrau = JOptionPane.showInputDialog("Bist du eine Frau?").toLowerCase().equals("ja");

		if (istVIP && istFrau) {
			JOptionPane.showMessageDialog(null, willkommen + vipLounge + ladiesNight);
		} else if (istVIP) {
			JOptionPane.showMessageDialog(null, willkommen + vipLounge);
		} else if (istFrau) {
			JOptionPane.showMessageDialog(null,
					willkommen + ladiesNight);
		} else {
			JOptionPane.showMessageDialog(null, willkommen);
		}
	}
}