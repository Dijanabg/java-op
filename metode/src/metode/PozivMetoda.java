package metode;

public class PozivMetoda {

	public static void main(String[] args) {
		/*Implementirati program koji računa sumu, razliku, 
proizvod i količnik dva broja. Brojeve zadaje korisnik 
preko tastature. Implementirati unos, sabiranje, 
oduzimanje, množenje, deljenje i prikaz rezultata kao 
zasebne potprograme.*/
        // Unos brojeva
        double broj1 = unesiBr("Unesite prvi broj: ");
        double broj2 = unesiBr("Unesite drugi broj: ");

        // Sabiranje
        System.out.println("Suma: " + sabiranje(broj1, broj2));

        // Oduzimanje
        System.out.println("Razlika: " + oduzimanje(broj1, broj2));

        // Množenje
        System.out.println("Proizvod: " + mnozenje(broj1, broj2));

        // Deljenje
        System.out.println("Količnik: " + deljenje(broj1, broj2));
		
	}

	public static double unesiBr(String message) {
		double broj = 0.0;
		System.out.println(message);
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

