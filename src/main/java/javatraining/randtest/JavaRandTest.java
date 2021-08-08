package javatraining.randtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaRandTest {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		Random r = new Random();
		r.ints(5, 10, 20).forEach(i -> {
			System.out.println(i);
		});
		
	}

}
