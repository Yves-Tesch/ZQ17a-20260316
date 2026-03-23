package tag01_grundlagen;

public class _07_OperatorenZuweisungUndCast {
	public static void main(String[] args) {
		// Der Zuweisungsoperator ist das Gleichheitszeichen
		// Beachtet werden muss, dass der Wert rechts des Gleichheitszeichens in den Datentyp der Variable links
		// "passen" muss
		// Kleinere Datentypen passen immer in größere Datentypen, ohne dass sich der Compiler beschwert
		
		// Implizite Typumwandlung
		byte myByte = 127;
		int myInt = myByte; // impliziter Cast, weil nicht aktiv vom Entwickler durchgführt
		
		float myFloat = 22.5F;
		double myDouble = myFloat; //impliziter Cast
		
		// Nicht direkt erlaubt ist der Cast von einem größeren Datentyp in einen kleineren Datentyp
		int myInt2 = 127;
//		byte myByte2 = myInt2;
		
		
		// Explizite Typumwandlung
		int i = 200;
		byte b = (byte)i;
		
		System.out.println(b); // Ergebnis 56, ist nicht 200
		
		double d = 9.99;
		int num = (int)d;
		
		System.out.println(num);
		
		// Kombinierten Zuweisungsoperatoren
		// Bei Berechnungen, nach folgendem Schema: zahl = zahl + 1, zahl = zahl * 3 usw...
		int zahl = 5;
		zahl += 2;
		zahl -= 2;
		zahl *= 2;
		zahl /= 2;
		zahl %= 2;
		
		
	}
}
