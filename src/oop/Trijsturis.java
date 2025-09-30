package oop;

public class Trijsturis {

	public int malaA, malaB, malaC;
	public Centrs punkts;
	
	public Trijsturis(Centrs p, int m1, int m2, int m3) {
		punkts = p;
		malaA = m1;
		malaB = m2;
		malaC = m3;
	}
	
	public String izvaditTrijsturaInfo() {
		return "Mala A - "+malaA+" cm, Mala B - "+malaB+" cm, Mala C - "+malaC+" cm.\nLaukums - "+tLaukums()+" cm2.";
	}
	public double tLaukums() {
		
		double p = (malaA+malaB+malaC)/2;
		double L = Math.sqrt(p*(p-malaA)*(p-malaB)*(p-malaC));
		return Math.round(L*100.0)/100.0;
		
	}
}
