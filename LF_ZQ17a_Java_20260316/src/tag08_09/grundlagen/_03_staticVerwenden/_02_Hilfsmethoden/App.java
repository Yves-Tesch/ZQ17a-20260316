package tag08_09.grundlagen._03_staticVerwenden._02_Hilfsmethoden;

public class App {
	public static void main(String[] args) {
		int maxWert = MathUtils.max(10, 18);
		int quadratZahl = MathUtils.square(5);
		
		System.out.println("Maximalwert von 10 und 18 ist: " + maxWert);
		System.out.println("Das Quadrat der Zahl 5 ist: " + quadratZahl);
	}
}
