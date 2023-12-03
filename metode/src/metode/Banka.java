package metode;

public class Banka {

	public static void main(String[] args) {
		
		/*Program za praćenje godišnjeg poslovanja banke
• Banka posluje u gradu putem 10 poslovnica i za svaki mesec beleži se njen 
prihod.
• Program treba da omogući: 
• Unos ostvarenog prihoda za zadatu poslovnicu i mesec. 
• Izmenu ostvarenog prihoda za zadatu poslovnicu i mesec.
• Prikaz mesečnih prihoda za izabranu poslovnicu.
• Prikaz prihoda pojedinačnih poslovnica za izabrani mesec.
• Izračunavanje i prikaz meseca u kojem je ukupni prihod najveći i koliko on iznosi.
• Izračunavanje i prikaz ukupnog godišnjeg prihoda.
• Izračunavanje i prikaz prosečnog prihoda za svaku poslovnicu.
• Meni iz kojeg se biraju ponuđene funkcije.
• Obavezno koristiti funkcije za implementaciju traženih funkcionalnosti.
• Izabrati korektne tipove podataka i strukture podataka i ograničiti unos tako 
da nije moguće uneti neispravne vrednosti*/
	
		int brPoslovnice = 10;
		String[] imePoslovnice = {"P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10"};
		int mesec = 12;
		double[][] prihodi= new double [brPoslovnice][mesec];
	
		boolean izlaz;
		do {
			izlaz = false;
			prikaziMeni();
			System.out.println("Unesite broj opcije: ");
			int izbor = TextIO.getInt();
			switch (izbor) {
			case 1:
				unosPrihoda(prihodi);
				break;
			case 2:
				izmenaPrihoda(prihodi);
				break;
			case 3:
				mesecniPrihodPoslovnice(prihodi, imePoslovnice);
				break;
			case 4:
				prihodPoslovnicaPoMesecu(prihodi, imePoslovnice);
				break;
			case 5:
				maxMesecPrihod(brPoslovnice, prihodi, imePoslovnice);
				break;
			case 6:
				ukupanGodisnjiPrihod(brPoslovnice, mesec, prihodi);
				break;
			case 7:
				prosecanPrihodPoslovnice(brPoslovnice, mesec, prihodi, imePoslovnice);
				break;
			case 8:
				izlaz = true;
				System.out.println("Izlaz iz programa.");
                break;
			default:
				System.out.println("Nepoznata opcija. Molimo vas da unesete validnu opciju.");
				break;
			}
		}while(!izlaz);
	
	}
	//prikaz menija
	public static void prikaziMeni() {
		System.out.println("\nIzaberite opciju:");
        System.out.println("1. Unos ostvarenog prihoda");
        System.out.println("2. Izmena ostvarenog prihoda");
        System.out.println("3. Prikaz prihoda po poslovnici");
        System.out.println("4. Prikaz prihoda za izabrani mesec za sve poslovnice");
        System.out.println("5. Izračunavanje i prikaz maksimalnog prihoda i meseca u kome je ostvaren");
        System.out.println("6. Izračunavanje i prikaz ukupnog godisnjeg prihoda po kategoriji");
        System.out.println("7. Izračunavanje i prikaz prosečnog prihoda po poslovnici");
        System.out.println("8. Izlaz");
	}
	 //Unos ostvarenog prihoda za zadatu poslovnicu i mesec. 
	public static void unosPrihoda(double[][] prihodi) {
		System.out.println("Unesite poslovnicu: ");
		int unosBrPoslovnice = TextIO.getInt();
		if(unosBrPoslovnice<1 || unosBrPoslovnice > 10) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		System.out.println("Unesite mesec: ");
		int unosMeseca = TextIO.getInt();
		if(unosMeseca<1 || unosMeseca > 12) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		System.out.println("Unesite prihod: ");
		double prihod = TextIO.getDouble();
		if(prihod<0) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		
		prihodi[unosBrPoslovnice-1][unosMeseca-1]= prihod;
		System.out.println("Prihod je uspesno unesen.");
	}
	//Izmenu ostvarenog prihoda za zadatu poslovnicu i mesec.
	public static void izmenaPrihoda(double[][] prihodi) {
		System.out.println("Unesite poslovnicu: ");
		int unosBrPoslovnice = TextIO.getInt();
		if(unosBrPoslovnice<1 || unosBrPoslovnice > 10) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		System.out.println("Unesite mesec: ");
		int unosMeseca = TextIO.getInt();
		if(unosMeseca<1 || unosMeseca > 12) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		System.out.println("Unesite novi prihod: ");
		double prihod = TextIO.getDouble();
		if(prihod<0) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		prihodi[unosBrPoslovnice-1][unosMeseca-1]= prihod;
		System.out.println("Prihod je uspesno unesen.");
	}
	//Prikaz mesečnih prihoda za izabranu poslovnicu.
	public static void mesecniPrihodPoslovnice(double[][] prihodi, String[] imePoslovnice) {
		System.out.println("Unesite poslovnicu: ");
		int unosBrPoslovnice = TextIO.getInt();
		if(unosBrPoslovnice<1 || unosBrPoslovnice > 10) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		double prihod = 0;
		for(int mesec = 0; mesec < 12; mesec++)
		{
			prihod = prihodi[unosBrPoslovnice-1][mesec];
			System.out.println("Prihod za poslovnicu "+ imePoslovnice[unosBrPoslovnice -1] + "\nMesec: " + (mesec+1) + ": " + prihod);
		}
	}
	//Prikaz prihoda pojedinačnih poslovnica za izabrani mesec.
	public static void prihodPoslovnicaPoMesecu(double[][] prihodi, String[] imePoslovnice) {
		System.out.println("Unesite mesec za koji zelite prikaz prihoda po poslovnicama: ");
		int unosMeseca = TextIO.getInt();
		if(unosMeseca<1 || unosMeseca > 12) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		double prihod = 0;
		for(int brPoslovnice = 0; brPoslovnice <10; brPoslovnice++) {
			prihod = prihodi[brPoslovnice][unosMeseca - 1];
			System.out.println("Prihod za poslovnicu "+ imePoslovnice[brPoslovnice] + "\nMesec: " + (unosMeseca) + ": " + prihod);
		}
		
	}
	//Izračunavanje i prikaz meseca u kojem je ukupni prihod najveći i koliko on iznosi.
	public static void maxMesecPrihod(int brPoslovnice, double[][] prihodi, String[] imePoslovnice) {
		int maxMesec = 0;
		double sumaPoMesecu = 0;
		double maxPrihod = prihodi[0][0];
		
		for(int mesec = 1; mesec < 12; mesec++)
		{
			
			for(brPoslovnice = 0; brPoslovnice < 10; brPoslovnice++) {
				sumaPoMesecu +=prihodi[brPoslovnice][mesec];
				
				if(sumaPoMesecu>maxPrihod) {
					maxPrihod = sumaPoMesecu;
					maxMesec = mesec;
				}
			}
			
		}
		System.out.println("Maksimalan prihod od  "+ maxPrihod + "\nje ostvaren u: " + (maxMesec + 1) + "mesecu.");
	}
	// Izračunavanje i prikaz ukupnog godišnjeg prihoda.
	
