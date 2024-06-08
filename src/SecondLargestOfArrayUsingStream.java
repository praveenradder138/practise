import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestOfArrayUsingStream {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 2, 2, 3, 4, 5, 4, 8, 0, 9, 8, 9, 9, 4 ,78};

		Arrays.sort(arr);// mergesort

		List<Integer> skip = Arrays.stream(arr).sorted(Comparator.reverseOrder()).distinct()
				.limit(2).skip(1).collect(Collectors.toList());

		System.out.println(skip);
	}

}
