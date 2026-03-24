package tag07_uebungen._02;

public class Rechteck {
	private double laenge;
	private double breite;
	
	public Rechteck() {
		laenge = 0;
		breite = 0;
	}
	
	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	public double getLaenge() {
		return laenge;
	}
	
	public double getBreite() {
		return breite;
	}
	
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	
	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	public void setSeiten(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	public double getLangeSeite() {
		if(laenge > breite) return laenge;
		else return breite;
	}
	
	public double getKurzeSeite() {
		if(laenge < breite) return laenge;
		else return breite;
	}
	
	public double getDiagonale() {
		return Math.sqrt(laenge * laenge + breite * breite);
	}
	
	public double getFlaeche() {
		return laenge * breite;
	}
	
	public double getUmfang() {
		return laenge * 2 + breite * 2;
	}
}
