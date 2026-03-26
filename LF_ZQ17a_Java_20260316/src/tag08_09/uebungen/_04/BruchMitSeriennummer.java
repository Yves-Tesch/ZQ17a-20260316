package tag08_09.uebungen._04;

public class BruchMitSeriennummer extends Bruch {
	private final int eigeneSeriennummer;
	private static int seriennummer = 0;
	
	public BruchMitSeriennummer(int zaehler, int nenner) {
		super(zaehler, nenner);
		eigeneSeriennummer = ++seriennummer;
	}
	
	public int getEigeneSeriennummer() {
		return eigeneSeriennummer;
	}
	
	@Override
	public void ausgeben() {
		super.ausgeben();
		System.out.println("\nSeriennummer: " + eigeneSeriennummer);
	}
}
