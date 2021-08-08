package javatraining.visitor2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class BillingMgmt {

	public static void main(String[] args) {

		List<ItemElement> items = new ArrayList<>();
		items.add(new Fruit("Orange", 200.00));
		items.add(new Fruit("Apple", 250.00));
		items.add(new Fruit("Mango", 300.00));
		items.add(new Vegetable("Tomato", 50.00));
		items.add(new Vegetable("Carrot", 100.00));
		items.add(new Vegetable("Peas", 300.00));

		items.forEach(i -> {
			System.out.println(i);
		});

		ItemDiscount dis = new ItemDiscount(0.15);

		for (ItemElement el : items) {
			el.accept(dis);
		}
		System.out.println("After Discount...");

		items.forEach(i -> {
			System.out.println(i);
		});

	}

}
