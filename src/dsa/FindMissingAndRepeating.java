package dsa;

import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeating {
	/**
	 * You are given a read-only array of N integers with values also in the range
	 * [1, N] both inclusive. Each integer appears exactly once except A which
	 * appears twice and B which is missing. The task is to find the repeating and
	 * missing numbers A and B where A repeats twice and B is missing.
	 */

	public static void main(String[] args) {

		int[] arr = new int[] {3,1,2,5,3};

		usingHashing(arr);

	}

	private static void usingHashing(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=1;i<=arr.length;i++) {
			map.put(i, 0);
		}

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);

			} else {
				map.put(arr[i], 1);
			}

		}
		Integer missing = -1;
		Integer repeating = -1;
		for (Integer key : map.keySet()) {

			Integer value = map.get(key);
			if ( value == 0) {
				missing = key;
				continue;
			}

			if (value > 1) {
				repeating = key;

			}
		}

		System.out.println(missing + "," + repeating);
	}

}
