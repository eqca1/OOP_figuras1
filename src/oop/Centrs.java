package oop;

public class Centrs {
	//Atr
	public int x, y;
	
	// Konstruktors
	public Centrs(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	//Met
	public String izvaditKoord() {
		return "Centra punkts atrodas -|- ( "+x+" ; "+y+" ).";
	}
	public void parvietot (int kX, int kY) {
		
		x += kX;
		y += kY;
	}
}
