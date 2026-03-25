package tag07_uebungen._07;

public class Kreis {
	private double radius;
	
	public Kreis() {
		radius = 0;
	}
	
	public Kreis(double radius) {
		this.radius = radius;
	}
	
	public void setRadiusByUmfang(double umfang) {
		radius = umfang / (2 * Math.PI);
	}
	
	public void setRadiusByFlaeche(double flaeche) {
		radius = Math.sqrt(flaeche / Math.PI);
	}
	
	public double getUmfang() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getFlaeche() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
