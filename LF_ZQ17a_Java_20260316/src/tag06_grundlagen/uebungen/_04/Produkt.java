package tag06_grundlagen.uebungen._04;

public class Produkt {
	String name;
	double preis;
	
	void setzeDetails(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}
	
	String zeigeDetails() {
		return name + " " + String.format("%.2f", preis) + "€";
	}
}
