package tag08_09.grundlagen._03_staticVerwenden._01_geteiltesAttribut;

public class Benutzer {
	private String name;
	private static int benutzerZaehler = 0;
	
	// Konstruktor
	public Benutzer(String name) {
		this.name = name;
		benutzerZaehler++;
	}
	
	public static int getBenutzerZaehler() {
		return benutzerZaehler;
	}
}
