package tag01_uebungen;

import javax.swing.JOptionPane;

public class _04_1_DurchschnittlicheNiederschlagsmenge {
	public static void main(String[] args) {
		final int ANZAHL_MONATE = 3;
		
		// Eingabe
		double aprilEingabe = Double.parseDouble(JOptionPane
				.showInputDialog("Geben Sie die Niederschlagsmenge für " + "April in l/qm ein:"));

		double maiEingabe = Double.parseDouble(JOptionPane
				.showInputDialog("Geben Sie die Niederschlagsmenge für " + "Mai ein in l/qm ein:"));

		double juniEingabe = Double.parseDouble(JOptionPane
				.showInputDialog("Geben Sie die Niederschlangsmenge für " + "Juni in l/qm ein:"));

		// Verarbeitung
		double durchschnitt = (aprilEingabe + maiEingabe + juniEingabe) / ANZAHL_MONATE;

		// Ausgabe
		JOptionPane.showMessageDialog(null,
				"Die Niederschlagsmenge für April ist: " + aprilEingabe + "l/qm\n" + "Die Niederschlagsmenge für Mai ist: "
						+ maiEingabe + "l/qm\n" + "Die Niederschlagsmenge für Juni ist: " + juniEingabe + "l/qm\n\n"
						+ "Die durchschnittliche Niederschlagsmenge beträgt: " + String.format("%.2f", durchschnitt)
						+ "l/qm");
	}

}
