package tag08_09.grundlagen._04_superVerwenden;

public class Motorrad extends Fahrzeug {
	boolean helmpflicht;
	
	public Motorrad(String marke, int geschwindigkeit, boolean helmpflicht) {
//		this.marke = marke;
//		this.geschwindigkeit = geschwindigkeit;
		// Konstruktor der Oberklasse mit zwei Parametern (String, int)
		// wird aufgerufen, ersetzt Zeile 7 und 8
		super(marke, geschwindigkeit);
		this.helmpflicht = helmpflicht;
	}
	
	@Override 
	public void zeigeDetails() {
		// Aufruf der Methode der Oberklasse / Superklasse...
		super.zeigeDetails();
		System.out.println("Helmpflicht: " + (helmpflicht ? "Ja" : "Nein"));
	}
}
