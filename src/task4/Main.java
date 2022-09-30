package task4;
/**
 * @author Matthew Wood 08268126
 * Task 4: Array and List
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;
import java.util.*;

public class Main {
	//create scanner for user input
	static Scanner input = new Scanner(in);

	public static void main(String[] args) {
		//ask user to input a line of colours
		out.print("Enter first line of colours: ");
		String line1 = input.nextLine();
		String[] line1Split = line1.split(",");
		//ask user to input a second line of colours
		out.print("Enter second line of colours: ");
		String line2 = input.nextLine();
		String[] line2Split = line2.split(",");
		//create new list
		List<String> duplicates = new LinkedList<>();
		//add lines of colours that user input into lists
		int count = 0;
		for(String e1 : line1Split) {
			for(String e2 : line2Split) {
				if(e1.equalsIgnoreCase(e2)) {
					duplicates.add(e1);
					count++;
				}
			}
		}
		//print the output
		out.printf("You entered %d colours in the first list\n", line1Split.length);
		out.printf("You entered %d colours in the second list\n", line2Split.length);
		out.printf("Number of overlapping colours: %d\n" ,count);
		out.println("Overlapping colours are as follows:");
		
		for(String e : duplicates) {
			out.println(e);
		}		
	}
}

