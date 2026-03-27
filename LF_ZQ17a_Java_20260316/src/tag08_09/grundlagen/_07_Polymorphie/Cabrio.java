package tag08_09.grundlagen._07_Polymorphie;

public class Cabrio extends Auto {
	 public void verdeckOeffnen() {
		 System.out.println("Das Verdeck wird geöffnet.");
	 }
	 
	 @Override
	 public void fahren() {
		 System.out.println("Das Cabrio fährt vielleicht mit offenem Deck!");
	 }
}
