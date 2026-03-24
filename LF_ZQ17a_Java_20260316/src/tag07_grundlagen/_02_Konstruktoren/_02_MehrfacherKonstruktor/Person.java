package tag07_grundlagen._02_Konstruktoren._02_MehrfacherKonstruktor;

public class Person {
	private String name;
	private int alter;
	private boolean istVolljaehrig;
	
	// Konstruktor ohne Parameter
	public Person() {
		this.name = "unbekannt";
		this.alter = 0;
	}
	
	// Konstruktor mit einem Parameter
	public Person(String name) {
		this.name = name;
		this.alter = 0;
	}
	
	// Konstruktor mit zwei Parametern
	public Person(String name, int alter) {
		this.name = name;
		setAlter(alter);
	}
	
	public void setAlter(int alter) {
		if(alter >= 0 && alter <= 200) {
			this.alter = alter;
			istVolljaehrig = alter >= 18 ? true : false;
		} else {
			System.out.println("Person ist zu jung oder zu alt. (Bereich zwischen 0 und 200)");
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public boolean getIstVolljaehrig() {
		return istVolljaehrig;
	}
	
	// istVolljaehrig hat keinen eigenen Setter, da über setAlter mitgesteuert wird
	// bitte zukünftig alle Klassen, die Attribute und Methoden, kapseln!
}