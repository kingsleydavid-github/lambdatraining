package javatraining.coretraining;

public class MyStackMain {

	public static void main(String[] args) {
		
		try {
			
			MyStack<Integer> m1 = new MyStack<Integer>();
			
			m1.push(2);
			m1.push(3);
			m1.push(45);
			m1.push(55);
			m1.push(5);
			
			m1.printall();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
