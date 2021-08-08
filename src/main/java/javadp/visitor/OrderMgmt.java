package javadp.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderMgmt {

	public static void main(String[] args) {

		Item i1 = new Item("soap", 25);
		Item i2 = new Item("paste", 40);
		Item i3 = new Item("ghee", 100);

		List<IVisitable> orders = new ArrayList<>();
		orders.add(i1);
		orders.add(i2);
		orders.add(i3);

		Discount d1 = new Discount();
		d1.setDiscount(0.25);

		for (IVisitable i : orders) {
			i.accept(d1);
		}

	}

}
