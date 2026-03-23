package tag06_grundlagen.uebungen._03;

public class Profil {
	String vorname;
	String nachname;
	String geburtstag;
	
	void zeigeProfil() {
		System.out.println("Vorname: " + vorname);
		System.out.println("Nachname: " + nachname);
		System.out.println("Geburtsdatum: " + geburtstag);
	}
}
