package tag08_09.grundlagen._03_staticVerwenden._03_statischerInitialisierer;

public class Datenbankverbindung {
	private static String datenbankUrl;
	private static String benutzername;
	private static String passwort;
	
	// Statischer Initialisierungsblock
	static {
		System.out.println("Statische Initialisierung wird ausgeführt...");
		datenbankUrl = "jdbc:mysql://localhost:3306/meineDatenbank";
		benutzername = "root";
		passwort = "geheim";
	}
	
	public static void zeigeVerbindungseinstellungen() {
		System.out.println("Datenbank-URL: " + datenbankUrl);
		System.out.println("Benutzernamen: " + benutzername);
		System.out.println("Passwort: ****");
	}
}
