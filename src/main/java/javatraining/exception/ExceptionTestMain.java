package javatraining.exception;

public class ExceptionTestMain {

	public static void main(String[] args) {
		ParentCls p1 =  new ParentCls();
		ParentCls p2 =  new ChildClsOne();
		
		try {
			p1.methodOne();
			p2.methodOne();
			
			p1.testMethod(1);
			p1.testMethod("2");
			
			// p1.testMethod(null); // testMethod(null) is ambigious
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
