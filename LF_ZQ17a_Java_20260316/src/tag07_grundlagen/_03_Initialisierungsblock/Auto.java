package tag07_grundlagen._03_Initialisierungsblock;

public class Auto {
	// Der Initializer - Block wird verwendet, um gemeinsame Intialisierungslogik für alle Kontruktoren der Klasse zu erstellen
	
	// Zentralisieren die Initialisierungslogik, was wiederrum zu besserer Lesbarkeit und Wartbarkeit führt
	
	// Der Initialisierungsblock wird realisiert, indem man eine geschweifte Klammer auf und eine zu schreibt
	
	String marke;
	int leistung;
	
	// Initialisierungsblock
	{
		leistung = 100;
	}
	
	public Auto() {
		this("Unbekannt");
	}
	
	public Auto(String marke) {
		this.marke = marke;
	}
	
	public Auto(String marke, int leistung) {
		this.marke = marke;
		this.leistung = leistung;
	}
	
	
}
