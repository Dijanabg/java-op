package extra;

public class Od1DvaPoIndexu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dat je niz X od maksimalno 10 realnih elemenata. Učitati n elemenata u niz X i formirati nizove A i B, pri čemu su elementi niza A elementi niza X sa parnim indeksom, a elementi niza B su elementi niza X sa neparnim indeksom.*/
		double maxEl = 10;
		int nEl;
		double element;
		
		do {
			System.out.println("Unesite broj elemenata u nizu: ");
			nEl = TextIO.getInt();		
			if(nEl>maxEl || nEl<1) {
				System.out.println("Maksimalan broj elemenata je 12.");
			}
		}while(nEl>maxEl || nEl<1);
		
		double [] niz12 = new double [nEl];
		//unos elemenata niza
		for(int i = 0; i < nEl; i++) {
			
			element = TextIO.getDouble();
			niz12[i]=element;
			
		}
		System.out.println("Niz inicijalni: ");
		//ispis elemenata pocetnog niza
		for (int i = 0; i < niz12.length; i++) {
            System.out.print(niz12[i] + " ");
		}
		double[] A = new double[nEl]; // niz parnih indexa
        double[] B = new double[nEl]; // niz neparnih indexa
        
        

        for (int i = 0; i < nEl; i++) {
            if (i % 2 == 0) {
                A[i/2] = niz12[i];
            } else {
                B[i/2] = niz12[i];
            }
        }
        System.out.println("\nNiz A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
		}
        System.out.println("\nNiz B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
		}
	}

}
