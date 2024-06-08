package dsa;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 5, 8, 9, 34, 35, 78, 90 };

		while(true) {
			Scanner scanner = new Scanner(System.in);

			Integer key = Integer.valueOf(scanner.next());

			// System.out.println(key);

			int index = binarySerach(arr, key);
			int left = 0;
			int right = arr.length - 1;
			int index2 = binarySearchRecursive(arr, key,left,right,(left+right)/2);

			System.out.println(index);
			System.out.println(index2);
		}
	}

	private static int binarySerach(int[] arr, Integer key) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			// 1,2,3,4,56,7,8,9
			int mid = (left + right) / 2;

			int midValue = arr[mid];

			if (midValue == key)
				return mid;

			if (midValue < key) {
				left = mid + 1;
			}

			if (midValue > key) {
				right = mid - 1;
			}
		}

		return -1;
	}

	private static int binarySearchRecursive(int[] arr, int key, int left, int right, int mid) {

		if (left > right)
			return -1;

		if (arr[mid] == key)
			return mid;

		if (key > arr[mid])
			return binarySearchRecursive(arr, key, mid + 1, right, (left + right) / 2);
		else
			return binarySearchRecursive(arr, key, left, mid - 1, (left + right) / 2);

		
	}

}
