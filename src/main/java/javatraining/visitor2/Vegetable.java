package javatraining.visitor2;

public class Vegetable implements ItemElement {

	private String vegName;
	private Double price;

	public Vegetable(String vegName, Double price) {
		super();
		this.vegName = vegName;
		this.price = price;
	}

	@Override
	public void accept(Visitor vis) {
		vis.apply(this);
	}

	public String getVegName() {
		return vegName;
	}

	public void setVegName(String vegName) {
		this.vegName = vegName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vegetable [vegName=" + vegName + ", price=" + price + "]";
	}

}
