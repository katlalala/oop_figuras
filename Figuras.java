package oop_figuras;
import java.time.Year;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import uzd1.MinkuTante;


public class Figuras {
	
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
	static ArrayList<Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Trijsturis> trijsturaObjekti = new ArrayList<>();
	
	static String[] objektuPogas = {"Centrs", "Četrstūris", "Aplis",
			"Trijstūris", "Atgriezties"};
	
	public static void main(String[] args) {
		/*
	// IZVEIDO CENTRS OBJEKTU
	Centrs centraP1 = new Centrs(-10, 12);
	System.out.println(centraP1.izvaditKoordinatas());
	centraP1.parvietot(5, -2);
	System.out.println(centraP1.izvaditKoordinatas());
	
	// IZVEIDO CETRSTURIS OBJEKTU
	Cetrsturis cetrsturis1 = new Cetrsturis();
	System.out.println(cetrsturis1.izvaditCetrsturaInfo());
	
	// IZVADIT SI CETRSTURA ATRASANAS VIETU
	System.out.println(cetrsturis1.punkts.izvaditKoordinatas());
	
	Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
	System.out.println(cetrsturis2.izvaditCetrsturaInfo() + "\n" +
				cetrsturis2.punkts.izvaditKoordinatas() +
				"\ns = "+ cetrsturis2.CLaukums());
	
	Centrs punkts2 =  new Centrs(5, 23);
	Aplis aplis1 = new Aplis(punkts2, 5);
	System.out.println(aplis1.izvaditAplaInfo() + "\n" +
			"s = "+ aplis1.RLaukums() + "\n" +
			"c = "+ aplis1.RLaukums());
			
			
		// CENTRU OBJEKTU SKAITS
		int c0bjSk = MinkuTante.skaitlaParbaude(
				"Cik centra objektus glabāsi?", 1, 99);
		
		if(c0bjSk == -1)
			c0bjSk = 1;
		
		Centrs[] centraObjekti = new Centrs[10];
		
		// CETRSTURA OBJEKTU SKAITS
		int ce0bjSk = MinkuTante.skaitlaParbaude(
				"Cik četrstūra objektus glabāsi?", 1, 99); 
		
		if(ce0bjSk == -1)
			ce0bjSk = 1;
		
		Centrs[] cetrsturaObjekti = new Centrs[ce0bjSk];
		
		// APLA OBJEKTU SKAITS
		int a0bjSk = MinkuTante.skaitlaParbaude(
				"Cik apļu objektus glabāsi?", 1, 99); 
		
		if(a0bjSk == -1)
			a0bjSk = 1;
		
		Centrs[] aplaObjekti = new Centrs[a0bjSk];
		
		// TRIJSTURA OBJEKTU SKAITS
		int t0bjSk = MinkuTante.skaitlaParbaude(
				"Cik trijstūra objektus glabāsi?", 1, 99); 
		
		if(t0bjSk == -1)
			t0bjSk = 1;
		
		Centrs[] trijsturaObjekti = new Centrs[t0bjSk];
		*/
		
		
		int izvele, poga;
		
		
		String[] objektuPogas = {"Centrs", "Četrstūris", "Aplis",
				"Trijstūris", "Atgriezties"};
		
		do {
			izvele = MinkuTante.skaitlaParbaude(
					"Ko vēlies darīt?\n"
					+ "0 - Apturēt\n"
					+ "1 - Izveidot objektu\n"
					+ "2 - Aplūkot objektus\n"
					+ "3 - Izsaukt metodi", 0, 3);
			if(izvele == -1)
				izvele = 1;
			
			switch (izvele) {
			
			case 0:
				JOptionPane.showMessageDialog(null,
						"Programma apturēta.", "Paziņojums",
						JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 1:
				OIzveide.izveidotObjektu();
				
				break;
				
			case 2:
				
				
				break;
			
			}
		} while(izvele != 0);
		
		
	}
}