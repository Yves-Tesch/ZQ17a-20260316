package tag08_09.uebungen._03;

public class Bruch {
	private int zaehler;
	private int nenner;

	Bruch() {
		this.zaehler = 0;
		this.nenner = 1;
	}

	Bruch(int zaehler) {
		this.zaehler = zaehler;
		this.nenner = 1;
	}

	Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public void setZaehler(int z) {
		zaehler = z;
	}

	public void setNenner(int n) {
		nenner = n;
	}

	public int getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void ausgeben() {
		System.out.print(zaehler + "/" + nenner);
	}

	public String bruchToString() {
		return zaehler + "/" + nenner;
	}

	public void kuerzen() {
		int m, n, r; // lokale Variablen
		m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
		n = Math.abs(nenner); // speichert in n den Betrag von nenner
		r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		zaehler /= n; // in n steht jetzt der ggT
		nenner /= n;
	}

	public void gekuerztausgeben() {
		kuerzen();
		ausgeben();
	}

	public boolean equals(Bruch x) {
		Bruch a = new Bruch(this.zaehler, this.nenner);
		Bruch b = new Bruch(x.zaehler, x.nenner);
		a.kuerzen();
		b.kuerzen();
		if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
			return true;
		} else {
			return false;
		}
	}
	
	public Bruch addiere(Bruch meinBruch) {
		int neuZaehler = this.zaehler * meinBruch.nenner + this.nenner * meinBruch.zaehler;
		int neuNenner = this.nenner * meinBruch.nenner;
		
		Bruch ergebnisBruch = new Bruch(neuZaehler, neuNenner);
		ergebnisBruch.kuerzen();
		
		return ergebnisBruch;
	}
	
	public Bruch subtrahiere(Bruch meinBruch) {
		int neuZaehler = this.zaehler * meinBruch.nenner - this.nenner * meinBruch.zaehler;
		int neuNenner = this.nenner * meinBruch.nenner;
		
		Bruch ergebnisBruch = new Bruch(neuZaehler, neuNenner);
		ergebnisBruch.kuerzen();
		
		return ergebnisBruch;
	}
	
	public double dezimalwert() {
		return (double) this.zaehler / this.nenner;
	}
}
