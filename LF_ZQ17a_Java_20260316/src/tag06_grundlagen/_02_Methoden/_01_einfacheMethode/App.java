package tag06_grundlagen._02_Methoden._01_einfacheMethode;

public class App {
	
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		meinAuto.marke = "Seat";
		meinAuto.ps = 170;
		
		meinAuto.zeigeDetails();
		
		System.out.println();
		
		Auto meinAuto2 = new Auto();
		meinAuto2.marke = "BMW";
		meinAuto2.ps = 250;
		
		meinAuto2.zeigeDetails();
	}
}
