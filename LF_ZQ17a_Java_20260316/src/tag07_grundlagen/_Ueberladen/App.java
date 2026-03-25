package tag07_grundlagen._Ueberladen;

public class App {
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		
		meinAuto.setzeDetails(100);
		
		System.out.println(meinAuto.marke);
		System.out.println(meinAuto.leistung);
		System.out.println(meinAuto.farbe);
		System.out.println();
		
		
		Auto meinAuto2 = new Auto(); 
		meinAuto2.setzeDetails("Audi", 180);
		
		System.out.println(meinAuto2.marke);
		System.out.println(meinAuto2.leistung);
		System.out.println(meinAuto2.farbe);
		System.out.println();
		
		Auto meinAuto3 = new Auto();
		meinAuto3.setzeDetails("Skoda", 110, "Silbern");
		
		System.out.println(meinAuto3.marke);
		System.out.println(meinAuto3.leistung);
		System.out.println(meinAuto3.farbe);
	}
}
