package oop_figuras;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	public Aplis (Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	
	public String izvaditAplaInfo() {
		return "Rādiuss: " + radiuss;
	}
	
	// IZVEIDOT METODI RINKA LINIJA APREKINASANAI
	public double RLinija() {
		double c = 2 * Math.PI * radiuss;
		return Math.round(c * 100.0) / 100.0;
	}
	
	// RINKA LAUKUMA APREKINASANAI
	public double RLaukums() {
		double s = Math.PI * Math.pow(radiuss, 2);
		return Math.round(s * 100.0) / 100.0;
	}
}
