package tag04_05_vertiefungen;

public class _05_IfElseForOhneKlammern {
	public static void main(String[] args) {
		// Geschweifle Klammern können bei Bedingungen und Schleifen weggelassen werden, wenn Bedingung 
		// oder Schleife nur eine Anweisung hat. Nutzung ist nur bedingt empfohlen, gerade bei Schleifen
		int alter = 15;
		
		// Beispiel mit Klammern
		if(alter >= 18) {
			System.out.println("Du bist volljährig.");
		} else {
			System.out.println("Du bist minderjährig.");
		}
		
		// Ohne Klammern
		if(alter >= 18) System.out.println("Du bist volljährig.");
		else System.out.println("Du bist minderjährig.");
		
		
		
		// Schleifen
		// for-Schleife
		for(int i = 0; i < 5; i++) System.out.println("for-Schleife: i:" + i);
		
		//while-Schleife
		int x = 5;
		while(x > 0) System.out.println("While: x:" + x--);
		
		//do-while-Schleife
		do
			System.out.println("Do-While: x" + x++);
		while (x < 5);
	}
	
	
}
