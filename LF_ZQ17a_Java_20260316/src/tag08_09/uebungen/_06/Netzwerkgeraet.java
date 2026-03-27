package tag08_09.uebungen._06;

public class Netzwerkgeraet {
	protected String hersteller;
	protected String modell;
	protected String ipAdresse;
	
	public Netzwerkgeraet(String hersteller, String modell, String ipAdresse) {
		this.hersteller = hersteller;
		this.modell = modell;
		this.ipAdresse = ipAdresse;
	}
	
	@Override
	public String toString() {
		return "Hersteller: " + hersteller + ", "  
				+ "Modell: " + modell + ", "
				+ "IP-Adresse: " + ipAdresse;
				
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getIpAdresse() {
		return ipAdresse;
	}

	public void setIpAdresse(String ipAdresse) {
		this.ipAdresse = ipAdresse;
	}
	
	
}
