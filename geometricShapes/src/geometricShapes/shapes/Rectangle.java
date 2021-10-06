package geometricShapes.shapes;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getArea() {
		return this.length * this.breadth;
	}
	
	public int getPerimeter() {
		return 2 * (this.length + this.breadth);
	}
	
}
