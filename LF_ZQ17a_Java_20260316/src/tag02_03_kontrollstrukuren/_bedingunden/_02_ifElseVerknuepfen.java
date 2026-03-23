package tag02_03_kontrollstrukuren._bedingunden;

public class _02_ifElseVerknuepfen {

	public static void main(String[] args) {
		boolean istAngemeldet = true;
		boolean istAdministrator = false;
		boolean hatMitgliedschaft = true;
		boolean istMitgliedschaftGueltig = false;
		
		if(istAngemeldet && (istAdministrator || (hatMitgliedschaft && istMitgliedschaftGueltig))) {
			System.out.println("Zugriff gewährt.");
		} else {
			System.out.println("Zugriff verweigert.");
		}

	}

}
