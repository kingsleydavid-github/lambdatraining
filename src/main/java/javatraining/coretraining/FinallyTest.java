package javatraining.coretraining;

public class FinallyTest {

	public static void main(String[] args) {
		
		try {
			System.out.println("Main");
			
			throw new NoClassDefFoundError();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Completed");
		}
		
	}
	
}
