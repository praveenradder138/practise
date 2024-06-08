package dsa;

import java.util.HashMap;
import java.util.Map;

public class FindMissingElement {
	/**
	 * Given an integer N and an array of size N-1 containing N-1 numbers between 1
	 * to N. Find the number(between 1 to N), that is not present in the given
	 * array. Example 1: Input Format: N = 5, array[] = {1,2,4,5} Result: 3
	 */

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 4, 5 };

		usingExtraSpace(arr);

	}

	private static void usingExtraSpace(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			map.put(arr[i], 1);
		}

		for (int i = 1; i < arr.length; i++) {

			if (map.get(i) == null || map.get(i) == 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
