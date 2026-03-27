package tag08_09.grundlagen._06_Interfaces;

public abstract class Fahrzeug implements KannBeschleunigen {
	String marke;
	int geschwindigkeit;
	
	public Fahrzeug(String marke, int geschwindigkeit) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Geschwindigkeit: " + geschwindigkeit + "km/h");
	}
	
//	@Override
//	public void beschleunigen(int zusatzGeschwindigkeit) {
//		geschwindigkeit += zusatzGeschwindigkeit;
//		System.out.println("Fahrzeug beschleunigt auf " + geschwindigkeit + "km/h");
//	}

}
