package tag08_09.grundlagen._02_toStringUeberschreiben;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		Fahrzeug fahrzeug = new Fahrzeug("Ford", 180);
		System.out.println(fahrzeug);
		
		JOptionPane.showMessageDialog(null, fahrzeug);

	}

}
