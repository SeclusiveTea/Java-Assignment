package task9;
/**
 * @author Matthew Wood 08268126
 * Task 9: Guessing game
 * I pledge by honour that this program is solely my own work
 */

public class Country {
	//creating fields
	private String name;
	private String capital;
	private int population;
	
	//constructor
	public Country(String name, String capital, int population) {
		this.setName(name);
		this.setCapital(capital);
		this.setPopulation(population);
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
}
