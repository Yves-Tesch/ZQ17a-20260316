package tag07_grundlagen._02_Konstruktoren._01_EinfacherKosntruktor;

public class Person {
	private String name;
	private int alter;
	private boolean istVolljaehrig;
	
	// Default-Werte bei Instanzattributen
	// short, byte, int und long = 0
	// float und double = 0.0
	// char = '\u0000'
	// boolean = false;
	// Referenzen auf Objekte = null;
	
	// Konstruktor der Klasse Person
	// Der Konstruktor heißt immer genau wie die Klasse und hat keinen Rückgabetyp!
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
