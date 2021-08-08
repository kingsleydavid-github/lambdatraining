package javatraining.reverseone;

public class ReverseOne {

	public static void main(String[] args) {
	
		
		String abc = "kingsley";
		reverse(abc);

	}

	private static void reverse(String abc) {
		if(abc == null || abc.length() == 1) {
			System.out.print(abc);
		}else {
			System.out.print(abc.charAt(abc.length() -1));
			reverse( abc.substring(0, abc.length() -1) );
		}
	}

}
