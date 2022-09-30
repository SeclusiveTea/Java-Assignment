package task2;

/**
 * @author Matthew Wood 08268126
 * Task 2: Arithmetic calculation taking input from user
 * I pledge by honour that this program is solely my own work
 */

//importing packages for print and scanner
import static java.lang.System.*;
import java.util.*;

public class Main {
	//creating class variable for input.
	static Scanner numInput = new Scanner(in);

	public static void main(String[] args) {
		//call method from below
		askNumber();

	}
	public static void askNumber() {
		//prompt user for input
		out.print("Enter circle radius: ");
		//create variable to receive input
		double radius = Double.parseDouble(numInput.nextLine());
		//calculate perimiter using input
		double perimeter = radius * 2 * Math.PI;
		//calculate area using input
		double area = radius * radius * Math.PI;
		
		//formatting output
		String fmtln1 = "%-18s%-12s%15s\n";
		String fmtln2 = "%-18.2f%-12.2f%15.2f\n";
		out.printf(fmtln1, "Radius", "Perimeter", "Area");
		out.println("-".repeat(45));
		out.printf(fmtln2, radius, perimeter, area);	
	}
}
