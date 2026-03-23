package tag02_03_kontrollstrukuren._bedingunden;

public class _02_ternaererOperator {

	public static void main(String[] args) {
		int alter = 64;
		// Standard ternärer Operator
		String ergebnis = alter >= 18 ? "Erwachsener" : "Minderjährig";
		
		// Nicht verkürzter Variante
		String ergebnis2 = "";
		if(alter >= 18) {
			ergebnis = "Erwachsener";
		} else {
			ergebnis = "Minderjährig";
		}
		
		
		// Verschachtelter ternärer Operator
		String ergebnis3 = (alter < 18) ? "Minderjährig" : alter >= 64 ? "Senior" : "Erwachsener";
		
		// Nicht verkürzte Variante
		if(alter >= 64) {
			ergebnis2 = "Senior";
		} else if (alter < 18) {
			ergebnis2 = "Minderjährig";
		} else {
			ergebnis = "Erwachsener";
		}

		// Empfehlung: Ternäre Operatorenm sollte man verschachtelt nicht nutzen, da sie die Lesbarkeit
		// in der Regel nicht fördern. 
	}
}
