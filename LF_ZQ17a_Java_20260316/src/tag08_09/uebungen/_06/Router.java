package tag08_09.uebungen._06;

public class Router extends Netzwerkgeraet{
	private int anzahlPorts;
	
	public Router(String hersteller, String modell, String ipAdresse, int anzahlPorts) {
		super(hersteller, modell, ipAdresse);
		this.anzahlPorts = anzahlPorts;
	}
	
	public void routeVerbindung() {
		System.out.println("Router leitet Verbindung über " + anzahlPorts + " Ports.");
	}

	@Override
	public String toString() {
		return super.toString() + ", Anzahl der Ports: " + anzahlPorts;
	}
	
	public int getAnzahlPorts() {
		return anzahlPorts;
	}

	public void setAnzahlPorts(int anzahlPorts) {
		this.anzahlPorts = anzahlPorts;
	}
	
	

}
