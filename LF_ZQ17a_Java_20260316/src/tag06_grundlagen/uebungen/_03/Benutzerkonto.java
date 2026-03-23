package tag06_grundlagen.uebungen._03;

public class Benutzerkonto {
	String benutzername = "";
	String email = "";
	boolean aktiv = false;
	Profil profil = null;
	
	void kontoAktivieren() {
		aktiv = true;
		System.out.println("Das Benutzerkonto wurde aktiviert.");
	}
	
	void kontoDeaktivieren() {
		aktiv = false;
		System.out.println("Das Benutzerkonto wurde deaktiviert.");
	}
	
	void aendereEmail(String neueEmail) {
		email = neueEmail;
		System.out.println("Die E-Mail wurde erfolgreich geändert zu: " + email);
	}
	
	boolean validiereBenutzernamenUndEmail(String parBenutzername, String parEmail) {
		if(benutzername.equals(parBenutzername) && email.equals(parEmail)) {
			return true;
		} else {
			return false;
		}
	}
	
	void speichereProfil(Profil parProfil) {
		profil = parProfil;
		System.out.println("Profil wurde hinzugefügt.");
	}
	
	void zeigeStatus() {
		System.out.println("Benutzername: " + benutzername);
		System.out.println("E-Mail: " + email);
		System.out.println("Konto aktiv: " + (aktiv ? "Ja" : "Nein"));
		if (profil != null) {
			profil.zeigeProfil(); 
		} else {
			System.out.println("Kein Profil vorhanden.");
		}
	}
		
}
