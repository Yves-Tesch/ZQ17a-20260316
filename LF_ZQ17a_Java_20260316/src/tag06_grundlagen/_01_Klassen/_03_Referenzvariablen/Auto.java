package tag06_grundlagen._01_Klassen._03_Referenzvariablen;

public class Auto {
	// Attribute / Eigenschaften (property) / Felder (fields) nennt man auch Zustände
	
	// Instanzattribut / Objektattribut
	String marke = "unbekannt";
	int anzahlTueren = 0;
	
	// Variablen von Objekten einer Klasse nennt man Referenzvariable
	// Auf Attribute / Methoden des Objekts kann mit dem "." - Operator zugegriffen werden,
	// sofern diese verfügbar (erreichbar, sichtbar) sind
	
	// Ebenfalls erkennbar ist der Referenztyp, Referentypen können Klassen, abstrakte Klassen, Interfaces
	// und Enums sein
	
	// Der Referenztyp definiert die Art der Objekte, die auf die Referenzverariable verweisen kann
	// Der Referenztyp bestimmt die zur Verfügung stehenden Methoden und Attribute, die über die Referenz 
	// aufgerufen werden
	
	Motor meinMotor = new Motor();
	
	// Instanzmethode
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Anzahl Türen: " + anzahlTueren);
		System.out.println("Motorleistung: " + meinMotor.leistung);
		System.out.println("Typ: " + meinMotor.typ);
	}
}
