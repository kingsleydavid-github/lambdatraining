package javadp.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<IVisitable> items;

	public Order() {
		this.items = new ArrayList<>();
	}
	
	public List<IVisitable> getItems() {
		return items;
	}

	public void addItems(IVisitable items) {
		this.items.add(items);
	}
}
