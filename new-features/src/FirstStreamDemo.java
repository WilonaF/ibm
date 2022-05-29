import java.util.Arrays;
import java.util.List;

public class FirstStreamDemo {

	private static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Integer[] ar = {2, 5, 7, 6, 9, 3, 2, 4};
		List<Integer> numbers = Arrays.asList(ar);
		
		numbers.stream().distinct().forEach(System.out::println); //distinct is intermediate operation
		
		System.out.println(numbers.stream().distinct().count()); //count is terminal operation
		
		numbers.stream().filter(n->n>=5).forEach(System.out::println); //filter is intermediate
		
		numbers.stream().limit(5).forEach(System.out::println); //limit is intermediate
		
		numbers.stream().distinct().sorted().forEach(System.out::println);
	}
}
