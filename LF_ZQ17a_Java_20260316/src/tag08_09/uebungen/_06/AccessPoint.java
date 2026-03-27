package tag08_09.uebungen._06;

public class AccessPoint extends Netzwerkgeraet {
	private int maxVerbindungen;
	
	public AccessPoint(String hersteller, String modell, String ipAdresse, int maxVerbindungen) {
		super(hersteller, modell, ipAdresse);
		this.maxVerbindungen = maxVerbindungen;
	}
	
	public void verbindeGeraet() {
		System.out.println("Access Point verbindet bis zu " + maxVerbindungen + " Geräte.");
	}

	
	@Override
	public String toString() {
		return super.toString() + ", Max-Verbindungen: " + maxVerbindungen;
	}
	
	public int getMaxVerbindungen() {
		return maxVerbindungen;
	}

	public void setMaxVerbindungen(int maxVerbindungen) {
		this.maxVerbindungen = maxVerbindungen;
	}
}
