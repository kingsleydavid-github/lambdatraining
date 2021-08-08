package solid.openclosed;

class Rectangle extends Shape {
 	Rectangle() {
 		super.m_type=1;
 	}

	@Override
	public void draw() {
		System.out.println(getDefaultType());
		System.out.println("Drawing Rectangle");
	}
	
 	private static int getDefaultType() {
 		return 1;
 	}
 	
 }