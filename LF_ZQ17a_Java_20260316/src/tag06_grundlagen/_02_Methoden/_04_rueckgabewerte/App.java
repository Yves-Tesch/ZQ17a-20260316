package tag06_grundlagen._02_Methoden._04_rueckgabewerte;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		
		System.out.println("Details über Auto 1:");
		meinAuto.setzeDetails("Seat", 170);
		JOptionPane.showMessageDialog(null, meinAuto.zeigeDetails());
		

		System.out.println();
		
		Auto meinAuto2 = new Auto();
		meinAuto2.setzeDetails("Skoda", 90);
		
		System.out.println("Details über Auto 2:");
		JOptionPane.showMessageDialog(null, meinAuto2.zeigeDetails());
		
		JOptionPane.showMessageDialog(null, meinAuto.zeigeDetails() + "\n\n" + meinAuto2.zeigeDetails());
		
		
	}
}
