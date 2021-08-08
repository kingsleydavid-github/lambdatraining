package solid.openclosed;

class Circle extends Shape {
 	Circle() {
 		super.m_type=2;
 	}

	@Override
	public void draw() {
		System.out.println(getDefaultType());
		System.out.println("Drawing Circle");
	}
	
 	private static int getDefaultType() {
 		return 2;
 	}
 	
	
 } 
