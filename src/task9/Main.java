package task9;
/**
 * @author Matthew Wood 08268126
 * Task 9: Guessing game
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.out;

import java.io.IOException;

public class Main {
	//calls the data for the guessing game, calls the game loop, and handles the exception if there is one created.
	public static void main(String[] args) {
		String txtfile = "data/capitals.txt";
		
		try {
			GameApp app = new GameApp(txtfile);
			app.repeatGame();
		} catch (IOException e) {
			out.printf("Perhaps missing text file: %s/%s? \n\n", new Main().getClass().getPackage().getName(), txtfile);
		}
	}

}
