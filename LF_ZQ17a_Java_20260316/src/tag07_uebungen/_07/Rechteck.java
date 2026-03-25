package tag07_uebungen._07;

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
	
	public void laengeAusgaben() {
		double laenge = 5.4;
		// laenge ist eine lokale Variable. Es tritt SHADOWING auf, da die Ausgabe auf die lokale Variable
		// laenge zugreift.
		System.out.println("Länge:" + laenge);
	}
	
	public void laengeVergroessern(double laenge) {
		this.laenge += laenge;
	}
	
	public void breiteVergroessern(double breite) {
		this.breite += breite;
	}
	
	public void laengeVerkuerzen (double laenge) {
		this.laenge -= laenge;
	}
	
	public void breiteVerkuerzen (double breite) {
		this.breite -= breite;
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
	
	
}
