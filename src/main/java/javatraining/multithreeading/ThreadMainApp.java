package javatraining.multithreeading;

public class ThreadMainApp {

	public static void main(String[] args) {

		Compute c1 = new Compute("COMP1", 1);
		Compute c2 = new Compute("COMP2", 3);
		Compute c3 = new Compute("COMP3", 2);
		Compute c4 = new Compute("COMP4", 4);

		c1.start();
		c2.start(); 
		c3.start(); 
		c4.start();

		c1.join();
		c2.join();
		c3.join();
		c4.join();
		
		System.out.println("Demo join test");
	}
}
