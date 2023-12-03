package extra;

import java.util.Arrays;

public class SortiranjeNiza {

	public static void main(String[] args) {
		
		double[] nizSort = {3.6, 7.8, 2.5};
		System.out.println("Niz je: " + Arrays.toString(nizSort));
		
		sortirajNiz(nizSort, Poredak.OPADAJUCI);
		System.out.println("Niz je sada: " + Arrays.toString(nizSort));
	}
	public enum Poredak {RASTUCI, OPADAJUCI};
//	public static void sortirajNiz(double[] nizSort, Poredak p ) {
//		for (int a = 0; a < nizSort.length; a++) {
//			for (int i = 0; i < nizSort.length-1; i++) {
//				if(p== Poredak.RASTUCI) {
//					if(nizSort[i] > nizSort[i+1]) {
//						double privremena = nizSort[i];
//						nizSort[i]=nizSort[i+1];
//						nizSort[i+1]=privremena;
//					}
//				}else if(p==Poredak.OPADAJUCI) {
//					if(nizSort[i] < nizSort[i+1]) {
//						double privremena = nizSort[i];
//						nizSort[i]=nizSort[i+1];
//						nizSort[i+1]=privremena;
//					}
//				}
//			}
//		}
//	}
	public static void sortirajNiz(double[] nizSort, Poredak poredak) {
        int n = nizSort.length;
        boolean zameni;
        
        do {
            zameni = false;
            for (int i = 0; i < n - 1; i++) {
                if ((poredak == Poredak.RASTUCI && nizSort[i] > nizSort[i + 1]) ||
                    (poredak == Poredak.OPADAJUCI && nizSort[i] < nizSort[i + 1])) {
                    
                    double privremena = nizSort[i];
                    nizSort[i] = nizSort[i + 1];
                    nizSort[i + 1] = privremena;
                    zameni = true;
                }
            }
            n--;
        } while (zameni);
    }
}
