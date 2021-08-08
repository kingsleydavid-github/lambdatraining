package solid.openclosed;

public class OpenClosedMain {

	public static void main(String[] args) {
		
		GraphicEditor ge = new GraphicEditor();
		
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		
		ge.drawShape(s1);
		ge.drawShape(s2);
		
	}
	
}
