package javatest.synchron;

import java.util.LinkedList;
import java.util.Scanner;

public class PairOfIntegers {

	static LinkedList<Pair<Integer, Integer>> pairs = new LinkedList<Pair<Integer, Integer>>();

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		System.out.println(isItPossible(a,b,c,d));
		
	}


	public static String isItPossible(Integer a, Integer b, Integer c, Integer d) {

		Pair<Integer, Integer> pairOfInt = new Pair<Integer, Integer>(a, b);
		pairs.addLast(pairOfInt);

		while (!pairs.isEmpty()) {
			
			Pair<Integer, Integer> pair = pairs.poll();
			Integer key = pair.getKey();
			Integer value = pair.getValue();
			
			System.out.println("Head ("+key+","+value+")");
			
			if (key.equals(a) && value.equals(b)) {
				System.out.println("YES");
				return "YES";
			}

			int sum = key + value;

			if (sum <= c) {
				System.out.println("SUM <= C ("+sum+","+value+")");
				pairs.addLast(new Pair<Integer, Integer>(sum, value));
			}
			if (sum <= d) {
				System.out.println("SUM <= D ("+key+","+sum+")");
				pairs.addLast(new Pair<Integer, Integer>(key, sum));
			}

		}

		return "NO";
	}

	static class Pair<A, B> {
		
		private A key;
		private B value;

		public Pair(A a, B b) {
			this.key = a;
			this.value = b;
		}

		public A getKey() {
			return key;
		}

		public void setKey(A key) {
			this.key = key;
		}

		public B getValue() {
			return value;
		}

		public void setValue(B value) {
			this.value = value;
		}

	}

}
