package tag02_03_uebungen;

import javax.swing.JOptionPane;

public class _07_AlphabetAusgeben {

	public static void main(String[] args) {
		String ausgabe = "Version1: \n";
		
		for(int i = 65; i <= 90; i++) {
			ausgabe += (char)i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);
		
		String ausgabe2 = "Version2: \n";
		for(int i = 'a'; i <= 'z'; i++) {
			ausgabe2 += (char)i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe2);
		
		
		String ausgabe3 = "Version3: \n";
		
		for(char i = 'a'; i <= 'z'; i++) {
			ausgabe3 += i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe3);

	}

}
