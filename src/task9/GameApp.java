package task9;
/**
 * @author Matthew Wood 08268126
 * Task 9: Guessing game
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class GameApp {
	//creates new scanner instance
	static Scanner input = new Scanner(in);
	//creates a field that is a list type
	private List<Country> countryList;
	
	//creates the list and takes the information given by the read data method. throws exception to the main method
	public GameApp(String filename) throws IOException {
		countryList = new LinkedList<>();
		readData(filename);
	}
	//reads data from the text file, splits it by comma and adds the strings to the list. Throws exception to GameApp(String filename). 
	public void readData(String filename) throws IOException {
		Path path = Paths.get(filename);
		List<String> lines = Files.readAllLines(path);
		for (String line : lines) {
			String[] items = line.split(",");
			String name = items[0];
			String capital = items[1];
			int population = Integer.parseInt(items[2]);
			Country c = new Country(name, capital, population);
			countryList.add(c);
		}
	}
	//allows user to replay the game, this is the main method called in main
	public void repeatGame() {
		while(true) {
			game(); //start a game
			out.print("Play again? (y/n): ");
			if(input.nextLine().equalsIgnoreCase("n")) {
				out.println("Bye");
				return; //break;
			}
		}
	}
	//game loop
	public void game() {
		String response;
		
		while(true) {
			int n = ThreadLocalRandom.current().nextInt(0, 5);
			Country c = countryList.get(n);
			//allows 3 tries before the correct answer is given.
			for(int i=0; i<3; i++) {
				out.printf("What is the capital of %s? ", c.getName());
				response = input.nextLine();
				if (response.equalsIgnoreCase(c.getCapital())) {
					out.println("Well Done!");
					break;
				} else {
					out.printf("Incorrect. That was attempt %d.\n", i + 1);
				}	
			}
			out.printf("The correct answer is %s.\n", c.getCapital());
			out.printf("%s is a country of %d million.\n", c.getName(), c.getPopulation());
			break;
			
		}

	}
	
}
