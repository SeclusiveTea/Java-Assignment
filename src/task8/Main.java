package task8;
/**
 * @author Matthew Wood 08268126
 * Task 8: Recursive Programming
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//create and populate list
		List<Bag> bags = new LinkedList<>();
		bags.add(new Bag("blue", 4.1));
		bags.add(new Bag("red", 4.2));
		bags.add(new Bag("orange", 4.6));
		
		//call class bag app and output the recursive function
		BagApp bgapp = new BagApp();
		double totalCapacity = bgapp.calcTotalCapacity(bags);
		out.printf("Total capacity: %.2f\n", totalCapacity);
		out.printf("Total number of bags: %d\n", bags.size());
	}
}

