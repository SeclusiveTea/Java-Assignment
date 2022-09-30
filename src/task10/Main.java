package task10;
/**
 * @author Matthew Wood 08268126
 * Task 10: Processing book list
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//calls the data from the text file, calls class AudioBookApp to access list creation and calls AudioBook class to operate the shortest book method. Also handles potential exception.
		String txtfile = "data/bookrecords.txt";
		try {
			AudioBookApp app = new AudioBookApp(txtfile);
			AudioBook shortest = app.getShortestBook();
			//outputs to display
			if(shortest != null) {
				out.println("Shortest book:");
				shortest.displayInfo();
			}
			out.printf("\nBooks published between 2010 - 2020: %d\n", app.countBooks());
			app.randomBookList();
		//produced if there is exception
		} catch (IOException e) {
			out.printf("Perhaps missing text file: %s/%s? \n\n", new Main().getClass().getPackage().getName(), txtfile);
		}

	}
}