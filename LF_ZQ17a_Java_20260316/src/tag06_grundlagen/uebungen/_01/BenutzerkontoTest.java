package tag06_grundlagen.uebungen._01;

public class BenutzerkontoTest {

	public static void main(String[] args) {
		Benutzerkonto meinKonto = new Benutzerkonto();
		
		meinKonto.benutzername = "max.mustermann";
		meinKonto.email = "max.mustermann@example.com";
		
		meinKonto.zeigeStatus();
		
		System.out.println();
		
		meinKonto.kontoAktivieren();
		meinKonto.zeigeStatus();
		
		System.out.println();
		
		meinKonto.kontoDeaktivieren();
		meinKonto.zeigeStatus();
	}
}
