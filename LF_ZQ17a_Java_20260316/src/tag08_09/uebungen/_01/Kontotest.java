package tag08_09.uebungen._01;

public class Kontotest {

	public static void main(String[] args) {
		Konto meinKonto = new Konto("0000000001", 1000);
		
		System.out.println("Kontonr: " + meinKonto.getKontonummer());
		System.out.println("Kontostand: " + String.format("%.2f", meinKonto.getKontostand()) + "€");
		
		System.out.println();
		
		double einzahlungsbetrag = 500;
		meinKonto.einzahlen(einzahlungsbetrag);
		
		System.out.println("Kontostand nach Einzahlen von " + String.format("%.2f", einzahlungsbetrag) 
				+ "€: " + String.format("%.2f", meinKonto.getKontostand()) + "€");
		
		System.out.println();
		
		double auszahlungsbetrag = 750.5;
		meinKonto.auszahlen(auszahlungsbetrag);
		
		System.out.println("Kontostand nach Auszahlen von " + String.format("%.2f", auszahlungsbetrag) 
		+ "€: " + String.format("%.2f", meinKonto.getKontostand()) + "€");
		
		

	}

}
