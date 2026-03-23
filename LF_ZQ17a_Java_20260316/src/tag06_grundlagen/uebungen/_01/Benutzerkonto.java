package tag06_grundlagen.uebungen._01;

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
	
	void zeigeStatus() {
		System.out.println("Benutzername: " + benutzername);
		System.out.println("E-Mail: " + email);
		System.out.println("Konto aktiv: " + (aktiv ? "Ja" : "Nein"));
	}
		
}
