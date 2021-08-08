package javatraining.visitor2;

public interface Visitor {
	public void apply(Vegetable vegetable);
	public void apply(Fruit fruit);
}
