package tag07_uebungen._08;

public class Mitarbeiter {
	private String mitarbeiterID;
	private String name;
	private String position;
	private double gehalt;
	private int erfahrungsjahre;
	
	// Default / No-Arg Konstruktor
	public Mitarbeiter() {
		setMitarbeiterID("EMP00");
		setName("No Name");
		setPosition("Unbekannt");
		setGehalt(0);
		setErfahrungsjahre(0);
	}
	
	// Überladener Konstruktor (initialisiert mitarbeiterID, name und position, den Rest default)
	public Mitarbeiter(String mitarbeiterID, String name, String position) {
		setMitarbeiterID(mitarbeiterID);
		setName(name);
		setPosition(position);
		setGehalt(0);
		setErfahrungsjahre(0);
	}
	
	// Überladener Konstruktor (initialisiert alle Attribute)
	public Mitarbeiter(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
		setMitarbeiterID(mitarbeiterID);
		setName(name);
		setPosition(position);
		setGehalt(gehalt);
		setErfahrungsjahre(erfahrungsjahre);
	}
	
	
	public String getMitarbeiterID() {
		return this.mitarbeiterID;
	}
	
	public void setMitarbeiterID(String mitarbeiterID) {
		if(mitarbeiterID != null && !mitarbeiterID.isEmpty()) {
			this.mitarbeiterID = mitarbeiterID;
		} else {
			System.out.println("MitarbeiterID darf nicht leer sein.");
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getGehalt() {
		return gehalt;
	}
	
	public void setGehalt(double gehalt) {
		if(gehalt >= 0) {
			this.gehalt = gehalt;
		} else {
			System.out.println("Gehalt kann nicht negativ sein.");
		}
	}
	
	public int getErfahrungsjahre() {
		return erfahrungsjahre;
	}
	
	public void setErfahrungsjahre(int erfahrungsjahre) {
		if(erfahrungsjahre >= 0) {
			this.erfahrungsjahre = erfahrungsjahre;
		} else {
			System.out.println("Erfahrungsjahre können nicht negativ sein.");
		}
		
	}
	
	public void zeigeMitarbeiterInfo() {
		System.out.println("MitarbeiterID: " + mitarbeiterID
				+ "\nName: " + name
				+ "\nPosition: " + position
				+ "\nGehalt: " + gehalt + "€"
				+ "\nErfahrungsjahre: " + erfahrungsjahre);
	}
}
