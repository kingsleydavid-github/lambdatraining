package javatraining.commandpattern;

//ConcreteCommand class
public class SellStocksOrder implements Order {

	private StockTrade st;

	public SellStocksOrder(StockTrade stockTrade) {
		this.st = stockTrade;
	}
	
	@Override
	public void execute() {
		this.st.sellStock();
	}

	
}
