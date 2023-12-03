package extra;

public class nizStringMalaslova {

	public static void main(String[] args) {
		/*Dat je niz C od maksimalno 15 karaktera. Učitati n karaktera u niz C i 
formirati niz A, pri čemu su elementi niza A samo mala slova iz niza C*/
/*Dat je niz C od maksimalno 15 karaktera. Učitati n karaktera u niz C i  formirati niz A, pri čemu su elementi niza A samo brojevi iz niza C.*/
		
		final int maxEl = 10;
		int nEl;
		char el;
		int brojBrojeva = 0;
		do {
			System.out.println("Unesite broj elemenata u nizu: ");
			nEl = TextIO.getInt();		
			if(nEl>maxEl || nEl<1) {
				System.out.println("Maksimalan broj elemenata je 10.");
			}
		}while(nEl>maxEl || nEl<1);
		
		
		char[] nizC = new char[nEl];
		char[] nizA = new char[nEl];
		el = 0;
		
		System.out.print("Unesite element: \n");
		for (int i = 0; i < nizC.length; i++) {
			
			System.out.print("karakter["+(i+1)+"]=");
			el = TextIO.getChar();
			nizC[i]=el;
		}
		System.out.print("karakteri=[");
		System.out.print(nizC[0]);
		for (int i=1;i < nEl; i++) {
			System.out.print(","+nizC[i]);
		}
		System.out.println("]");
//		for (int i = 0; i < nizC.length; i++) {
//            System.out.print(nizC[i] + " ");
//        }
		for (int i = 0; i < nEl; i++) {
			if(nizC[i]>'a' && nizC[i]<='z') {
				nizA[brojBrojeva]=nizC[i];
				brojBrojeva++;
			}
		}
		if (brojBrojeva > 0) {
			System.out.print("A=[");
			System.out.print(nizA[0]);
			for (int i=1;i < brojBrojeva; i++) {
				System.out.print(","+nizA[i]);
			}
			System.out.println("]");
		}
		else {
			System.out.println("Nema brojeva u unetim karakterima");
		}
	}
}
