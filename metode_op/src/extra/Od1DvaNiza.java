package extra;

public class Od1DvaNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxEl = 12;
		int nEl;
		int element;
		
		do {
			System.out.println("Unesite broj elemenata u nizu: ");
			nEl = TextIO.getInt();		
			if(nEl>maxEl || nEl<1) {
				System.out.println("Maksimalan broj elemenata je 12.");
			}
		}while(nEl>maxEl || nEl<1);
		
		int [] niz12 = new int [nEl];
		//unos elemenata niza
		for(int i = 0; i < nEl; i++) {
			
			element = TextIO.getInt();
			niz12[i]=element;
			
		}
		System.out.println("Niz inicijalni: ");
		//ispis elemenata pocetnog niza
		for (int i = 0; i < niz12.length; i++) {
            System.out.print(niz12[i] + " ");
		}
		int[] A = new int[nEl]; // niz parnih elemenata
        int[] B = new int[nEl]; // niz neparnih elemenata
        
        int indexA = 0; // indeks za niz A
        int indexB = 0; // indeks za niz B
        	//smestanje parnih u niz A
        for (int i = 0; i < nEl; i++) {
            if (niz12[i] % 2 == 0) {
                A[indexA] = niz12[i];
                indexA++;
            } else {
            //smestanje neparnih u niz B
                B[indexB] = niz12[i];
                indexB++;
            }
        }
        //ispis niza A
        System.out.println("\nNiz A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
		}
        //ispis niza B
        System.out.println("\nNiz B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
		}
	}

}
