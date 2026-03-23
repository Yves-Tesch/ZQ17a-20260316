package tag06_grundlagen._01_Klassen._03_Referenzvariablen;

public class App {
	
	public static void main(String[] args) {		
		
		Auto meinAuto = new Auto();
		meinAuto.marke = "Seat";
		meinAuto.anzahlTueren = 5;
		meinAuto.meinMotor.leistung = 150;
		
		meinAuto.zeigeDetails();
		
		System.out.println();
		
		Auto meinAuto2 = new Auto();
		meinAuto2.marke = "BMW";
		meinAuto2.anzahlTueren = 5;
		meinAuto2.meinMotor.leistung = 250;
		meinAuto2.meinMotor.typ = "Vollektrisch";
		
		meinAuto2.zeigeDetails();
	}
}
