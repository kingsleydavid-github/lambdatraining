package lambdatraining.datetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsTrainingFive {

	public static void main(String[] args) {
		
		String s = "India is my country";
		String test = "KINGSLEYDAVID";
		
		Function<Integer, Integer> pow2fn = (num) -> num * 5;
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		s.chars().forEach(ch -> {
			System.out.print(ch + ",");
		});
		
		System.out.println("\n" + s.codePoints().mapToObj(Character::toString).collect(Collectors.toList()));
		
		System.out.println(s.chars().mapToObj(Character::toString).collect(Collectors.toList()));;
		
		Map<String, Long> charCount = test.codePoints().mapToObj(Character::toString)
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		charCount.entrySet().forEach(it -> {
			System.out.print(it.getKey()+""+it.getValue());
		});
		
	}

}
