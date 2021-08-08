package javatest.synchron;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Goals {

	public static void main(String[] args) {

		Integer[] stocksProfit = { 5, 7, 9, 13, 11, 6, 6, 3, 3 };
		long target = 12;

		stocksPair(Arrays.asList(stocksProfit), target);

	}

	public static int stocksPair(List<Integer> stocksProfit, long target) {

		int toRet = 0;

		Set<List<Integer>> grps = new HashSet<>();
		for (int i = 0; i < stocksProfit.size(); i++) {
			for (int j = 0; j < stocksProfit.size(); j++) {

				int tot = stocksProfit.get(i) + stocksProfit.get(j);
				if (tot == target) {
					
					List<Integer> pair = new ArrayList<>();
					pair.add(stocksProfit.get(i));
					pair.add(stocksProfit.get(j));

					List<Integer> cross = new ArrayList<>();
					cross.add(stocksProfit.get(j));
					cross.add(stocksProfit.get(i));

					grps.add(pair);
					System.out.println(grps);
					System.out.println(cross);
				}
			}
		}
		System.out.println(grps);
		toRet = grps.size();
		return toRet;
	}

}
