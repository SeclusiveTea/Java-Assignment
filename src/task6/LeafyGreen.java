package task6;
/**
 * @author Matthew Wood 08268126
 * Task 6: Inheritance
 * I pledge by honour that this program is solely my own work
 */
//creating subclass
public class LeafyGreen extends Vegetable {
	//create field specific to subclass
	private String type;
	
	//parameterised constructor calling fields from superclass first then field specific to subclass
	public LeafyGreen(double weight, double price, String type) {
		super(weight, price);
		this.setType(type);
	}
	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
