package dsa;

public class MajorityElementMooresVoting {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 2, 1, 1, 1, 1, 2};
		/**
		 * Given an array of N integers, write a program to return an element that
		 * occurs more than N/2 times in the given array. You may consider that such an
		 * element always exists in the array.
		 */

		int count = 0;
		int element = 0;

		for (int i = 0; i < arr.length; i++) {

			if (count == 0) {
				element = arr[i];
				count++;
			} else if (element == arr[i]) {
				count++;
			} else {
				count--;
			}

		}
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {

			if (element == arr[i]) {
				count1++;
			}
		}

		if (count1 > (arr.length / 2)) {
			System.out.println(element);
		} else {
			System.out.println(-1);
		}

	}

}
