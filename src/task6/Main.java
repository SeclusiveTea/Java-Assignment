package task6;
/**
 * @author Matthew Wood 08268126
 * Task 6: Inheritance
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		//create and populate a list of vegetables each of which are instances of the LeafyGreen subclass 
		List<LeafyGreen> veges = new LinkedList<>();
		veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
		veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
		veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
		veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
		veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
		veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
		veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
		veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
		veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
		veges.add(new LeafyGreen(26, 4.8, "Broccoli"));
		//call the method below
		calculateStats(veges);

	}
	public static void calculateStats(List<LeafyGreen> list) {
		//return if list is empty
		if(list == null || list.size() == 0)
			return;
		//set variables
		double totalCost = 0;
		double cabbageWeight = 0;
		double broccoliWeight = 0;
		double lettuceWeight = 0;
		//work out total vegetable cost, and total weight of each of the types of vegetables
		for(LeafyGreen e : list) {
			totalCost += e.getWeight() * e.getPrice();
			if (e.getType().equalsIgnoreCase("cabbage")) {
				cabbageWeight += e.getWeight();
			} else if (e.getType().equalsIgnoreCase("broccoli")) {
			broccoliWeight += e.getWeight();	
			} else {
				lettuceWeight += e.getWeight();
			}
		}
		//print the output
		out.printf("Total vegetable cost: $%.1f\n", totalCost);
		out.printf("Total Cabbage weight: %.1f kg\n", cabbageWeight);
		out.printf("Total Broccoli weight: %.1f kg\n", broccoliWeight);
		out.printf("Total Lettuce weight: %.1f kg\n", lettuceWeight);
	}
}
