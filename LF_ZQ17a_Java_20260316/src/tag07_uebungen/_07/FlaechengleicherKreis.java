package tag07_uebungen._07;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {

	public static void main(String[] args) {
		double rLaenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Länge des Rechtecks ein:"));
		double rBreite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite des Rechtecks ein:"));
		
		Rechteck meinRechteck = new Rechteck(rLaenge, rBreite);
		
		Kreis meinKreis = new Kreis();
		
		meinKreis.setRadiusByFlaeche(meinRechteck.getFlaeche());
		
		System.out.println("Rechtecklänge: "+ meinRechteck.getLaenge()
			+ "\nRechteckbreite: " + meinRechteck.getBreite()
			+ "\nRechteckfläche: " + meinRechteck.getFlaeche()
			+ "\n\nKreisradius: " + String.format("%.2f", meinKreis.getRadius())
			+ "\nKreisfläche: " + meinKreis.getFlaeche());

	}

}
