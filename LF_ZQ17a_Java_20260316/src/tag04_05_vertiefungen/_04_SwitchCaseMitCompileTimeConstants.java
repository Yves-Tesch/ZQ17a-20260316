package tag04_05_vertiefungen;

public class _04_SwitchCaseMitCompileTimeConstants {

	public static void main(String[] args) {
		// Eine compile-time-constant ist eine Konstante, die zur Kompillierzeit bekannt ist
		// Literale, ob ganzzahlig, chars, Strings oder Enums sind alle per Definition compile-time-constant
		// da sie direkt im Quellcode stehen
		// Als case - Fälle können wir Konstanten verwenden, die zur Kompilierzeit bekannt sind
		// Damit eine Variable als "compile-time-constant" gilt, muss sie in einer als final 
		// deklariert und initialisiert werden und als eine Anweisung stehen
		
		final int MONTAG = 1;
		final int DIENSTAG = 2;
		
		int tag = 1;
		
		switch(tag) {
		case MONTAG:
			System.out.println("Es ist Montag.");
			break;
		case DIENSTAG:
			System.out.println("Es ist Dienstag.");
			break;
		default:
			System.out.println("Unbekannter Tag.");
		}
	}
}
