package tag08_09.grundlagen._06_Interfaces;

public class App {
	public static void main(String[] args) {
		Auto fahrzeug = new Auto("Skoda", 0, 3);
		fahrzeug.zeigeDetails();
		
		System.out.println();
		
		fahrzeug.beschleunigen(80);
		
		System.out.println();
		
		fahrzeug.zeigeDetails();
	}
	
	
}
