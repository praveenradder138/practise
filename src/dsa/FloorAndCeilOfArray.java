package dsa;

import java.util.Arrays;

public class FloorAndCeilOfArray {
	/**
	 * Problem Statement: You're given an sorted array arr of n integers and an
	 * integer x. Find the floor and ceiling of x in arr[0..n-1]. The floor of x is
	 * the largest element in the array which is smaller than or equal to x. The
	 * ceiling of x is the smallest element in the array greater than or equal to x.
	 */

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 4, 7, 8, 10 };
		int x = 5;
		int floor = findFloor(arr, x);
		int ceiling = findCeiling(arr, x);
		
		System.out.println(floor);
		System.out.println(ceiling);
	}

	private static int findCeiling(int[] arr, int x) {
		int l =0;
		int r=arr.length-1;
		int ans = -1;
		
		while(l<=r) {
			int m = (l+r)/2;
			if(arr[m]>=x) {
				ans=arr[m];
				r=m-1;				
			}else {
				l=m+1;
			}
		}
		return ans;
	}

	private static int findFloor(int[] arr, int x) {
		int l = 0;
		int r = arr.length - 1;
		int ans = -1;

		while (l <= r) {
			int m = (l + r) / 2;

			if (arr[m] <= x) {
				ans = arr[m];
				l = m + 1;
			} else {
				r = m - 1;
			}
		}

		return ans;
	}

}
