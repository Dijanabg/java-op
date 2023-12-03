package metode;

public class Kelner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Program za praćenje rada kelnera
• Kelner prodaje 10 vrsta pića. Svakog sata radnog vremena (8 sati) beleži se 
kelnerov prihod po vrsti pića.
• Program treba da omogući: 
• Unos ostvarenog prihoda za zadati sat i vrstu pića. 
• Izmenu ostvarenog prihoda za zadati sat i vrstu pića.
• Prikaz prihoda po satima za izabranu vrstu pića.
• Prikaz prihoda po vrstama pića za izabrani sat.
• Izračunavanje i prikaz najprodavanije vrste pića i prihod ostvaren njenom prodajom.
• Izračunavanje i prikaz ukupnog dnevnog prihoda.
• Izračunavanje i prikaz prosečnog prihoda za svaki sat.
• Meni iz kojeg se biraju ponuđene funkcije.
• Obavezno koristiti funkcije za implementaciju traženih funkcionalnosti.
• Izabrati korektne tipove podataka i strukture podataka i ograničiti unos tako da 
nije moguće uneti neispravne vrednosti*/
		int brVrstaPica = 10;
		int radnoVreme = 8;
		
		String[] vrstePica = {"Pice1", "Pice2", "Pice3", "Pice4", "Pice5", "Pice6", "Pice7", "Pice8", "Pice9", "Pice10"};
		double[][] prihodi = new double [brVrstaPica][radnoVreme];
		//unosVrstaPica(vrstePica);
		int izbor; 
		boolean izlaz;
		do {
			izlaz = false;
            prikaziMeni();
            System.out.print("Izaberite opciju: ");
            izbor = TextIO.getInt();

            switch (izbor) {
                case 1:
                    unosPrihodaPoSatu(radnoVreme, brVrstaPica, prihodi);
                    break;
                case 2:
                    izmenaPrihoda(radnoVreme, brVrstaPica, prihodi);
                    break;
                case 3:
                    prikazPrihodaPoVrsti( radnoVreme, brVrstaPica, prihodi, vrstePica);
                    break;
                case 4:
                    prikazPrihodaPoSatu(radnoVreme, brVrstaPica, prihodi, vrstePica);
                    break;
                case 5:
                    najprodavanijaVrstaPica(radnoVreme, brVrstaPica, prihodi, vrstePica);
                    break;
                case 6:
                    ukupanDnevniPrihod(radnoVreme, brVrstaPica, prihodi, vrstePica);
                    break;
                case 7:
                    prosecniPrihodPoSatu(radnoVreme, brVrstaPica, prihodi, vrstePica);
                    break;
                case 8:
                	izlaz = true;
                    System.out.println("Izlaz iz programa.");
                    break;
                default:
                    System.out.println("Nepoznata opcija. Molimo vas da unesete validnu opciju.");
            }
        } while (!izlaz);
	}

	
