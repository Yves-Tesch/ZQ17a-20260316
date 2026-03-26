package tag07_grundlagen._04_Ueberladen;

public class Auto {
	String marke;
	int leistung;
	String farbe;
	
	public void setzeDetails(int leistung) {
		this.leistung = leistung;
	}
	
	public void setzeDetails(String marke, int leistung) {
		this.marke = marke;
		this.leistung = leistung;
	}
	
	public void setzeDetails(String marke, int leistung, String farbe) {
		this.marke = marke;
		this.leistung = leistung;
		this.farbe = farbe;
	}
}
