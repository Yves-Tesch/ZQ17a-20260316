package tag06_grundlagen.uebungen._02;

public class BenutzerkontoTest {

	public static void main(String[] args) {
		Benutzerkonto meinKonto = new Benutzerkonto();
		
		meinKonto.benutzername = "max.mustermann";
		meinKonto.email = "max.mustermann@example.com";
		meinKonto.kontoAktivieren();
		meinKonto.zeigeStatus();
		
		System.out.println();
		
		
		meinKonto.aendereEmail("max.muster_neu@example.com");
		
		System.out.println();
		
		System.out.println("Konto Validierung mit: max.mustermann, max.mustermann_neu@example.com");
		boolean istGueltig = meinKonto.validiereBenutzernamenUndEmail("max.mustermann", "max.muster_neu@example.com");
		System.out.println("Validierung erfolgreich: " + (istGueltig ? "Ja" : "Nein"));
		
		
		System.out.println();
		
		System.out.println("Konto Validierung mit: max.mustermann2, max.mustermann_neu@example.com");
	    istGueltig = meinKonto.validiereBenutzernamenUndEmail("max.mustermann2", "max.muster_neu@example.com");
		System.out.println("Validierung erfolgreich: " + (istGueltig ? "Ja" : "Nein"));
		
		
		
		
	}
}