//	public static void unosVrstaPica(String[] vrstePica) {
//       
//		
//        for (int i = 0; i < vrstePica.length; i++) {
//            System.out.print("Unesite naziv " + (i + 1) + ". vrste pića: ");
//            vrstePica[i] = TextIO.getln();
//        }
//	}
	
	public static void prikazVrstaPica(String[] vrstePica) {
	    System.out.println("Vrste pića:");
	    for (int i = 0; i < vrstePica.length; i++) {
	        System.out.println((i + 1) + ". " + vrstePica[i]);
	    }
	}
	
	public static void prikaziMeni() {
        System.out.println("\nIzaberite opciju:");
        System.out.println("1. Unos ostvarenog prihoda");
        System.out.println("2. Izmena ostvarenog prihoda");
        System.out.println("3. Prikaz prihoda po satima za izabranu vrstu pića");
        System.out.println("4. Prikaz prihoda po vrstama pića za izabrani sat");
        System.out.println("5. Izračunavanje i prikaz najprodavanije vrste pića");
        System.out.println("6. Izračunavanje i prikaz ukupnog dnevnog prihoda");
        System.out.println("7. Izračunavanje i prikaz prosečnog prihoda za svaki sat");
        System.out.println("8. Izlaz");
        //System.out.print("Unesite broj opcije: ");
    }
	
	public static void unosPrihodaPoSatu(int radnoVreme, int brVrstaPica, double[][] prihodi) {
		
		System.out.print("Unesite redni broj sata (1-" + radnoVreme + "): ");
		int sat = TextIO.getInt();
		if(sat<1 || sat>radnoVreme) {
			System.out.println("Greska pri unosu sata");
            return;
		}
		
		System.out.print("Unesite redni broj vrste pića (1-" + brVrstaPica + "): ");
	    int vrstaPica = TextIO.getInt();
	    if (vrstaPica < 1 || vrstaPica > brVrstaPica) {
	        System.out.println("Neispravan unos vrste pića.");
	        return;
	    }

	    System.out.print("Unesite ostvareni prihod: ");
	    double prihod = TextIO.getDouble();
	    prihodi[vrstaPica - 1][sat - 1] = prihod;
	    System.out.println("Unos ostvarenog prihoda uspešan.");
	}
	
	public static void izmenaPrihoda(int radnoVreme, int brojVrstaPica, double[][] prihodi) {
	    System.out.print("Unesite redni broj sata (1-" + radnoVreme + "): ");
	    int sat = TextIO.getInt();
	    if (sat < 1 || sat > radnoVreme) {
	        System.out.println("Neispravan unos sata.");
	        return;
	    }

	    System.out.print("Unesite redni broj vrste pića (1-" + brojVrstaPica + "): ");
	    int vrstaPica = TextIO.getInt();
	    if (vrstaPica < 1 || vrstaPica > brojVrstaPica) {
	        System.out.println("Neispravan unos vrste pića.");
	        return;
	    }

	    System.out.print("Unesite novi ostvareni prihod: ");
	    double noviPrihod = TextIO.getDouble();
	    
	    prihodi[vrstaPica - 1][sat - 1] = noviPrihod;
	    System.out.println("Izmena ostvarenog prihoda uspešna.");
	}
	public static void prikazPrihodaPoVrsti(int radnoVreme, int brojVrstaPica, double[][] prihodi,  String[] vrstePica) {
		
        System.out.print("Unesite vrstu pića (1-" + brojVrstaPica + "): ");
        int vrstaPica = TextIO.getInt();
        vrstaPica--;

        if (vrstaPica < 0 || vrstaPica >= brojVrstaPica) {
            System.out.println("Nepostojeća vrsta pića. Molimo vas da unesete validnu vrstu pića.");
            return;
        }
        double prihod = 0;
        System.out.println("===== PRIHOD PO VRSTI PIĆA =====");
        System.out.println("Vrsta pića: " + vrstePica[vrstaPica]);
        for (int sat = 0; sat < radnoVreme; sat++) {
        	prihod = prihodi[sat][vrstaPica];
            System.out.println("Sat " + (sat + 1) + ": " + prihod);
        }
    }

    static void prikazPrihodaPoSatu(int radnoVreme, int brojVrstaPica, double[][] prihodi, String[] vrstePica) {
    	
        System.out.print("Unesite sat (1-" + radnoVreme + "): ");
        int sat = TextIO.getInt();
        sat--;

        if (sat < 0 || sat >= radnoVreme) {
            System.out.println("Nepostojeći sat. Molimo vas da unesete validan sat.");
            return;
        }
        double prihod = 0;

        System.out.println("===== PRIHOD PO SATU =====");
        System.out.println("Sat: " + (sat + 1));
        for (int vrstaPica = 0; vrstaPica < brojVrstaPica; vrstaPica++) {
        	prihod = prihodi[vrstaPica][sat];
            System.out.println("Vrsta pića " + vrstePica[vrstaPica] + ": " + prihod);
        }
    }

    static void najprodavanijaVrstaPica(int radnoVreme, int brojVrstaPica, double[][] prihodi, String[] vrstePica) {
    	
        int najprodavanijaVrsta = 0;
        double najprodavanijiPrihod = 0;

        for (int vrstaPica = 0; vrstaPica < brojVrstaPica; vrstaPica++) {
            double ukupanPrihodZaVrstu = 0;

            for (int sat = 0; sat < radnoVreme; sat++) {
                ukupanPrihodZaVrstu += prihodi[vrstaPica][sat];
            }

            if (ukupanPrihodZaVrstu > najprodavanijiPrihod) {
                najprodavanijaVrsta = vrstaPica;
                najprodavanijiPrihod = ukupanPrihodZaVrstu;
            }
        }

        System.out.println("===== NAJPRODAVANIJA VRSTA PIĆA =====");
        System.out.println("Najprodavanija vrsta pića: " + vrstePica[najprodavanijaVrsta]);
        System.out.println("Ostvaren prihod: " + najprodavanijiPrihod);
    }

    static void ukupanDnevniPrihod(int radnoVreme, int brojVrstaPica, double[][] prihodi, String[] vrstePica) {
    	
        double ukupanDnevniPrihod = 0;

        for (int sat = 0; sat < radnoVreme; sat++) {
            for (int vrstaPica = 0; vrstaPica < brojVrstaPica; vrstaPica++) {
                ukupanDnevniPrihod += prihodi[vrstaPica][sat];
            }
        }

        System.out.println("===== UKUPAN DNEVNI PRIHOD =====");
        System.out.println("Ukupan dnevni prihod: " + ukupanDnevniPrihod);
    }

    static void prosecniPrihodPoSatu(int radnoVreme, int brojVrstaPica, double[][] prihodi, String[] vrstePica) {
    	
        System.out.println("===== PROSEČNI PRIHOD PO SATU =====");
        for (int sat = 0; sat < radnoVreme; sat++) {
            double ukupanPrihodZaSat = 0;

            for (int vrstaPica = 0; vrstaPica < brojVrstaPica; vrstaPica++) {
                ukupanPrihodZaSat += prihodi[vrstaPica][sat];
            }

            double prosecniPrihodZaSat = ukupanPrihodZaSat / brojVrstaPica;
            System.out.println("Sat " + (sat + 1) + ": " + prosecniPrihodZaSat);
        }
    }
}

