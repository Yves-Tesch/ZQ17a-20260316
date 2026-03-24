package tag06_grundlagen.uebungen._04;

public class Kunde {
	String vorname;
	String nachname;
	
	void setzeDetails(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	String zeigeName() {
		return vorname + " " + nachname;
	}
	
	
}
