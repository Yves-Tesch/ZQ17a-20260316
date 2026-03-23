package tag02_03_kontrollstrukuren._bedingunden;

public class _02_ifElse {

	public static void main(String[] args) {
		// Verzweigungen werden in Java durch if und if-else gebildet. (Der ternäre-Operator gehört auch dazu!)
		// Es muss zu einem if kein else geben, else ist optional. 
		
		int zahl1 = 20;
		int zahl2 = 5;
		
		if(zahl1 == zahl2) {
			System.out.println("zahl1 ist gleich zahl2");
		}
		
		if (zahl1 != zahl2) {
			System.out.println("zahl1 ist nicht gleich zahl2");
		}
		
		// Bei Bedingungen, die sowohl true und false - Fälle definieren, sollte man if-else verwenden
		// Diese Schreibweise ist ebenfalls effizienter, da Java nicht mehrere Fälle prüfen muss
		if(zahl1 == zahl2) {
			System.out.println("zahl1 ist gleich zahl2");
		} else {
			System.out.println("zahl1 ist nicht gleich zahl2");
		}
		
		
		

	}

}
