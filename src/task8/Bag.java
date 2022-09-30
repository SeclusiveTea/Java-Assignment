package task8;
/**
 * @author Matthew Wood 08268126
 * Task 8: Recursive Programming
 * I pledge by honour that this program is solely my own work
 */
public class Bag {
	//creating fields
	private String colour;
	private double capacity;
	
	//constructor
	public Bag(String colour, double capacity) {
		this.setColour(colour);
		this.setCapacity(capacity);
	}
	
	//getters and setters
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	
}
