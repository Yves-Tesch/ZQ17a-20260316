package tag08_09.grundlagen._03_staticVerwenden._02_Hilfsmethoden;

public class MathUtils {
	
	// Utility-Methode, zur Berechnung des Maximums zweier Zahlen
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	// Utility-Methode, zur Berechnung des Quadrats einer Zahl
	public static int square(int a) {
		return a * a;
	}
}
