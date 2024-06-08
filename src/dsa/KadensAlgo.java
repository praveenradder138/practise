package dsa;

import java.util.TreeMap;

public class KadensAlgo {

	/**
	 * Given an integer array arr, find the contiguous subarray (containing at least
	 * one number) which has the largest sum and returns its sum and prints the
	 * subarray.
	 */

	public static void main(String[] args) {

		int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4};

		int ans = Integer.MIN_VALUE;

		int curSum = 0;
		
		

		for (int i = 0; i < arr.length; i++) {
			curSum = curSum + arr[i];
			
			if(curSum>ans) {
				ans=curSum;
			}
			
			if(curSum<0) {
				curSum=0;
			}
		}
		System.out.println(ans);

	}

}
