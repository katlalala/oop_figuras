package oop_figuras;

public class Cetrsturis {
		public double platums, augstums;
		public Centrs punkts;
		
		// KONSTRUKTORU PARSLOGOSANA
		public Cetrsturis() {
			punkts = new Centrs (0, 0);	
		}
		
		public Cetrsturis(Centrs punkts, double p, double a) {
			this.punkts = punkts;
			platums = p;
			augstums = a;
		}
		
		public String izvaditCetrsturaInfo() {
			return "Platums: " + platums + "\nAugstums: " + augstums + "cm";
		}
		
		// LAUKUMA APREKINASANA
		public double CLaukums() {
			double s = platums * augstums;
			return s;
		}
	}


