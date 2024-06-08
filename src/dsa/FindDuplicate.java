package dsa;

public class FindDuplicate {

	public static void main(String[] args) {
		/**
		 * Given an array of N + 1 size, where each element is between 1 and N. Assuming
		 * there is only one duplicate number, your task is to find the duplicate
		 * number.
		 */
		int arr[] = { 1, 2, 4, 2, 3 };

		int fast = arr[0];
		int slow = arr[0];

		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		} while (slow != fast);

		fast = arr[0];

		do {
			slow = arr[slow];
			fast = arr[fast];
		} while (slow != fast);

		System.out.println(fast);
	}

}
