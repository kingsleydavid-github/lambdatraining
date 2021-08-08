package javatraining.commandpattern;

//ConcreteCommand class
public class BuyStocksOrder implements Order {

	private StockTrade st;

	public BuyStocksOrder(StockTrade stockTrade) {
		this.st = stockTrade;
	}
	
	@Override
	public void execute() {
		this.st.buyStock();
	}

	
}
