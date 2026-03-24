package tag07_uebungen;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		Kreis meinKreis = new Kreis(
				Double.parseDouble(JOptionPane.showInputDialog("Bitte gib einen Radius für den Kreis ein: ")));
		
		System.out.println("Der Radius des Kreises beträgt: " + meinKreis.getRadius()
				+ "\nDer Umfang beträgt: " + String.format("%.2f",meinKreis.getUmfang())
				+ "\nDie Fläche beträgt: " + String.format("%.2f",meinKreis.getFlaeche()));

	}

}
