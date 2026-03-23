package tag06_grundlagen._03_Objekte._01_Objektlebensdauer;

public class Auto {
	
	// Instanzattribut / Objektattribut
	String marke = "unbekannt";
	int ps = 0;
	
	// Instanzmethode
	// Wenn man Methoden verwenden, die Daten zurück geben, dann benötigt man
	// das Keyword "return". Wenn wir return verwenden, muss der Rückgabetyp
	// den Datentyp haben, wie das, was return zurück gibt
	// Der Rückgabetyp steht vor dem Methodennamen
	// Wenn die Methode nichts zurück gibt, verwendet void
	// Sobald man return verwendet, muss es einen Rückgabetypen (also nicht void) geben!
	String zeigeDetails() {
		String details = "Marke: " + marke + "\nPS: " + ps + " PS";
		return details;
	}
	
	
	// Methode zum Setzen der Fahrzeugdetails
	// parameterMarke & parameterPS sind (Übergabe)Parameter, 
	// die die Methode verwendet
	void setzeDetails(String parameterMarke, int parameterPs) {
		marke = parameterMarke;
		ps = parameterPs;
	}
}
