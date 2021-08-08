package javatraining.visitor2;

public class Fruit implements ItemElement {

	private String fruitName;
	private Double price;

	public Fruit(String fruitName, Double price) {
		super();
		this.fruitName = fruitName;
		this.price = price;
	}

	@Override
	public void accept(Visitor vis) {
		vis.apply(this);

	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", price=" + price + "]";
	}

}
