package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {

		int[][] array = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		Arrays.sort(array, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {

				return a[0] - b[0];
			}

		});
		// 1,3 2,6 8,10 15,18
		bruteForce(array);

		List<List<Integer>> answer = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {

			int curStart = array[i][0];
			int curEnd = array[i][1];

			if (answer.isEmpty() || answer.get(answer.size() - 1).get(0) > curStart) {

				answer.add(List.of(curStart, curEnd));

			} else {

				answer.get(answer.size() - 1).set(1, Math.max(answer.get(answer.size() - 1).get(1), array[i][1]));
			}

		}

	}

	private static void bruteForce(int[][] array) {
		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {

			int first = array[i][0];
			int second = array[i][1];

			if (!ans.isEmpty() && second <= ans.get(ans.size() - 1).get(1)) {
				continue;

			}

			for (int j = i + 1; j < array.length; j++) {
				if (array[j][0] <= second) {
					second = Math.max(second, array[j][1]);
				} else {
					break;
				}
			}
			ans.add(Arrays.asList(first, second));
		}

		System.out.print("The merged intervals are: \n");
		for (List<Integer> it : ans) {
			System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
		}
		System.out.println();
	}

}
