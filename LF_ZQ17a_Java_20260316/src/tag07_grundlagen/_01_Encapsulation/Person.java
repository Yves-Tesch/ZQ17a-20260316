package tag07_grundlagen._01_Encapsulation;

public class Person {
	// Zugriffsmodifikatoren:
	// public: Ist für alle Klassen zugänglich ohne Einschränkungen
	// private: Ist nur innerhallb der eigenen Klasse zugänglich
	// protected: Ist für alle Klassen im gleichen Paket und Unterklassen (erbenden Klassen) zugänglich
	// default: hat keinen eigenes Modifizierer-Keyword, ist für alle Klassen innerhalb des gleichen Pakets zugänglich
	
	// Wie stellen wir jetzt die Encapsulation dar?
	// Indem wir alle Attribute auf private setzen und durch öffentliche (public) Getter und Setter gezielt nutzbar machen
	
	private int alter;
	private boolean istVolljaehrig;
	
	public void setAlter(int alter) {
		if(alter >= 0 && alter <= 200) {
			this.alter = alter;
			istVolljaehrig = alter >= 18 ? true : false;
		} else {
			System.out.println("Person ist zu jung oder zu alt. (Bereich zwischen 0 und 200");
		}
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
