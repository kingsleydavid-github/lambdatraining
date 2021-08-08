package javatraining.commandpattern;

public class OrdersApp {

	public static void main (String[] args) {
		
		StockTrade receiver = new StockTrade();
		
		Order o1 =  new BuyStocksOrder(receiver);
		Order o2 =  new SellStocksOrder(receiver);
		
		StocksAgent sa = new StocksAgent();
		
		sa.addOrder(o1);
		sa.addOrder(o2);
		sa.addOrder(o2);
		sa.addOrder(o2);
		sa.addOrder(o1);
		sa.addOrder(o1);
		
		sa.undo();
		sa.undo();
		sa.undo();
		sa.undo();
		sa.undo();
		sa.undo();
		
		sa.addOrder(o1);
		
		sa.undo();
		sa.undo();
	}
	
}
