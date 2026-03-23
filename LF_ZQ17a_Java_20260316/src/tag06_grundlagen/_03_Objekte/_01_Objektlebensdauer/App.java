package tag06_grundlagen._03_Objekte._01_Objektlebensdauer;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		meinAuto.setzeDetails("Seat", 170);
		JOptionPane.showMessageDialog(null, "Zeige Details zu Auto 1: \n" + meinAuto.zeigeDetails());
		
		
		Auto meinAuto2 = new Auto();
		meinAuto2.setzeDetails("Skoda", 90);
		
		// Ein Objekt "lebt" solange, wie eine Referenzvariable auf das Objekt "zeigt". 
		// Sobald die Referenzvariable auf null gesetzt wird, ist das Objekt nicht mehr erreichbar.
		// Sobald ein Objekt nicht über eine Referenzvariable erreichbar ist, ist es zum Löschen 
		// durch den GargabeCollector freigegeben.
		
		meinAuto = null;
		JOptionPane.showMessageDialog(null,"Zeige Details zu Auto 1: \n" +  meinAuto2.zeigeDetails());
		//System.out.println(meinAuto.zeigeDetails());
		
		meinAuto2 = null;
		//Fehlermeldung, NullPointerException!
		//JOptionPane.showMessageDialog(null, meinAuto2.zeigeDetails());
		
		
		
		
	}
}
