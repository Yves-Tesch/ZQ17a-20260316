package tag08_09.uebungen._02;

public class Konto {
	protected String kontonummer;
	protected double kontostand;
	
	public Konto () {}
	
	public Konto (String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}

	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}
	
	public void auszahlen(double betrag) {
		this.kontostand -= betrag;
	}
	
	public String getKontonummer() {
		return kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}
		
}
