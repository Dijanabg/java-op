package extra;

public class Extra {

	public static void main(String[] args) {
		
		int [] niz = new int[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("Unesite sledeci broj: ");
			niz[i] = TextIO.getInt();
		}

	}

}
