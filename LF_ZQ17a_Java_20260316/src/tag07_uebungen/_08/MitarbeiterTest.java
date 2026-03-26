package tag07_uebungen._08;

public class MitarbeiterTest {

	public static void main(String[] args) {
		Mitarbeiter mitarbeiter1 = new Mitarbeiter();
		mitarbeiter1.setMitarbeiterID("EMP001");
		mitarbeiter1.setName("Max Mustermann");
		mitarbeiter1.setPosition("Entwickler");
		mitarbeiter1.setGehalt(50000);
		mitarbeiter1.setErfahrungsjahre(5);
		mitarbeiter1.zeigeMitarbeiterInfo();
		
		System.out.println();
		
		Mitarbeiter mitarbeiter2 = new Mitarbeiter("EMP002", "Maria Müller", "Manager");
		mitarbeiter2.setGehalt(75000);
		mitarbeiter2.setErfahrungsjahre(8);
		mitarbeiter2.zeigeMitarbeiterInfo();
		
		
		System.out.println();
		
		Mitarbeiter mitarbeiter3 = new Mitarbeiter("EMP003", "John Doe", "Designer", 45000, 3);
		mitarbeiter3.zeigeMitarbeiterInfo();
		
		System.out.println();
		
		Mitarbeiter mitarbeiter4 = new Mitarbeiter();
		mitarbeiter4.setMitarbeiterID("");
		mitarbeiter4.setGehalt(-1000);
		mitarbeiter4.setErfahrungsjahre(-2);

	}

}
