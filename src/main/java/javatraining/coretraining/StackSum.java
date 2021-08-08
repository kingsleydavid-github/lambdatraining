package javatraining.coretraining;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class StackSum {

	private static List<Integer> sumtotal = new ArrayList<>();

	public static void main(String[] args) {

		Integer[] i1 = { 5, 8, 7, 4 };
		Integer[] i2 = { 2, 1, 3 };

		Deque<Integer> s1 = new ArrayDeque<>();
		Deque<Integer> s2 = new ArrayDeque<>();
		Deque<Integer> balStack = new ArrayDeque<>();

		Arrays.stream(i1).forEach(i -> {
			s1.push(i);
		});

		Arrays.stream(i2).forEach(i -> {
			s2.push(i);
		});

		sum(s1, s2, balStack);
		Collections.reverse(sumtotal);
		System.out.println(sumtotal);

	}

	private static void sum(Deque<Integer> s1, Deque<Integer> s2, Deque<Integer> balStack) {
		int sum = 0;

		while (!s1.isEmpty() || !s2.isEmpty() || !balStack.isEmpty()) {
			if (!balStack.isEmpty()) {
				sum = (s1.peek() != null ? s1.pop() : 0) + (s2.peek() != null ? s2.pop() : 0)
						+ (balStack.peek() != null ? balStack.pop() : 0);
			} else {
				sum = (s1.peek() != null ? s1.pop() : 0) + (s2.peek() != null ? s2.pop() : 0);
			}
			if (sum >= 10) {
				String bal = String.valueOf(sum);
				sumtotal.add(Integer.valueOf(String.valueOf((char) bal.charAt(1))));
				balStack.add(Integer.valueOf(String.valueOf((char) bal.charAt(0))));
				sum(s1, s2, balStack);
			} else {
				sumtotal.add(sum);
				sum(s1, s2, balStack);
			}
		}
	}
}
