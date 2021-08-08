package solid.openclosed;

abstract class Shape {
 	int m_type;
 	public abstract void draw(); 
 	
 	public int getType() {
 		return m_type;
 	}
 	private static int getDefaultType() {
 		return 0;
 	}
 	
 }
