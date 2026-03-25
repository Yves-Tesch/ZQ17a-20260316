package tag07_grundlagen._02_Konstruktoren._03_VerketteterKonstruktor;

public class Person {
	// Konstruktorverkettung ermöglicht es andere Konstruktoren der gleichen Klasse aufzurufen, 
	// um Code-Duplikation zu vermeiden
	
	// Erhöht Wartbarkeit und Verständnis
	
	// realisiert wird die Konstruktorverkettung mit dem Schlüsselwort "this" und Übergabeparametern entsprechend
	// gleich dem Konstruktor den man aufrufen möchte
	
	
	private String name;
	private int alter;
	
	// Default-Konstruktor, bzw. No-Arg Konstruktor
	public Person() {
		this("Unbekannt", 0);
	}
	
	// Kontruktor mit einem Parameter, der Konstruktor mit zwei Parametern aufruft
    public Person(String name) {
    	this(name, 0);
    }
    
    // Kontruktor mit einem Parameter, der Konstruktor mit zwei Parametern aufruft
    public Person (int alter) {
    	this("unbekannt", alter);
    }
	
	// Hauptkonstruktor mit zwei Parametern (Name und Alter)
	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}
}
