package oop_figuras;

public class Centrs {
	
		// ATRIBUTI
		public int x, y;
		
		// KONSTRUKTORS
		public Centrs (int x, int y) {
			this.x = x;
			this.y = y;	
		}
		
		// METODES
		public String izvaditKoordinatas() {
			return "Centra punkts atrodas:\n x = " + x + " y = " + y;
		}
		
		public void parvietot (int koordX, int koordY) {
			x += koordX;
			y += koordY;
		}
}