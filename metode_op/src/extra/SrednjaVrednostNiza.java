package extra;

public class SrednjaVrednostNiza {

	public static void main(String[] args) {
		// napravi niz, unos je sa tastature
		
		System.out.println("Unesite broj elemenata: ");
		int n = TextIO.getInt();
		
		do{
			if (n<0 || n==0) {
				System.out.println("Broj nije validan. Unesite broj elemenata: ");
				n = TextIO.getInt();
			}
			
		}while(n<0 || n==0);
		
		int [] niz = new int[n];
		
		for(int i = 0; i<niz.length; i++) {
			System.out.println("Unesite sledeci broj: ");
			niz[i] = TextIO.getInt();
		}
		//izracunaj srednju vrednost clanova niza
		int suma = 0;
		for(int i = 0; i<niz.length; i++) {
			
			suma += niz[i];
		}
		
		double srednjaVrednost = suma / niz.length;
		System.out.println("Srednja vrednost niza je: " + srednjaVrednost);
	}

}
