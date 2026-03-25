package tag07_uebungen._05;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
//		Kreis meinKreis = new Kreis(
//				Double.parseDouble(JOptionPane.showInputDialog("Bitte gib einen Radius für den Kreis ein: ")));
//		
//		System.out.println("Der Radius des Kreises beträgt: " + meinKreis.getRadius()
//				+ "\nDer Umfang beträgt: " + String.format("%.2f",meinKreis.getUmfang())
//				+ "\nDie Fläche beträgt: " + String.format("%.2f",meinKreis.getFlaeche()));
		
		Kreis meinKreis = new Kreis();
		
		double umfang = Double.parseDouble(JOptionPane.showInputDialog("Bitte gib einen Umfang ein, "
				+ "um den Radius des Kreises zu berechnen:"));
		
		meinKreis.setRadiusByUmfang(umfang);
		
		System.out.println("Radius des Kreises mit dem Umfang " + umfang 
				+ " beträgt: " + String.format("%.2f", meinKreis.getRadius()));
		
		double flaeche = Double.parseDouble(JOptionPane.showInputDialog("Bitte gib eine Fläche ein, um den Radius"
				+ "des Kreises zu berechnen: "));
		
		meinKreis.setRadiusByFlaeche(flaeche);
		System.out.println("Radius des Kreises mit der Flaeche " + flaeche
				+ " beträgt: " + String.format("%.2f", meinKreis.getRadius()));
		

	}

}
