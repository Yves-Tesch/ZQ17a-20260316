package tag08_09.grundlagen._01_erbenVonKonkretenKlassen;

public class App {

	public static void main(String[] args) {
		Fahrzeug fahrzeug = new Fahrzeug("Volvo", 160);
		fahrzeug.zeigeDetails();
		
		System.out.println();
		
		Auto auto = new Auto("Skoda", 150, 5); 
		auto.zeigeDetails();
		System.out.println(auto.toString());
		

	}

}
