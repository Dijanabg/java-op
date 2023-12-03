package extra;

public class MinMaxNiza {

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
		//nadji min i max niza
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for(int i = 0; i<niz.length; i++) {
			if(niz[i] < min) {		
				min= niz[i];
			}
			if(niz[i] > max) {		
				max= niz[i];
			}
		}
				
		System.out.println("Minimalna vrednost niza je: " + min);
		System.out.println("Maksimalna vrednost niza je: " + max);
	}

}
