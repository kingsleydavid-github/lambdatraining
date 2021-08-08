package javadp.visitor;

public interface IVisitor {
	public void apply(Item item) throws UnsupportedOperationException;
	public void apply(Order order) throws UnsupportedOperationException;
}
