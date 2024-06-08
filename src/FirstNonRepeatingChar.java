import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		/**
		 * Write a program to find the first non-repeating element from a given string using Java Streams.
		 */

		String str = "PPrraavveen";

		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(x -> Character.toLowerCase((char) x))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		Entry<Character, Long> orElseGet = collect.entrySet().stream().filter(entry ->entry.getValue()==1).findFirst().orElse(null);
		System.out.println(orElseGet);
		/**
		 * Write a program to find the first repeating element/character from a given string using Java Streams.
		 */

		LinkedHashMap<Character, Long> collect3 = str.chars().mapToObj(c -> Character.toLowerCase((char)c)).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		Entry<Character, Long> orElseGet2 = collect3.entrySet().stream().filter(entry -> entry.getValue()>1).findFirst().orElseGet(null);
		
		System.out.println(orElseGet2);
		
	
		
		//Write a program to find unique elements in a given string using Java streams.
		
		List<Character> collect2 = str.chars().mapToObj(x-> Character.toLowerCase((char)x)).distinct().collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}
