package tag04_05_vertiefungen;

public class _06_LabelAnweisungMitBreak {

	public static void main(String[] args) {
		// Labels sind Bezeichner, die vor Statements, also Schleifen oder Blöcken
		// stehen
		// Werden genutzt um den Kontrollfluss gezielt zu steuern
		// Werden in Kombination mit break und continue verwendet

		aeussereSchleife: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i:" + i + " j:" + j);
				if (i == 2 && j == 2) {
					break aeussereSchleife;
				}
			}
		}
	}
}
