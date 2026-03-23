package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _04_Discoeinlass {

	public static void main(String[] args) {
		String istAltGenug = JOptionPane.showInputDialog("Bist du 18 oder älter?").toLowerCase();
		
		String willkommen = "Herzlichen Willkommen in der Disco! ";
		
		if(istAltGenug.equals("ja")) {
			String istVIP = JOptionPane.showInputDialog("Bist du VIP?").toLowerCase();
			String istFrau = JOptionPane.showInputDialog("Bist du eine Frau?").toLowerCase();
			
			if(istVIP.equals("ja") && istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null, willkommen + "Viel Spaß in der VIP-Lounge!"
						+ "Heute ist Ladies-Night. Du bekommst 15% Rabatt auf die Getränke.");
			} else if (istVIP.equals("ja")) {
				JOptionPane.showMessageDialog(null, willkommen + "Viel Spaß in der VIP-Lounge!");
			} else if (istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null, willkommen + "Heute ist Ladies-Night. "
						+ "Du bekommst 15% Rabatt auf die Getränke.");
			} else {
				JOptionPane.showMessageDialog(null, willkommen);
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Du kommst hier nicht rein!");
		}
	}
}
