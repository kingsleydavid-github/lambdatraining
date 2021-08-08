package lambdatraining.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProbOne {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String[] ip = in.next().split(",");
		Boolean test = false;
		final Integer one = Integer.parseInt(ip[0]);
		Integer two = Integer.parseInt(ip[1]);

		for (int pow = 1;; pow++) {

			int val = (int) Math.pow(one, pow);
			System.out.println(one + " POW " + pow + "= " + val);

			if (one == 1 || one == 0) {
				break;
			}
			if (val == two) {
				test = true;
			}
			if (val >= two) {
				break;
			}
		}

		System.out.println(test);
	}

}
