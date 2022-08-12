package training.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String[] args) {
		// List list = List.of(1,2,3,5,6,7,8);
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 5, 2, 7, 8);
		List<Integer> list1 = list.stream().filter(x -> x > 1).collect(Collectors.toList());
		System.out.println(list1);

		list1.stream().filter(x -> x > 1).collect(Collectors.toSet()).forEach(x -> System.out.print(x + " "));

	}

}
