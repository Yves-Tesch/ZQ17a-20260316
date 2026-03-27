package tag08_09.grundlagen._05_AbstrakteKlassen;

public class App {

	public static void main(String[] args) {
		Auto meinAuto = new Auto("Seat", 60, 5);
		meinAuto.zeigeDetails();
		meinAuto.beschleunigen(30);
		
		System.out.println();
		
		meinAuto.zeigeDetails();

	}

}
