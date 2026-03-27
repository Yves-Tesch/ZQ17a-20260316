package tag08_09.grundlagen._07_Polymorphie;

public class App {
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		Auto meinAuto2 = new Cabrio();
		Auto meinAuto3 = new Limousine();
		
		meinAuto.fahren();
		
		System.out.println();
		
		meinAuto2.fahren();
		
		System.out.println();
		
		meinAuto3.fahren();
		
	}
}
