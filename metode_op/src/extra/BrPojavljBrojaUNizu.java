package extra;

public class BrPojavljBrojaUNizu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dat je niz A od maksimalno 20 celobrojnih elemenata. Učitati n
elemenata, zatim učitati ceo broj br. Na izlazu ispisati ceo niz i broj
pojavljivanja broja br u nizu.*/
		
		int maxEl = 5;
		int nEl = 0;
		int element;
		int broj;
		int [] A = new int [maxEl];
		do {
			System.out.println("Unesite  elemente u niz: ");
			for(int i = 0; i < maxEl; i++) {
				
					element = TextIO.getInt();
					A[i]=element;
					nEl++;
					
			}
		}while(nEl<maxEl);
		
		System.out.println("Unesite  broj za koji zelit proveru dal se pojavljuje u nizu: ");
		broj = TextIO.getInt();
		
		int brojac = 0;
		for (int i = 0; i < A.length; i++) {
            if (A[i]==broj) {
                brojac++;
            }
        }
		
		System.out.println("Niz inicijalni: ");
		//ispis elemenata pocetnog niza
		for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
		}
		
		System.out.println("\nBroj "+ broj + " se pojavljuje " + brojac + " puta.");
		
	}

}
