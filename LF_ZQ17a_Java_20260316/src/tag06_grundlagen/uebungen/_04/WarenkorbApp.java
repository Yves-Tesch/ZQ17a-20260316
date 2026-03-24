package tag06_grundlagen.uebungen._04;

import java.util.Scanner;

public class WarenkorbApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Kunde kunde = new Kunde();
		Produkt produkt1 = new Produkt();
		Produkt produkt2 = new Produkt();
		Produkt produkt3 = new Produkt();
		
		//Eingabe...
		WarenkorbApp warenkorb = new WarenkorbApp();
		warenkorb.erfasseKunde(scanner, kunde);
		
		warenkorb.erfasseProdukt(scanner, produkt1, "1");
		warenkorb.erfasseProdukt(scanner, produkt2, "2");
		warenkorb.erfasseProdukt(scanner, produkt3, "3");
		
		double gesamtpreis = 0;
		gesamtpreis += produkt1.preis;
		gesamtpreis += produkt2.preis;
		gesamtpreis += produkt3.preis;
		
		System.out.println();
		
		System.out.println(" - Warenkorb - ");
		System.out.println("Kunde: " + kunde.zeigeName());
		System.out.println();
		
		System.out.println("Produkt 1: " + produkt1.zeigeDetails());
		System.out.println("Produkt 2: " + produkt2.zeigeDetails());
		System.out.println("Produkt 3: " + produkt3.zeigeDetails());
		
		System.out.println("************************");
		System.out.println("Gesamptreis: " + String.format("%.2f", gesamtpreis) + "€");

	}
	
	public void erfasseKunde(Scanner scanner, Kunde kunde) {
		System.out.println(" - Kundenerfassung - ");
		
		System.out.print("Vorname: ");
		String vorname = scanner.nextLine();
		
		System.out.print("Nachname: ");
		String nachname = scanner.nextLine();
		
		kunde.setzeDetails(vorname, nachname);
	}
	
	public void erfasseProdukt(Scanner scanner, Produkt produkt, String nummer) {
		System.out.println("\nProduktnummer: " + nummer);
		
		System.out.print("Produktname: ");
		String name = scanner.next();
		
		System.out.print("Preis: ");
		double preis = scanner.nextDouble();
		
		produkt.setzeDetails(name, preis);
	}
}
