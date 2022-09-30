package task6;
/**
 * @author Matthew Wood 08268126
 * Task 6: Inheritance
 * I pledge by honour that this program is solely my own work
 */
//creating super class
public class Vegetable {
	//create fields
	private double weight;
	private double price;
	
	//parameterised constructor
	public Vegetable(double weight, double price) {
		this.setWeight(weight);
		this.setPrice(price);
	}
	
	//getters and setters
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
