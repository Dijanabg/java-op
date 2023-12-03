package metode;

public class SumaItdNiza2 {
	static final int MAXELEM = 50;
	public static void main(String[] args) {
		/*Implementirati program za računanje sume vrednosti elemenata niza 
prirodnih brojeva koji sadrži maksimum 50 elemenata. Program 
prihvata od korisnika broj elemenata (0 < N ≤ 50) i vrednost svakog 
pojedinačnog elementa. Unos elemenata i računanje sume realizovati 
kao zasebne potprogram*/
		int[] nizBrojeva = new int[MAXELEM];
		int n;
		//System.out.println("Unesite broj elemenata u nizu \n");
		
		
		boolean izlaz = false;
		
		do {
			n = unosBrElNiza("Unesite broj elemenata u nizu \n", nizBrojeva);
			unosElemNiza(n, nizBrojeva);
			
			System.out.println("Izaberite operaciju:");
			System.out.println("1. Sabiranje");
			System.out.println("2. Minimum");
			System.out.println("3. Maksimum");
			System.out.println("4. Srednja vrednost sume elemenata");
			System.out.println("5. Izlaz");
			
			int izbor = TextIO.getInt();
			switch (izbor) {
			case 1:
				// Sabiranje
				System.out.println("Suma elemenata niza iznosi " + sumaElemNiza(n, 
				nizBrojeva));
				break;
			case 2:
				// Minimum
				System.out.println("Minimum elemenata niza iznosi " + minNiza(n, 
						nizBrojeva));
				break;
			case 3:
				// Maksimum
				System.out.println("Maksimum elemenata niza iznosi " + maxNiza(n, 
						nizBrojeva));
				break;
			case 4:
				// Srednja vrednost sume el niza
				System.out.println("Srednja vrednost sume elemenata niza iznosi " + srednjaVredElNiza(n, 
						nizBrojeva));
				break;
			case 5:
				// Izlaz iz programa
				izlaz = true;
				break;
			default:
				System.out.println("Nepoznata operacija. Molimo izaberite ponovo.");
				break;
			}
			
		}while(!izlaz);
		
		unosElemNiza(n, nizBrojeva);
		System.out.println("Suma elemenata niza iznosi " + sumaElemNiza(n, 
				nizBrojeva));
		System.out.println("Minimum elemenata niza iznosi " + minNiza(n, 
				nizBrojeva));
		System.out.println("Maksimum elemenata niza iznosi " + maxNiza(n, 
				nizBrojeva));
		System.out.println("Srednja vrednost sume elemenata niza iznosi " + srednjaVredElNiza(n, 
				nizBrojeva));
	}
	
	public static int unosBrElNiza(String poruka, int[] niz){
		int brojEl;
		
		do {
			System.out.println(poruka);
			brojEl = TextIO.getInt();			
			if(brojEl<=0 || brojEl>niz.length) {
				System.out.println("Broj nije validan. \n");
			}
		}while(brojEl<=0 || brojEl>niz.length);
		return brojEl;
	}
	
	public static void unosElemNiza(int n, int[] nizElem){
		int i = 0;
		for (i = 0; i < n; i++){
			System.out.print("Unesite " + (i+1) + ". element niza: ");
			nizElem[i] = TextIO.getlnInt();
		}
		System.out.println();
	}
	public static int sumaElemNiza(int n, int[] nizElem){
		int suma = 0;
		int i = 0;
		for (i = 0; i < n; i++) {
			suma += nizElem[i];
		}
		return suma;
	}
	public static double minNiza(int n, int[] niz) {
		double min = Double.MAX_VALUE;
		double rezultat = 0;
		
		for(int i = 0; i<n; i++) {
			if(niz[i] < min) {		
				min= niz[i];
				rezultat = min;
			}
		}
		return rezultat;
	}
	public static double maxNiza(int n, int[] niz) {
		
		double max = Double.MIN_VALUE;
		double rezultat = 0;
		
		for(int i = 0; i<n; i++) {
			if(niz[i] > max) {		
				max= niz[i];
				rezultat = max;
			}
		}
		return rezultat;
	}
	public static double srednjaVredElNiza(int n, int[] niz) {
		double suma = 0;
		for(int i = 0; i<n; i++) {
			suma += niz[i];
		}
		double srednjaVred = suma/n;
		return srednjaVred;
	}
}
