package task3;
/**
 * @author Matthew Wood 08268126
 * Task 3:User input validation
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;
import java.util.*;

public class Main {
	//creating class variable for input.
	static Scanner numInput = new Scanner(in);

	public static void main(String[] args) {
		//call method from below
		gradeChecker();
	}
	public static void gradeChecker() {
		
		Double grade; //initialise variable for user input
		
		//while loop to make sure the score is a valid score
		while(true) {
			out.print("Enter a score: ");
			grade = Double.parseDouble(numInput.nextLine());
			if (grade < 0 || grade > 100) {
				out.println("Invalid Score");
			} else {
				break;
			}	
		}
		//if statement to rate the score that is entered.
		out.printf("Score %.1f will receive grade", grade);
		if (grade < 50 ) {
			out.print(" D");
		} else if (grade >= 50 && grade < 70) {
			out.print(" C");
		} else if (grade >= 70 && grade < 80) {
			out.print(" B");
		} else {
			out.print(" A");
		}
	}
}
