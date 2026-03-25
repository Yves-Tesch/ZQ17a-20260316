package tag07_uebungen._04;

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
		
		r1.laengeAusgaben();
		
		r1.laengeVergroessern(5);
		System.out.println("Länge wurde um 5 vergrößert: " + String.format("%.2f", r1.getLaenge()));
		
		r1.laengeVerkuerzen(2);
		System.out.println("Länge wurde um 2 verkürzt." + String.format("%.2f", r1.getLaenge()));
		
		r1.breiteVergroessern(3);
		System.out.println("Breite wurde um 3 vergrößert: " + String.format("%.2f", r1.getBreite()));
		
		r1.breiteVerkuerzen(2);
		System.out.println("Breite wurde um 2 verkürzt: " + String.format("%.2f", r1.getBreite()));
	}
}