	public static void ukupanGodisnjiPrihod(int brPoslovnice, int mesec, double[][] prihodi) {
		
		double suma = 0;
		
		for(mesec = 0; mesec < 12; mesec++) {
			for(brPoslovnice = 0; brPoslovnice < 10; brPoslovnice++) {
				suma +=prihodi[brPoslovnice][mesec];
			}
			
		}
		System.out.println("Ukupan godisnji prihod je: " + suma);
		
	}
	//Izračunavanje i prikaz prosečnog prihoda za svaku poslovnicu.
	public static void prosecanPrihodPoslovnice(int brPoslovnice, int mesec, double[][] prihodi, String[] imePoslovnice) {
		System.out.println("Unesite poslovnicu: ");
		int unosBrPoslovnice = TextIO.getInt();
		if(unosBrPoslovnice<1 || unosBrPoslovnice > 10) {
			System.out.println("Greska pri unosu!");
			return; 
		}
		double suma = 0;
		int brojac = 0;
		for( mesec = 0; mesec < 12; mesec++)
		{
			suma += prihodi[unosBrPoslovnice-1][mesec];
			brojac++;
		}
		System.out.println("Prosecan prihod za poslovnicu "+ imePoslovnice[unosBrPoslovnice -1]+": " + suma/brojac);
	}
	
}
