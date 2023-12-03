package metode;
import java.util.Arrays;

public class NizMetode {
	
		public enum Poredak {RASTUCI, OPADAJUCI};
		
		public static void main(String[] args) {
			
			int maxElNiza = 10;
			int nEl = 0;
			int[] niz = new int [maxElNiza];
			
			nEl = unosBrElNiza("Unesite broj elemenata: ", niz, maxElNiza);
			System.out.println("Broj elemenata niza je: " + nEl);
			
			unosElemNiza(nEl, niz);
			ispisiNiz(niz, nEl);
			double min = minNiza(nEl, niz);
			System.out.println("Minimalni elemenata niza je: " + min);
			int pozicija = pozicijaMinElNiza(nEl, niz);
			System.out.println("Pozicija minimalnog elemenata niza je: " + pozicija);
			
			int broj = 0;
			int broj2 = 0;
			pronalazenjeVrednManjeOd(nEl, niz, broj, broj2);
			pozicijeBrojaUNizu(niz, nEl, broj);
			sortNiz(niz, nEl);
			//System.out.println("Sortirani niz (rastući): " + Arrays.toString(niz));
			sortirajNiz(niz, nEl, Poredak.RASTUCI);
	        System.out.println("Sortirani niz (rastući): " + Arrays.toString(niz));
		}
		public static int unosBrElNiza(String poruka, int[] niz, int maxEl){
			int brojEl;
			do {
				System.out.println(poruka);
				brojEl = TextIO.getInt(); 
				if(brojEl<=0 || brojEl>maxEl) {
					System.out.println("Broj nije validan. \n");
				}
			}while(brojEl<=0 || brojEl>maxEl);
			return brojEl;
		}
		public static void unosElemNiza(int n, int[] nizElem){
			int i;
			for (i = 0; i < n; i++){
				System.out.print("Unesite " + (i+1) + ". element niza: ");
				nizElem[i] = TextIO.getlnInt();
			}
			System.out.println();
		}
		private static void ispisiNiz(int[] niz, int length) {
			
	        System.out.println("Inicijalni niz: " ); 
			System.out.print("niz=[");
			System.out.print(niz[0]);
			for (int i = 1; i < length; i++) {
				System.out.print(","+niz[i]);
			}
			System.out.println("]");
	    }
		public static int brPojavljivanjaElUNizu(int broj, int niz[]) {
			System.out.println("Unesite  broj za koji zelite proveru pojavljivanja u nizu: ");
			broj = TextIO.getInt();
			
			int brojac = 0;
			for (int i = 0; i < niz.length; i++) {
	            if (niz[i]==broj) {
	                brojac++;
	            }
			}
			return brojac;
			
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

		public static int pozicijaMinElNiza(int n, int[] niz) {
			double min = Double.MAX_VALUE;
			
			int pozicijaMinElementa = 0;  
			for(int i = 0; i<n; i++) {
				if(niz[i] <= min) {		
					min= niz[i];
					pozicijaMinElementa = i+1;  
					
				}
			}
			return pozicijaMinElementa;
		}


		/*pronalaženje vrednosti koje zadovoljavaju neki složeni kriterijum (npr. sve 
	vrednosti manje od nekog broja a veće od nekog drugog broja).*/
		 public static void pronalazenjeVrednManjeOd(int n, int[] niz, int broj, int broj2) {
			 System.out.print("Unesite vrednost za ispis manjih vrednosti od unete: ");
			 broj = TextIO.getInt();
			 System.out.print("Unesite vrednost za ispis vecih vrednosti od unete: ");
			 broj2 = TextIO.getInt();
			 System.out.print("Niz elementata koji su manji od " + broj + " veci od " + broj2+ " =[");
			 //System.out.print(niz[0]);
			 int element;
			 for(int i = 0; i<n; i++) {
				if(niz[i] < broj) {		
					element = niz[i];
					System.out.print(" "+ element);
				}
				if(niz[i] > broj2) {		
					element = niz[i];
					System.out.print(" "+ element);
				}
				
			 }
			 System.out.print("]");
		 }
		 /*pozicije odredjenog broja u nizu*/
		 
		 public static void pozicijeBrojaUNizu(int niz[], int length, int broj) {
			 	System.out.println("Unesite  broj za koji zelite proveru svih pozicija u nizu: ");
				broj = TextIO.getInt();
				System.out.print("Pozicija broja " + broj+ " =[");
				int pozicija = 0;
				for (int i = 0; i < niz.length; i++) {
		            if (niz[i]==broj) {
		            	pozicija = i+1;
		            	System.out.print(" "+ pozicija);
		            }
				}
				System.out.println("]");
				
		 }
		 /*sortiranje elemenata niza po nekom kriterijumu (od najvećeg ka najmanjem i 
	od najmanjeg ka najvećem).*/
//		public static void sortirajNiz(int[] nizSort, Poredak p ) {
//			for (int a = 0; a < nizSort.length; a++) {
//				for (int i = 0; i < nizSort.length-1; i++) {
//					if(p== Poredak.RASTUCI) {
//						if(nizSort[i] > nizSort[i+1]) {
//							int privremena = nizSort[i];
//							nizSort[i]=nizSort[i+1];
//							nizSort[i+1]=privremena;
//						}
//					}else if(p==Poredak.OPADAJUCI) {
//						if(nizSort[i] < nizSort[i+1]) {
//							int privremena = nizSort[i];
//							nizSort[i]=nizSort[i+1];
//							nizSort[i+1]=privremena;
//						}
//					}
//				}
//			}
//		}
		 public static void sortirajNiz(int[] nizSort, int n, Poredak poredak) {
		        
		        boolean zameni;
		        
		        do {
		            zameni = false;
		            for (int i = 0; i < n - 1; i++) {
		                if ((poredak == Poredak.RASTUCI && nizSort[i] > nizSort[i + 1]) ||
		                    (poredak == Poredak.OPADAJUCI && nizSort[i] < nizSort[i + 1])) {
		                    
		                    int privremena = nizSort[i];
		                    nizSort[i] = nizSort[i + 1];
		                    nizSort[i + 1] = privremena;
		                    zameni = true;
		                }
		            }
		            n--;
		        } while (zameni);
		 }
		public static void sortNiz(int [] niz, int n) {
			int key, j;
			
			for (int i = 1; i < n; i++) {
				key = niz[i];
				
				j = i - 1;
				
				while (j>=0 && niz[j] < key) {
					niz[j+1] = niz[j];
					j=j-1;
				}
				niz[j+1] = key;
			}
			
			System.out.print("x=[");
			System.out.print(niz[0]);
			for (int i=1;i < niz.length; i++) {
				//System.out.println((i+1)+". element niz:" + x[i]);
				System.out.print(","+niz[i]);
			}
			System.out.println("]");
		}
		 
	}