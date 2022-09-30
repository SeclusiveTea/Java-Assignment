package task10;
/**
 * @author Matthew Wood 08268126
 * Task 10: Processing book list
 * I pledge by honour that this program is solely my own work
 */

public class Book {
	//creating fields
	private String name;
	private int year;
	
	//constructor
	public Book(String name, int year) {
		this.setName(name);
		this.setYear(year);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
