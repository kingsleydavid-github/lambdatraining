package lambdatraining.core;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8training {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        Integer t = in.nextInt();                 // Reading input from STDIN
        
        while(t > 0) {
        	Integer n = in.nextInt();                 // Reading input from STDIN
            Integer k = in.nextInt();                 // Reading input from STDIN
            
            Integer[] narr = new Integer[n];
            int idx = 0;
            while(idx < n) {
            	
            	narr[idx] = in.nextInt();
            	idx++;
            }
            moveNTimes(narr, k);
            
            System.out.println(Arrays.stream(narr).map(String::valueOf).collect(Collectors.joining(" ")));
            t--;
        }
        
	}
	
	public static void moveNTimes(Integer[] arr, int n) {
		while(n > 0) {
			int t1 = arr[arr.length -1];
			moveOnePos(arr, t1);
			n--;
		}
	}

	private static void moveOnePos(Integer[] arr, int num) {
		int n = arr.length;
		for(int idx = n-1; idx > 0; idx-- ) {
			arr[idx] = arr[idx-1];
			if(idx-1 == 0) {
				arr[0] = num;
			}
		}
	}
}
