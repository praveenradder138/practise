import java.util.Arrays;

public class LongestStringInGivenArray {

	// Write a program to find the longest string in a given array.

	public static void main(String[] args) {

		String[] arr = new String[] { "aaass", "eejejejejejejejjejedsc", "dddfdfdfff", "eejejejejejejejjeje" };

		String largest = Arrays.stream(arr).reduce((x, y) -> getGreater(x, y)).orElseGet(null);

		System.out.println(largest);

	}

	private static String getGreater(String x, String y) {
		if (x.length() > y.length()) {
			return x;
		} else {
			return y;
		}
	}

}
