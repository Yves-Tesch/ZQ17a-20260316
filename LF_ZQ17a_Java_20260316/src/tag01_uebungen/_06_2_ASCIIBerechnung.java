package tag01_uebungen;

import javax.swing.JOptionPane;

public class _06_2_ASCIIBerechnung {

	public static void main(String[] args) {
		//Eingabe
		String eingabe = JOptionPane.showInputDialog("Gib ein einzelnes Zeichen ein von 0 bis 9: ");
		char zeichen1 = eingabe.charAt(0);
		
		
		
		int zifferWert = (int)zeichen1 - (int)'0';
		
		System.out.println((int)'0');
		
		int ergebnis = zifferWert * 10;
		
		// Ausgabe
		JOptionPane.showMessageDialog(null, "Das Zehnfache von " + zifferWert + " beträgt: " + ergebnis);

	}

}
