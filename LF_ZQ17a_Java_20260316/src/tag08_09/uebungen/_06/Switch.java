package tag08_09.uebungen._06;

public class Switch extends Netzwerkgeraet {
	private int switchingKapazitaet;
	
	public Switch(String hersteller, String modell, String ipAdresse, int switichingKapazitaet) {
		super(hersteller, modell, ipAdresse);
		this.switchingKapazitaet = switichingKapazitaet;
	}
	
	public void schalteDaten() {
		System.out.println("Switch verarbeitet Daten mit einer Kapazität von:" + switchingKapazitaet + " Gbps");
	}

	@Override
	public String toString() {
		return super.toString() + ", Switiching-Kapazität: " + switchingKapazitaet;
	}
	
	public int getSwitchingKapazitaet() {
		return switchingKapazitaet;
	}

	public void setSwitchingKapazitaet(int switchingKapazitaet) {
		this.switchingKapazitaet = switchingKapazitaet;
	}
	
	
	
}
