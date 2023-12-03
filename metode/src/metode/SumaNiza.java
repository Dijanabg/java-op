package metode;

public class SumaNiza {
	static final int MAXELEM = 50;
	public static void main(String[] args) {
		/*Implementirati program za računanje sume vrednosti elemenata niza 
prirodnih brojeva koji sadrži maksimum 50 elemenata. Program 
prihvata od korisnika broj elemenata (0 < N ≤ 50) i vrednost svakog 
pojedinačnog elementa. Unos elemenata i računanje sume realizovati 
kao zasebne potprogram*/
int[] nizBrojeva = new int[MAXELEM];
		
		//System.out.println("Unesite broj elemenata u nizu \n");
		
		int n = unosBrElNiza("Unesite broj elemenata u nizu \n", nizBrojeva);
			
		unosElemNiza(n, nizBrojeva);
		System.out.println("Suma elemenata niza iznosi " + sumaElemNiza(n, 
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



}
