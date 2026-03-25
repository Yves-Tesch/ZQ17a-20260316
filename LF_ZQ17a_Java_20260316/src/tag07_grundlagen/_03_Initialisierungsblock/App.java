package tag07_grundlagen._03_Initialisierungsblock;

public class App {

	public static void main(String[] args) {
		Auto meinAuto1 = new Auto();
		
		System.out.println("Marke Auto 1: " + meinAuto1.marke);
		System.out.println("Leistung Auto 1: " + meinAuto1.leistung + " PS");
		System.out.println();
		
		
		Auto meinAuto2 = new Auto("BMW");
	
		System.out.println("Marke Auto 2: " + meinAuto2.marke);
		System.out.println("Leistung Auto 2: " + meinAuto2.leistung + " PS");
		System.out.println();
		
		
		Auto meinAuto3 = new Auto("Seat", 150);
		System.out.println("Marke Auto 3: " + meinAuto3.marke);
		System.out.println("Leistung Auto 3: " + meinAuto3.leistung + " PS");

	}

}
