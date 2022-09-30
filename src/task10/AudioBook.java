package task10;
/**
 * @author Matthew Wood 08268126
 * Task 10: Processing book list
 * I pledge by honour that this program is solely my own work
 */
public class AudioBook extends Book {
	//creating field
	private double length;
	
	//constructor
	public AudioBook(String name, int year, double length) {
		//calling fields from superclass Book
		super(name, year);
		this.setLength(length);
	}
	//Method to display info to the console
	public void displayInfo() {
		System.out.printf("Book name        %s\n", getName());
		System.out.printf("Publish year     %d\n", getYear());
		System.out.printf("Length (hours)   %.1f\n", length);
	}
	//getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	

}
