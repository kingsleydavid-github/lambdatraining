package javatraining.coretraining;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollTrainingOne {

	public static void main(String[] args) {
		
		String[] s = { "a", "b", "d", "e", "f", "e", "r", "t" };
		
		Integer[] ints = { 1, 2, 3, 4, 5, 7, 8 };

		// toToggleCase(s);
		System.out.println(Arrays.toString(s));

		AtomicInteger i = new AtomicInteger(0);
		BiFunction<Integer, String, String> fn1 = (a, b) -> a / 2 == 0 ? b : b.toUpperCase();

		List<String> alphaList = Arrays.asList(s);
		System.out.println(alphaList.stream().map(String::toString).distinct().collect(Collectors.toList()));

		String name = "LEONAJANE";

		Map<String, Long> keyMap = name.codePoints().mapToObj(Character::toString)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		keyMap.entrySet().stream().forEach(ent -> {
			Long tval = ent.getValue();
			String tch = ent.getKey();
			System.out.print(tch + "" + tval);
		});

		System.out.println(name + "\n");
		
		for(int idx = name.length()-1; idx > 0; idx--) {
			System.out.print(name.charAt(idx));
		}
		
	}

	private static void toToggleCase(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
				s[i] = s[i].toUpperCase();
			}
		}
	}
}
