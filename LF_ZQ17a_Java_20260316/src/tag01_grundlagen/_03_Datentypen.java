package tag01_grundlagen;

public class _03_Datentypen {
	
	public static void main(String[] args) {
		// Primitiven Datentypen
		
		// Ganzzahl - Datentypen
		byte a1 = 110;
		short a2 = 13;
		int a3 = 42; 		// wenn nicht anders notwendig, immer int verwenden
		long a4 = 50221L;   //Bei einem Long-Wert muss ein "l" oder "L" ergänzt werden, um den Compiler klar zu machen, dass es ein long ist
		
		// Dezimal - Datentypen
		// Dezimaltrennzeichen ist ein Punkt, kein Komma
		// Achtung: Man sollte bei float und double niemals auf Gleichheit (==) prüfen, da Datentypen ungenau sind
		float b1 = 3421.55F;
		double b2 = 11.5212; // Standardmäßig immer double verwenden!
		
		// Wahrheitswert
		// Es existieren nur zwei Zustände bei boolean
		// In Java gibt es keine weitere Möglichkeit den Zustand true oder false zu definieren,
		// als die Keywords "true" oder "false"
		boolean eingeloggt = true;
		boolean kaffeGetrunken = false;
		
		
		// 
		char z1 = 'a';
		char z2 = 'h';
		char z3 = 97;
		
		System.out.println("z1: " + z1); // a
		System.out.println("z2: " + z2); // h
		System.out.println("z3: " + z3); // a, da 97 in der ASCII-Table dem a entspricht, entspricht auch im 
										 // Unicode der 97, da die ASCII-Tabelle teil des Unicodes ist
										 // https://www.asciitable.com/
		
		
		
		
		
		
		
		 
		
		
		
	}
}
