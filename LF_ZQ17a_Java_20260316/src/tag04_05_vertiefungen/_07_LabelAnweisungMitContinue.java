package tag04_05_vertiefungen;

public class _07_LabelAnweisungMitContinue {

	public static void main(String[] args) {
		aeussereSchleife: 
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == j) {
						continue aeussereSchleife;
					}
					System.out.println("i:" + i + " j: " + j);
				}
			}
	}
}
