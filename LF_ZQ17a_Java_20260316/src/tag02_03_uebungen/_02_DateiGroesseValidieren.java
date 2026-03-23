package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _02_DateiGroesseValidieren {

	public static void main(String[] args) {
		double kilobyte = Double.parseDouble(JOptionPane.showInputDialog("Gib die Größe in Kilobyte ein: "));
		
		if (kilobyte < 0) {
			JOptionPane.showMessageDialog(null, "Bitte gib eine positive Zahl ein.");
		} else {
			double megabyte = kilobyte / 1000; 
			double bytes = kilobyte * 1000;
			
			JOptionPane.showMessageDialog(null, String.format("%.2f", kilobyte) + " KB entsprechen "
					+ String.format("%.2f", megabyte) + " MB und "
					+ String.format("%.2f", bytes) + " Bytes.");
		}

	}

}
