import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateUsingStream {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 2, 2, 3, 4, 5, 4, 8, 0, 9, 8, 9, 9 ,4};

		Map<Integer, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		
		System.out.println(collect.entrySet());
	}

}
