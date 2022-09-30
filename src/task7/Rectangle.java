package task7;
/**
 * @author Matthew Wood 08268126
 * Task 7: Polymorphism
 * I pledge by honour that this program is solely my own work
 */
public class Rectangle extends Shape {
	//create fields height and width
	private double height;
	private double width;
	
	//parameterised constructor that has field from superclass and 2 fields from subclass
	public Rectangle(String colour, double height, double width) {
		super(colour);
		this.setHeight(height);
		this.setWidth(width);	
	}
	
	//method that overrides the superclass method
	@Override
	public String getShapeType() {
		return("I am a Rectangle");
	}
	//method to calculate rectangle perimeter
	public Double getPerimeter() {
		double perimeter = (getHeight() * 2) + (getWidth() * 2);
		return perimeter;
	}
	
	//getters and setters
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	

}
