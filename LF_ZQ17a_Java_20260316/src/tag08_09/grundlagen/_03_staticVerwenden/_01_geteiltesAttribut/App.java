package tag08_09.grundlagen._03_staticVerwenden._01_geteiltesAttribut;

public class App {

	public static void main(String[] args) {
		Benutzer benutzer1 = new Benutzer("Alice");
		Benutzer benutzer2 = new Benutzer("Bob");
		Benutzer benutzer3 = new Benutzer("Charlie");
		
		//System.out.println(Benutzer.getBenutzerZaehler());
		System.out.println(Benutzer.getBenutzerZaehler());
	}

}
