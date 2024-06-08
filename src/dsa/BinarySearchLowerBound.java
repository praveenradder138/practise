package dsa;

import java.util.Scanner;

public class BinarySearchLowerBound {

	/**
	 * 
	 * Either can be asked as lower bound or 
	 * Problem Statement: You are given a sorted array arr of distinct values and a
	 * target value x. You need to search for the index of the target value in the
	 * array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = new int[] { 1,2,4,7 };

		int key = 6;

		int index = arr.length;

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] >= key) {
				index = mid;
				right = mid - 1;
				// mid = (left + right) / 2;
			} else {

				left = mid + 1;
				mid = (left + right) / 2;
			}

		}

		System.out.println(index);
	}

}
