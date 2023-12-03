package extra;

public class noviNizAbs {

	public static void main(String[] args) {
		
		/*Dat je niz A od maksimalno 40 celobrojnih elemenata. Učitati n
elemenata u niz A i formirati niz X pri čemu su elementi niza X apsolutne
vrednosti negativnih elemenata niza A. Koristiti abs funkciju.*/
		final int maxEl = 40;
		int nEl;
		int el;
		int brBrojeva = 0;
		//UNOS BROJA EL NIZA I PROVERA
		do{
			System.out.println("Unesite broj elemenata: ");
			nEl = TextIO.getInt();
			if (nEl<=0 || nEl>maxEl) {
				System.out.println("Broj nije validan. Unesite broj elemenata: ");
				nEl = TextIO.getInt();
			}
		}while(nEl<=0 || nEl>maxEl);
		//UNOS ELEMENATA NIZA
		int[] niz = new int [nEl];
		
		for (int i = 0; i < nEl; i++) {
			el = TextIO.getInt();
			niz[i]=el;
		}
		//ISPIS INICIJALNOG NIZA
		System.out.println("Inicijalni niz: " ); 
		System.out.print("A=[");
		System.out.print(niz[0]);
		for (int i = 0; i < niz.length; i++) {
			System.out.print(","+niz[i]);
		}
		System.out.println("]");
        //SMESTANJE APSOLUTNE VREDNOSTI NEGATIVNIH U NOVI NIZ X
		int[] nizXabs = new int[nEl];
		for (int i = 0; i < nEl; i++) {
			if(niz[i]<0){
				nizXabs[brBrojeva]=Math.abs(niz[i]);
				brBrojeva++;
			}
		}
		//ISPIS NOVOG NIZA
		if (brBrojeva > 0) {
			System.out.print("Niz X apsolutnih vrednosti: ");
			System.out.print("X=[");
			System.out.print(nizXabs[0]);
			for (int i=1;i < brBrojeva; i++) {
				System.out.print(","+nizXabs[i]);
			}
			System.out.println("]");
		}
		else
			System.out.println("Nema negativnih brojeva u nizu");
//		System.out.print("Niz X apsolutnih vrednosti: ");
//		for (int i = 0; i < nEl; i++) {
//            System.out.print(nizXabs[i] + " ");
//        }
//        System.out.println();
	}

}
