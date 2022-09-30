package task10;
/**
 * @author Matthew Wood 08268126
 * Task 10: Processing book list
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class AudioBookApp {
	//creates a list as a field
	private List<AudioBook> bookList;
	
	public List<AudioBook> getBookList() {
		return bookList;
	}
	//creates the list and takes the information given by the read data method. Throws exception to the main method.
	public AudioBookApp(String filename) throws IOException {
		bookList = new LinkedList<>();
		readData(filename);
	}
	//reads data from the text file, splits it by comma and adds the strings to the list. throws exception to AudioBookApp(String filename)
	public void readData(String filename) throws IOException {
		bookList = new LinkedList<>();
		Path path = Paths.get(filename);
		List<String> lines = Files.readAllLines(path); //throw the error back to AudioBookApp method.
		for (String line : lines) {
			String[] items = line.split(",");
			String name = items[0];
			int year = Integer.parseInt(items[1]);
			double length = Double.parseDouble(items[2]);
			AudioBook b = new AudioBook(name, year, length);
			bookList.add(b);
		}
	}
	//not part of the assignment, I had a play around here just trying to display a whole list and wanted to keep it for my own reference.
	public void displayList() {
		for (AudioBook b : bookList)
			out.printf("%s %d %.2f\n", b.getName(), b.getYear(), b.getLength());
	}
	//method to get the shortest book in the list
	public AudioBook getShortestBook() {
		AudioBook shortestBook = bookList.get(2);
		for (AudioBook b : bookList) {
			if (b.getLength() < shortestBook.getLength()) {					
				shortestBook = b;
				}
			}
		return shortestBook;
	}
	//method to count the books between 2010 and 2020
	public int countBooks() {
		if (bookList == null || bookList.size() == 0) {
			return 0;
		}
		int count = 0;
		for (AudioBook b : bookList) {
			if (b.getYear() >= 2010  && b.getYear() <= 2020) {					
				count++;
				}
			}
		return count;
	}
	//method to create 3 random book lists
	public void randomBookList() {
		//3 blank lists created
		List<AudioBook> b1 = new LinkedList<>();
		List<AudioBook> b2 = new LinkedList<>();
		List<AudioBook> b3 = new LinkedList<>();
		for (AudioBook b : bookList) {
			//generate random number each time the for loop iterates and insert an item from the booklist based on that number into 1 of the 3 empty lists
			int n = ThreadLocalRandom.current().nextInt(0, 3);
			if (n == 0) {
				b1.add(b);
			}else if (n == 1) {
				b2.add(b);
			}else {
				b3.add(b);
			}	
		}
		//Print out of 3 lists to display.
		out.printf("\n%d books in list #1:\n", b1.size());
		for (AudioBook l1 : b1) {
			out.printf("%s, %d, %.1f\n", l1.getName(), l1.getYear(), l1.getLength());
		}
		out.printf("\n%d books in list #2:\n", b2.size());
		for (AudioBook l2 : b2) {
			out.printf("%s, %d, %.1f\n", l2.getName(), l2.getYear(), l2.getLength());
		}
		out.printf("\n%d books in list #3:\n", b3.size());
		for (AudioBook l3 : b3) {
			out.printf("%s, %d, %.1f\n", l3.getName(), l3.getYear(), l3.getLength());
		}
	}
}
