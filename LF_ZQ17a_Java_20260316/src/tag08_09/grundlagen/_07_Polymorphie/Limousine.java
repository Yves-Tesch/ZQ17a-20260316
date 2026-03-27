package tag08_09.grundlagen._07_Polymorphie;

public class Limousine extends Auto {
	public void aktiviereFeiermodus() {
		System.out.println("Die Limousine aktiviert den Feiermodus mit Musik und lustigen Getränken!");
	}
	
	@Override
	public void fahren() {
		System.out.println("Die Limousine fährt vielleicht im Feiermodus!!!");
	}
}
