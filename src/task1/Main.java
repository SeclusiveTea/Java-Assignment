package task1;
import static java.lang.System.*;

/**
 * @author Matthew Wood 08268126
 * Task 1: Display formatted output
 * I pledge by honour that this program is solely my own work
 */

public class Main {
	public static void main(String[] args) {
		//set the format for the output 
		String fmt = "%-20s%-20s\n";
		//header
		out.printf(fmt, "Escape sequence", "Description");
		out.println("-".repeat(40));
		//information outputted in desired format
		out.printf(fmt, "\\n", "New line character");
		out.printf(fmt, "\\t", "Horizontal tab character");
		out.printf(fmt, "\\\"", "Double quote character");
		out.printf(fmt, "\\b", "Backspace character");
	}
}
