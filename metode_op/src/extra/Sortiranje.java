package extra;

public class Sortiranje {

	public static void main(String[] args) {
		//int tmp;
		int[] x = new int[] {5, 2, 9, 7, 1, 3};
		
		System.out.print("x=[");
		System.out.print(x[0]);
		for (int i=1;i < x.length; i++) {
			//System.out.println((i+1)+". element niz:" + x[i]);
			System.out.print(","+x[i]);
		}
		System.out.println("]");

		// 5, 2, 9, 7, 1, 3
		// |5| -> 2, 9, 7, 1, 3
		// 2, 5 , 9, 7, 1, 3
		// 2, 5, |2| -> 9, 7, 1, 3
		// 2, 5, 9, |2| -> 7, 1, 3
		// 2, 5, 9,  7, |2| ->1, 3
		// 1, 5, 9, 7, 2, 3
		
		//int tmp;	
		// bubble sort
//		for (int i = 0; i < x.length-1; i++)
//			for (int j = i+1; j < x.length; j++)
//				if (x[i]>x[j]) {
//					tmp = x[i];
//					x[i] = x [j];
//					x[j] = tmp;
//				}
		
		
		// 5, 2, 9, 7, 1, 3
		// 2, 5, 9, 7, 1, 3
		// 2, 5, 7, 9, 1, 3
		// 1, 2, 5, 7, 9, 3
		// 1, 2, 3, 5, 7, 9
		
		int key, j;
		
		for (int i = 1; i < x.length; i++) {
			key = x[i];
			
			j = i - 1;
			
			while (j>=0 && x[j] > key) {
				x[j+1] = x[j];
				j=j-1;
			}
			x[j+1] = key;
		}
		
		
		System.out.print("x=[");
		System.out.print(x[0]);
		for (int i=1;i < x.length; i++) {
			//System.out.println((i+1)+". element niz:" + x[i]);
			System.out.print(","+x[i]);
		}
		System.out.println("]");
			

	}
	public static void promeniNiz(int[] intNizPar){
		int i = 0;
		System.out.println("Vrednost niza koji stize u potprogram: ");
		System.out.print(" [" + intNizPar[0] + "," + intNizPar[1] + "," + intNizPar[2] + "]");
		System.out.println();
		for (i = 0; i < 3; i++) {
			intNizPar[i]++;
		}
		System.out.println("Vrednost niza nakon uvecanja u potprogram: ");
		System.out.print(" [" + intNizPar[0] + "," + intNizPar[1] + "," + intNizPar[2] + "]");
		System.out.println();
	}

}
