package lambdatraining.datetime;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class CollectionsTrainingTwo {

	public static void main(String[] args) {
		
	
		Optional<String> a = Optional.of("s");
		
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.now();
		
		if(a.isEmpty() && a.isPresent()) {
			System.out.println(a.get());
		}
		
		
		Map<String, AtomicBoolean> matcher = new HashMap<>();
		//String braces = "[]]]][][()()({}{}{{]]]]{{{))))";
		String braces2 = "[[[({{{}}})]]";
		
		Stack<String> st = new Stack<>();
		
		System.out.println(isBracesMatching(braces2));
		
		System.out.println("Finished :: " + st);
		
		
	}

	private static boolean isBracesMatching(String braces2) {
		Stack<String> st = new Stack();
		braces2.chars().forEach(it -> {
			System.out.println("Before ::" + st);
			String s = String.valueOf((char) it );
			if(s.equalsIgnoreCase("[") || s.equalsIgnoreCase("(") || s.equalsIgnoreCase("{")) {
				st.push(s);
			} else if(s.equalsIgnoreCase("]") || s.equalsIgnoreCase(")") || s.equalsIgnoreCase("}")) 
			{
				boolean isMatch = false;
				String check = null;
				switch(s) {
				case "]":
					check = st.pop();
					if(check.equalsIgnoreCase("}") || check.equalsIgnoreCase(")"))
						isMatch = false;
					break;
				case "}":
					check = st.pop();
					if(check.equalsIgnoreCase("]") || check.equalsIgnoreCase(")"))
						isMatch = false;
					break;
				case ")":
					check = st.pop();
					if(check.equalsIgnoreCase("}") || check.equalsIgnoreCase("]"))
						isMatch = false;
					break;
				}
			}
			System.out.println("After ::" + st + "\n");
		});
		return st.isEmpty();
	}
	
}
