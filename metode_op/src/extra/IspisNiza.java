package extra;

public class IspisNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] niz = {2, 5, 3, 8};
		
		ispisiNiz(niz, 4);
	}
	private static void ispisiNiz(int[] niz, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

}
