package tag04_05_vertiefungen;

public class _02_SwitchCaseMitFehlendemBreak {

	public static void main(String[] args) {
		int tag = 2; //Annahme: Tag Variable steht für Wochentag
		
		switch(tag) {
		case 1:
			System.out.println("Montag");
			break;
		case 2: 
			System.out.println("Dienstag");
		case 3:
			System.out.println("Mittwoch");
			break;
		default:
			System.out.println("Wochenende!");
		}

	}

}
