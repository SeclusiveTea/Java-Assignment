package task8;
/** 
 * @author Matthew Wood 08268126
 * Task 8: Recursive Programming
 * I pledge by honour that this program is solely my own work
 */
import java.util.*;

//recursive function to calculate total capacity of the bags
public class BagApp {
	public double calcTotalCapacity(List<Bag> baglist) {
		if (baglist == null || baglist.size() == 0) return 0;
		double firstCap = baglist.get(0).getCapacity();
		List<Bag> sub = baglist.subList(1, baglist.size());
		return firstCap + calcTotalCapacity(sub);
	}
}
