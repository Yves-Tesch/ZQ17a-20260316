package tag07_uebungen._06;

import javax.swing.JOptionPane;

public class Kreistabelle {

	public static void main(String[] args) {
		final int ANZAHL_ZEILEN = 30;
		final double RADIUS_ERHOEHUNG;
		
		
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Bitte gib den Startradius ein: "));
		RADIUS_ERHOEHUNG = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Radius-Erhöhung ein: "));
		
		Kreis myCircle = new Kreis(radius);
		
		System.out.println("Radius:\t\tUmfang:\t\tFläche" );
		for(int i = 0; i < ANZAHL_ZEILEN; i++) {
			System.out.println(String.format("%.2f", myCircle.getRadius())
					+ "\t\t" + String.format("%.2f", myCircle.getUmfang())
					+ "\t\t" + String.format("%.2f", myCircle.getFlaeche()));
			myCircle.setRadius(myCircle.getRadius() + RADIUS_ERHOEHUNG);
		}

	}

}
