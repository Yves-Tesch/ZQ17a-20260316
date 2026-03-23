package tag04_05_uebungen;

import javax.swing.JOptionPane;

public class _01_EinfacherRechner {

	public static void main(String[] args) {
		boolean wiederhole = true;
		
		while(wiederhole) {
			
			int auswahl = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "Wähle eine Operation:\n"
					+ "1: Addition\n"
					+ "2: Subtraktion\n"
					+ "3: Multiplikation\n"
					+ "4: Division\n"
					+ "5: Beenden"));
			
			if(auswahl != 5) {
				double zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Gib die erste Zahl ein:"));
				double zahl2 = Double.parseDouble(JOptionPane.showInputDialog("Gib die zweite Zahl ein:"));

				double ergebnis = 0;
				
				switch(auswahl) {
				case 1: // Addition
					ergebnis = zahl1 + zahl2;
					JOptionPane.showMessageDialog(null, "Ergebnis der Addition " + ergebnis);
					break;
				case 2: // Subtraktion
					ergebnis = zahl1 + zahl2;
					JOptionPane.showMessageDialog(null, "Ergebnis der Subtraktion " + ergebnis);
					break;
				case 3: // Multiplikation
					ergebnis = zahl1 * zahl2;
					JOptionPane.showMessageDialog(null, "Ergebnis der Multiplikation " + ergebnis);
					break;
				case 4: // Division
					if(zahl2 != 0) {
						ergebnis = zahl1 / zahl2;
						JOptionPane.showMessageDialog(null, "Ergebnis der Division " + ergebnis);
					} else {
						JOptionPane.showMessageDialog(null, "Durch Null teilen ist nicht erlaubt!");
					}
					break;
				case 5: // Programm beenden
					wiederhole = false;
					JOptionPane.showMessageDialog(null, "Programm wird beendet.");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Üngültige Auswahl. Bitte versuche es erneut.");
				}
			} else {
				wiederhole = false;
			}
		}
	}
}
