package oop;

public class Cetrsturis {
	public double platums, augstums;
	public Centrs punkts;
	
	public Cetrsturis() {
		punkts = new Centrs(0, 0);
	}
	public Cetrsturis(Centrs punkts, double p, double a) {
	
		this.punkts = punkts;
		platums = p;
		augstums = a;
			
			
		}
	public String izvaditCetrsturaInfo() {
		return "Platums - "+platums+" cm.\nAugstums - "+augstums+" cm.";
	}
	public double cLaukums() {
		double L;
		L = platums * augstums;
		return L;
	}
	}
	
