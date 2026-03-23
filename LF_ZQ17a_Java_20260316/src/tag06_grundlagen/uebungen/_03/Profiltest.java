package tag06_grundlagen.uebungen._03;

public class Profiltest {

	public static void main(String[] args) {
		Benutzerkonto meinKonto = new Benutzerkonto();
		
		meinKonto.benutzername = "max.mustermann";
		meinKonto.email = "max.mustermann@example.com";
		meinKonto.aktiv = true;
		
		// Profil erzeugen
		Profil profil = new Profil();
		profil.vorname = "Max";
		profil.nachname = "Mustermann";
		profil.geburtstag = "01.01.1970";
		
		meinKonto.zeigeStatus();
		
		System.out.println("\n");
		
		meinKonto.speichereProfil(profil);
		
		meinKonto.zeigeStatus();

	}

}
