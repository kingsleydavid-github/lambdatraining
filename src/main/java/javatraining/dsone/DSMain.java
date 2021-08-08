package javatraining.dsone;

import java.util.ArrayDeque;
import java.util.Deque;

public class DSMain {

	public static void main(String[] args) {
		
		Integer[] i1 = {5,6,6};
		Integer[] i2 = {3,2,1};
		//Integer[] i1 = {5,6,7};
		//Integer[] i2 = {3,2,1};
		
		Deque<Integer> s1 = new ArrayDeque<Integer>();
		for(Integer i : i1) {
			s1.push(i);
		}

		Deque<Integer> s2 = new ArrayDeque<Integer>();
		for(Integer i : i2) {
			s2.push(i);
		}
		
		Deque<Integer> temp = new ArrayDeque<Integer>();

		while(!s1.isEmpty() || !s2.isEmpty()) {
			
			int n1 = s1.peek() != null ? s1.pop() : 0;
			int n2 = s2.peek() != null ? s2.pop() : 0;
			
			temp.add(n1+n2); 
		}
		while(!temp.isEmpty()) {
			System.out.print(temp.pop());
		}
		
		
	}

}
