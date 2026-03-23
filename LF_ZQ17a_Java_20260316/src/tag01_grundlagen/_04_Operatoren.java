package tag01_grundlagen;

public class _04_Operatoren {
	public static void main(String[] args) {
		// Was ist ein Operator?
		// z.B. arithmetische Operatoren ( +, -, *, / usw)
		// Was ein Operand?
		// Ein Operand ist an einem Ausdruck beteiligt und stellt die linke bzw. die recht Seite einer
		// Operation dar, z.B. 5 + 8, 5 und 8 sind die Operanden und + der Operator
		
		int zahl1 = 10;
		int zahl2 = 5;
		int zahl3 = 7;
		int ergebnis = 0;
		
		// Addition 
		ergebnis = zahl1 + zahl2;
		
		// Subtraktion
		ergebnis = zahl1 - zahl2;
		
		// Division
		ergebnis = zahl1 / zahl2;
		// Wenn man eine Ganzzahldivision macht, muss man Wissen, dass der Nachkommaanteil abgeschnitten wird. 
		// Möchte man diesen behalten, sollte man das Ganze als float oder double speichern
		
		// Multiplikation
		ergebnis = zahl1 * zahl2; 
		
		ergebnis = zahl3 % zahl2; // Ergebnis: 2
		
		
		// Arithmetische Operatoren mit nur einem Operanden
		// Inkrement-Operator erhöht Variable um 1
		zahl1++; // Postinkrement - Operator
		++zahl1; // Präinkrement - Operator
		
		// Dekrement-Operator:
		zahl2--; // Postdekrement - Operator
		--zahl2; // Prädekrement - Operator
		
		// Vorzeichen
		// + positives Vorzeichen
		// - negatives Vorzeichen
		
		
		
		
	}
}
