package javacoreone.training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaCoreOne {

	public static void main(String[] args) {

		Integer[] ints = { 1, 634, 5, 2, 356, 3, 1, 2345, 45, 2131, 5, 24 };

		List<Integer> allInts = Arrays.asList(ints);

		AtomicInteger idx = new AtomicInteger();
		Map<Integer, List<Integer>> allGrouped = allInts.stream().collect(Collectors.groupingBy(
				i -> idx.getAndIncrement() / 3, Collectors.mapping(Function.identity(), Collectors.toList())));

		// System.out.println(allGrouped);

		JavaSampleSingleton sing1 = JavaSampleSingleton.getInstance();
		JavaSampleSingleton sing2 = JavaSampleSingleton.getInstance();

		System.out.println(sing1.hashCode());
		System.out.println(sing2.hashCode());
	}

}
