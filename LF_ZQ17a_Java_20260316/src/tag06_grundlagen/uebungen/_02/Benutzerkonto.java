package tag06_grundlagen.uebungen._02;

public class Benutzerkonto {
	String benutzername = "";
	String email = "";
	boolean aktiv = false;
	
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
	
	void zeigeStatus() {
		System.out.println("Benutzername: " + benutzername);
		System.out.println("E-Mail: " + email);
		System.out.println("Konto aktiv: " + (aktiv ? "Ja" : "Nein"));
	}
		
}
