package extra;

public class MatricaSumaiVrsta {

	public static void main(String[] args) {
		

        // Unos broja vrsta i kolona
        System.out.print("Unesite broj vrsta (do 10): ");
        int brojVrsta = TextIO.getInt();

        System.out.print("Unesite broj kolona (do 20): ");
        int brojKolona = TextIO.getInt();

        // Provera da li su uneti brojevi u dozvoljenom opsegu
        if (brojVrsta <= 0 || brojVrsta > 10 || brojKolona <= 0 || brojKolona > 20) {
            System.out.println("Pogrešan unos. Broj vrsta mora biti između 1 i 10, a broj kolona između 1 i 20.");
            return;
        }

        // Inicijalizacija matrice
        int[][] matrica = new int[brojVrsta][brojKolona];

        // Unos vrednosti elemenata matrice
        for (int i = 0; i < brojVrsta; i++) {
            for (int j = 0; j < brojKolona; j++) {
                System.out.print("Unesite vrednost za element [" + i + "][" + j + "]: ");
                matrica[i][j] = TextIO.getInt();
            }
        }
        //ispis matrice 
        for (int i = 0; i < brojVrsta; i++) {
            for (int j = 0; j < brojKolona; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        // Računanje srednje vrednosti
        double suma = 0;
        int brojElemenata = 0;

        for (int i = 0; i < brojVrsta; i++) {
            for (int j = 0; j < brojKolona; j++) {
                suma += matrica[i][j];
                brojElemenata++;
            }
        }

        double srednjaVrednost = suma / brojElemenata;

        System.out.println("Srednja vrednost elemenata matrice je: " + srednjaVrednost);

        // Računanje i ispis sume elemenata svake vrste
//        System.out.println("Suma elemenata po vrstama:");
//
//        for (int i = 0; i < brojVrsta; i++) {
//            int sumaVrste = 0;
//            for (int j = 0; j < brojKolona; j++) {
//                sumaVrste += matrica[i][j];
//            }
//            System.out.println("Vrsta " + (i + 1) + ": " + sumaVrste);
//        }

        int[] sumaVrsta = new int[brojVrsta];
		// suma elemenata svake pojinacne vrste matrice
		for( int i = 0; i < matrica.length; i++) {
			sumaVrsta[i] = 0;
			for(int j = 0; j < matrica[0].length;j++)
				sumaVrsta[i] += matrica[i][j];
		}
		// ispis elemenata niza
		System.out.println("Suma elemenata vrste je:");
		for( int i = 0; i < sumaVrsta.length; i++) {
			System.out.println("Vrsta " + (i + 1) + ": " + sumaVrsta[i]);
//			System.out.print(sumaVrsta[i] + " ");
		}
		System.out.println();	
		// pozicija maksimuma u nizu (deo zadatka za traženje maksimuma u sumi po vrsti)
		int maksa = 0;
		for( int i = 1; i < sumaVrsta.length; i++) {
			if (sumaVrsta[i] < sumaVrsta[maksa]) {
				maksa = i;
			}
		}
		// trazenje maksimuma u trecoj koloni
		int maksTreceKolone = matrica[0][2];
		for(int i = 1; i < matrica.length; i++) {
			if (maksTreceKolone < matrica[i][2]) {
				maksTreceKolone = matrica[i][2];
			}
		}	
	}
}
