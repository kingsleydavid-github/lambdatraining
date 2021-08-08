package javacoretest.inheritance;

public interface TestInterOne {
	
	//final int temp() {
	static int tempmain() {
		return 1;
	}
	
	default int tempone() {
		return 2;
	}
	
	int temp();
}
