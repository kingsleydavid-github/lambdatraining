package javatraining.exception;

public class ParentCls {
	
	public void methodOne() throws Exception {
		System.out.println("Parent msethodOne");
	}
	
	public void testMethod(Integer a) {
		System.out.println("testMethod with Int param" + a);
	}

	public void testMethod(String a) {
		System.out.println("testMethod with String param" + a);
	}

}
