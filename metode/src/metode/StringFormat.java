package metode;

public class StringFormat {

	public static void main(String[] args) {

		String format = "Vrednost je %d";// int %d
		String ispis = String.format(format, 40);
		System.out.println(ispis);

		// ispis da broj zauzima 10 mesta
		String format2 = "Vrednost je %10d";
		String ispis2 = String.format(format2, 40);
		System.out.println(ispis2);

		// ispis float vrednosti sa odredjenim brojem pozicija
		String format3 = "Vrednost je %10f";
		String ispis3 = String.format(format3, 40.36565);
		System.out.println(ispis3);

		// float sa odredjenim br posle zareza
		String format4 = "Vrednost je %10.2f";
		String ispis4 = String.format(format4, 40.36565);
		System.out.println(ispis4);

		// stringovi s odredj br pozicija, - za poravnanje levo
		String format5 = "Ime je %30s";
		String ispis5 = String.format(format5, "Dijana");
		System.out.println(ispis5);

		String format6 = "%-20s %-20s %-20d";
		System.out.println(String.format(format6, "Dijana", "dijana", 1500));
		System.out.println(String.format(format6, "Milan", "miki", 500));
		System.out.println(String.format(format6, "Pera", "detlic", 22500));

		System.out.printf(format6, "Miki", "maus", 22500);
		System.out.println();// mora jer ne prelazi u novi red
	}

}
