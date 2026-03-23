package tag01_uebungen;

import javax.swing.JOptionPane;

public class _04_0_DurchschnittlicheNiederschlagsmenge {

	public static void main(String[] args) {
		// Eingabe
		String aprilEingabe = JOptionPane.showInputDialog("Geben Sie die Niederschlagsmenge für "
				+ "April in l/qm ein:");
		double april = Double.parseDouble(aprilEingabe);
		
		String maiEingabe = JOptionPane.showInputDialog("Geben Sie die Niederschlagsmenge für "
				+ "Mai ein in l/qm ein:");
		double mai = Double.parseDouble(maiEingabe);
		
		String juniEingabe = JOptionPane.showInputDialog("Geben Sie die Niederschlangsmenge für "
				+ "Juni in l/qm ein:");
		double juni = Double.parseDouble(juniEingabe);
		
		
		// Verarbeitung
		double durchschnitt = (april + mai + juni) / 3;
		
		// Ausgabe
		JOptionPane.showMessageDialog(null, "Die Niederschlagsmenge für April ist: " + april + "l/qm\n"
				+ "Die Niederschlagsmenge für Mai ist: " + mai + "l/qm\n"
				+ "Die Niederschlagsmenge für Juni ist: " + juni + "l/qm\n\n"
				+ "Die durchschnittliche Niederschlagsmenge beträgt: " 
					+ String.format("%.2f", durchschnitt) + "l/qm");
		
		

	}

}
