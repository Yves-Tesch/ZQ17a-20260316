package tag08_09.uebungen._06;

public class Netzwergeraetetest {

	public static void main(String[] args) {
		
		//Test der Router Klasse
		Router router = new Router("Cisco", "C8500-12X4QC", "192.168.1.1", 12);
		System.out.println(router.toString());
		router.routeVerbindung();
		
		System.out.println();
		
		// Test Switch-Klasse
		Switch switchGeraet = new Switch("Netgear", "GS108", "192.168.1.2", 8);
		System.out.println(switchGeraet.toString());
		switchGeraet.schalteDaten();
		
		System.out.println();
		
		// Test der Access-Point Klasse
		AccessPoint accessPoint = new AccessPoint("Netgear", "AC1200", "192.168.1.3", 4);
		System.out.println(accessPoint);
		accessPoint.verbindeGeraet();
	}

}
