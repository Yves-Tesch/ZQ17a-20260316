package tag08_09.grundlagen._05_AbstrakteKlassen;

public abstract class Fahrzeug {
	protected String marke;
	protected int geschwindigkeit;
	
	public Fahrzeug() {}
	
	public Fahrzeug(String marke, int geschwindigkeit) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
	}
	
	// Abstrakte Methode, die von der Unterklasse implementiert werden muss
	public abstract void zeigeDetails();
	
	// Konkrete Methoden können von Unterklassen direkt verwendet werden, da sie bereits eine Implementierung besitzen
	public void beschleunigen(int zusatzGeschwindigkeit) {
		geschwindigkeit += zusatzGeschwindigkeit;
		System.out.println("Beschleunigung auf: " + geschwindigkeit + "km/h");
	}

}
