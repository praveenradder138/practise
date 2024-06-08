package dsa;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 4, 8, 10 };
		int[] arr2 = new int[] { 2, 3, 9 };

		int first = arr1.length - 1;
		int second = 0;

		while (first >= 0 && second < arr2.length) {

			if (arr1[first] > arr2[second]) {
				int tmp = arr1[first];
				arr1[first] = arr2[second];
				arr2[second] = tmp;
				first--;
				second++;

			} else {
				break;
			}

		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
