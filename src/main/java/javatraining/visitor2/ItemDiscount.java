package javatraining.visitor2;

public class ItemDiscount implements Visitor {

	private Double discount;

	public ItemDiscount(Double discount) {
		super();
		this.discount = discount;
	}

	@Override
	public void apply(Vegetable vegetable) {

		Double disPrice = vegetable.getPrice() * discount;
		Double totalPrice = vegetable.getPrice() - disPrice;
		vegetable.setPrice(totalPrice);

	}

	@Override
	public void apply(Fruit fruit) {
		Double disPrice = fruit.getPrice() * discount;
		Double totalPrice = fruit.getPrice() - disPrice;
		fruit.setPrice(totalPrice);

	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
