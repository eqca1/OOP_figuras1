package oop;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	public Aplis (Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	
	public String izvaditAplaInfo() {
		return "Rādiuss - "+radiuss+" cm.";
	}
	
	public double rLinija() {
		double C = Math.PI*2*radiuss;
		return Math.round(C*100.0)/100.0;
	}
	public double rLaukums() {
		double L = Math.PI*Math.pow(radiuss, 2);
		return Math.round(L*100.0)/100.0;
		
	}
}
