package tag02_03_kontrollstrukuren._bedingunden;

public class _02_ifElseTiefVerschachtelt {

	public static void main(String[] args) {
		boolean istAngemeldet = true;
		boolean istKontoGueltig = false;
		boolean istVIP = true;
		double warenwert = 49.9;
		
		if(istAngemeldet) {
			if(istKontoGueltig) {
				if(istVIP) {
					System.out.println("Bestellung möglich: VIP-Kunde");
				} else {
					if(warenwert >= 50) {
						System.out.println("Bestellung möglich. Warenwert ausreichend.");
					} else {
						System.out.println("Bestellung nicht möglich. Mindestbestellwert nicht erreicht.");
					}
				}
			} else {
				System.out.println("Bestellung ist nicht möglich, weil Konto ungültig.");
			}
		} else {
			System.out.println();
		}
		
		
	}
}
