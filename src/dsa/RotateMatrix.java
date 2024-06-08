package dsa;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		/**
		 * Input
		 *  0 1 2
		 *0 1 2 3
		 *1 4 5 6
		 *2 7 8 9
		 * 
		 * Output
		 * 0 1 2
		 *0 7 4 1
		 *1 8 5 2
		 *2 9 6 3
		 * 
		 * 0,0 -> 0,2 ->j,n-1-i
		 * 0,1 -> 1,2
		 * 0,2 -> 2,2
		 * 
		 * 
		 * j= is always equal to row num
		 * i=3-0-1=2 
		 */
	
		
		rotateBrute(arr);

	}

	private static void rotateBrute(int[][] arr) {
		int n = arr.length;
		int[][] rotated = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				rotated[j][n - 1 - i] = arr[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
	}

}
