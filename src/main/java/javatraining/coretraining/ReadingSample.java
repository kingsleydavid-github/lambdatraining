package javatraining.coretraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReadingSample {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String content = "India is my country,in in in in all indians are my brothers and sisters sisters sisters sisters sisters, "
				+ "i am working for a sample company in coimbatore coimbatore coimbatore coimbatore coimbatore in information technology firm";
		String content2 = "tab fou8 mad";
		Pattern p = Pattern.compile("[a-zA-Z0-9]+");
		Matcher m = p.matcher(content);
		
		List<String> words = new ArrayList<String>();
		
		while(m.find()) {
			words.add(m.group());
		}

		Predicate<String> ps = (st) -> st.toLowerCase().equals("in");
		Function<String, Boolean> fn1 = (st) -> st.toLowerCase().equals("in");
		
		System.out.println(words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		System.out.println(words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting())));
		
		System.out.println(words.stream().filter(ps).collect(Collectors.toList()).size());
		
		System.out.println(Arrays.asList(content2.split(" ")).stream().collect(Collectors.summarizingInt(String::length) ));
		
		System.out.println(content.chars().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
	}
	
}
