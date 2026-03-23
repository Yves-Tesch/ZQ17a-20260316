package tag06_grundlagen._02_Methoden._03_aufrufArgumente;

public class Auto {
	
	// Instanzattribut / Objektattribut
	String marke = "unbekannt";
	int ps = 0;
	
	// Instanzmethode
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}
	
	
	// Methode zum Setzen der Fahrzeugdetails
	// parameterMarke & parameterPS sind (Übergabe)Parameter, 
	// die die Methode verwendet
	void setzeDetails(String parameterMarke, int parameterPs) {
		marke = parameterMarke;
		ps = parameterPs;
	}
}
