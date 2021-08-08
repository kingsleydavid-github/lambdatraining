package javadp.visitor;

public class Discount implements IVisitor {

	private Double discount;

	@Override
	public void apply(Item i) throws UnsupportedOperationException {
		int dis = i.getPrice() * discount.intValue() ;
		i.setPrice(i.getPrice() - dis);
	}

	@Override
	public void apply(Order order) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
