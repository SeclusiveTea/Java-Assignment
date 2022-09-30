package task7;
/**
 * @author Matthew Wood 08268126
 * Task 7: Polymorphism
 * I pledge by honour that this program is solely my own work
 */
public class Shape {
	//create field colour
	private String colour;
	//constructor with colour parameter
	public Shape(String colour) {
		this.setColour(colour);
	}
	//method to return string
	public String getShapeType() {
		return("I'm a Shape");
	}
	//getters and setters
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}
