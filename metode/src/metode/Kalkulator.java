package metode;

public class Kalkulator {

	public static void main(String[] args) {
		/*Implementirati program koji računa sumu, razliku, 
proizvod i količnik dva broja. Brojeve zadaje korisnik 
preko tastature. Implementirati unos, sabiranje, 
oduzimanje, množenje, deljenje i prikaz rezultata kao 
zasebne potprograme.
• VEŽBA1:
Izmeniti prethodni program tako da korisnik može da bira 
željenu operaciju (sabiranje, oduzimanje, množenje ili 
deljenje), pri čemu za svaku operaciju ponovo definiše 
operande. Omogućiti ponavljanje ovih operacija sve dok 
korisnik ne odluči da izađe iz programa.*/
		boolean izlaz = false;
		// Unos brojeva
		do {
			double broj1 = unesiBr("Unesite prvi broj: ");
			double broj2 = unesiBr("Unesite drugi broj: ");
        
			System.out.println("Izaberite operaciju:");
			System.out.println("1. Sabiranje");
			System.out.println("2. Oduzimanje");
			System.out.println("3. Mnozenje");
			System.out.println("4. Deljenje");
			System.out.println("5. Izlaz");
		
			int izbor = TextIO.getInt();
		
			switch (izbor) {
			case 1:
				// Sabiranje
				double suma = sabiranje(broj1, broj2);
				System.out.println("Zbir: " + suma);
				break;
			case 2:
				// Oduzimanje
				double razlika = oduzimanje(broj1, broj2);
				System.out.println("Razlika: " + razlika);
				break;
			case 3:
				// Množenje
				double proizvod = mnozenje(broj1, broj2);
				System.out.println("Proizvod: " + proizvod);
				break;
			case 4:
				// Deljenje
				double kolicnik = deljenje(broj1, broj2);
				System.out.printf("Kolicnik: %.2f\n", kolicnik);
				break;
			case 5:
				// Izlaz iz programa
				izlaz = true;
				break;
			default:
				System.out.println("Nepoznata operacija. Molimo izaberite ponovo.");
				break;
			}
		} while (!izlaz);
		System.out.println("Hvala što ste koristili kalkulator. Dovidjenja!");
	}

	public static double unesiBr(String poruka) {
		double broj = 0.0;
		System.out.println(poruka);
		broj = TextIO.getDouble();
		return broj;
	}
	public static double sabiranje(double a, double b) {
		double rezultat = a + b;
		return rezultat;
	}
	public static double oduzimanje(double a, double b) {
		double rezultat = a - b;
		return rezultat;
	}
	public static double mnozenje(double a, double b) {
		double rezultat = a * b;
		return rezultat;
	}
	public static double deljenje(double a, double b) {
		if(b!=0) {
			double rezultat = a / b;
			return rezultat;
		}else {
			System.out.println("Nemoguca operacija!");
			return Double.NaN;
		}
	}
}
