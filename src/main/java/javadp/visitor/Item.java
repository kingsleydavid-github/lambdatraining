package javadp.visitor;

public class Item implements IVisitable {

	private String itemName;
	private Integer price;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Item(String name, Integer price) {
		this.itemName = name;
		this.price = price;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.apply(this);
	}

}
