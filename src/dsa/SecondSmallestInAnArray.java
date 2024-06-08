package dsa;

public class SecondSmallestInAnArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 6, 23, 4, 3, 9, 8, 23, 1 };

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		
		System.out.println(secondSmallest);

	}

}
