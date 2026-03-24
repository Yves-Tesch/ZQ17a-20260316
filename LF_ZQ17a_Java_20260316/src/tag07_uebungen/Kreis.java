package tag07_uebungen;

public class Kreis {
	private double radius;
	
	public Kreis() {
		radius = 0;
	}
	
	public Kreis(double radius) {
		this.radius = radius;
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
