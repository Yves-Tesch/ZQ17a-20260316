package tag06_grundlagen._01_Klassen._02_eigeneMainKlasse;

public class Auto {
	// Attribute / Eigenschaften (property) / Felder (fields) nennt man auch Zustände
	
	// Instanzattribut / Objektattribut
	String marke = "unbekannt";
	int ps = 0;
	
	// Instanzmethode
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}
}
