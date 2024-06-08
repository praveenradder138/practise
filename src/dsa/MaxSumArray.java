package dsa;

public class MaxSumArray {

	public static void main(String[] args) {
		/**
		 * Given an integer array arr, find the contiguous subarray (containing at least
		 * one number) which
		 */
		int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int currSum = 0;
		int ans = Integer.MIN_VALUE;
		int startIndex = 0;
		int endIndex = 0;
		int start = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (currSum == 0)
				start = i;//keep track of when sum becomes zero
			currSum = currSum + arr[i];

			if (currSum > ans) {
				startIndex = start;
				endIndex = i;
				ans = currSum;
			}

			if (currSum < 0) {
				startIndex = i;
				currSum = 0;
			}
		}

		System.out.println(ans);
		System.out.println("From and to " + startIndex + "," + endIndex);

	}

}
