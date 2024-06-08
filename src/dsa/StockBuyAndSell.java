package dsa;

public class StockBuyAndSell {

	public static void main(String[] args) {

		int[] arr = new int[] { 7, 1, 5, 3, 6, 4 };

		int maxProfitBrute = maxProfitBruteForce(arr);
		int maxProfit = maxProfit(arr);

		System.out.println(maxProfitBrute);
		System.out.println(maxProfit);
	}

	private static int maxProfit(int[] arr) {

		int min = Integer.MAX_VALUE;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			maxSum = Math.max(maxSum, arr[i] - min);

		}

		return maxSum;
	}

	private static int maxProfitBruteForce(int[] arr) {
		int maxProfit = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > maxProfit) {
					maxProfit = arr[j] - arr[i];
				}
			}
		}
		return maxProfit;
	}

}
