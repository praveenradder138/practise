package dsa;

public class BinarySearchUpperBound {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 4, 5, 6, 7, 8 };

		int l = 0;
		int r = arr.length - 1;
		int mid = (l + r) / 2;
		int key = 3;
		int ans = arr.length;

		while (l <= r) {
			if (arr[mid] > key) {
				ans = mid;

				r = mid - 1;
			} else {
				l = mid + 1;
			}
			mid=(l+r)/2;
		}
		System.out.println(ans);
	}

}
