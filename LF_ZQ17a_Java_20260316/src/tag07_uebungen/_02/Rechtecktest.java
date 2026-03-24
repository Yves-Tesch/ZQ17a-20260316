package tag07_uebungen._02;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		Rechteck r1 = new Rechteck(
				Double.parseDouble(JOptionPane.showInputDialog("Bitte Länge eingeben: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Bitte Breite eingeben: ")));
		
		System.out.println(
			"Lange Seite: " + r1.getLangeSeite()
			+ "\nKurze Seite: " + r1.getKurzeSeite()
			+ "\nFläche: " + String.format("%.2f",r1.getFlaeche())
			+ "\nUmfang: " + String.format("%.2f",r1.getUmfang())
			+ "\nDiagonale: " + String.format("%.2f",r1.getDiagonale()));		
	}
}
