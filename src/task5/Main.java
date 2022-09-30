package task5;
/**
 * @author Matthew Wood 08268126
 * Task 5: Class and Instance
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		//create list and populate list with new instances of the Note class.
		List<Note> notes = new LinkedList<>();
		notes.add(new Note("D", 19));
		notes.add(new Note("C", 20));
		notes.add(new Note("F", 31));
		notes.add(new Note("B", 45));
		notes.add(new Note("C", 73));
		notes.add(new Note("F", 13));
		notes.add(new Note("B", 34));
		notes.add(new Note("C", 53));
		
		//call the method below
		processNotes(notes);	
	}
	public static void processNotes(List<Note> notes) {
		//container variable for total
		int total = 0;
		//print the note using the Note class method and add duration to the total for each instance in the list
		for(Note e: notes) {
			total += e.getDuration();
			e.playNote();
		}
		out.printf("\nTotal Duration: %d seconds", total);
	}
}
