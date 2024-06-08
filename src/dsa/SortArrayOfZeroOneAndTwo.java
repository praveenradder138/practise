package dsa;

import java.util.Arrays;

public class SortArrayOfZeroOneAndTwo {

	public static void main(String[] args) {

		// 0,1,2,1,1,0

		// 0,0,1,1,2,2
//Dutch National flag algorithm
		/**
		 * Three conditions 
		 * 
		 * 0 to low-1 is 0
		 * low to mid-1 is 1
		 * mid to high is unsorted 
		 * high+1 to n-1 is 2
		 * 
		 */
		int[] arr = new int[] {2,0,2,1,1,0};

		int low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {

			if (arr[mid] == 0) {
				swap(arr, mid, low);
				mid++;
				low++;
			}

			else if (arr[mid] == 1) {
				mid++;

			} else {
				swap(arr, mid, high);
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int i, int j) {

		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

	}

}
