package javatraining.coretraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaTrainingOne {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		List<Integer> intList =  new ArrayList<>();
		
		String[] ints = in.nextLine().split(" ");
		for(String s : ints) {
			intList.add(Integer.parseInt(s));
		}
		
		boolean isCons = true;
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println("i :: " + intList.get(i));
			if(i > 0 && i <= intList.size())
			{
				System.out.println("i-1 :: " + intList.get(i-1));
				if(! (intList.get(i) > intList.get(i-1))) {
					isCons = false;
					break;
				}
			}
		}
		
		System.out.println(isCons);
	}
}
