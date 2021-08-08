package javatraining.commandpattern;

import java.util.ArrayDeque;
import java.util.Deque;

//Invoker class
public class StocksAgent {

	private Deque<Order> orderQueue;  
	
	public StocksAgent() {
		orderQueue =  new ArrayDeque<>();
	}
	
	public void addOrder(Order order) {
		this.orderQueue.addLast(order);
		order.execute();
	}

	public void undo() {
		if(this.orderQueue.isEmpty() ) {
			System.out.println("No further actions to be performed");
		}else {
			this.orderQueue.removeLast();
		}
	}
}
