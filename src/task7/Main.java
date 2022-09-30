package task7;
/**
 * @author Matthew Wood 08268126
 * Task 7: Polymorphism
 * I pledge by honour that this program is solely my own work
 */
import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		//create and populate a list of shapes, 2 as instances of Shape class and 2 as instances of Rectangle subclass
		List<Shape> shapes = new LinkedList<>();
		shapes.add(new Shape("White"));
		shapes.add(new Rectangle("Red", 10, 6));
		shapes.add(new Rectangle("Black", 20, 9));
		shapes.add(new Shape("Orange"));
		//call method from below to produce output part 1
		showShapeNames(shapes);
		
		//create 1st array containing instances of the rectangle subclass
		Rectangle[] rectangleArray1 = {
				new Rectangle("White", 4, 3),
				new Rectangle("Red", 9, 5),
				new Rectangle("Purple", 3, 6),
				new Rectangle("Orange", 15, 10),
				new Rectangle("Black", 4, 14),
		};
		//create 2nd array containing instances of the rectangle subclass
		Rectangle[] rectangleArray2 = {
				new Rectangle("Pink", 3, 4),
				new Rectangle("Red", 10, 2),
				new Rectangle("White", 8, 5),
				new Rectangle("Blue", 14, 4),
				new Rectangle("Bindle", 10, 15),
		};
		//calls the method below to produce output part 2
		countOverlapRectangles(rectangleArray1, rectangleArray2);

	}

	public static void showShapeNames(List<Shape> list) {
		//if list is empty, exit method
		if (list == null || list.size() == 0) return;
		//perform the class method getShape type of each of the instances in the list
		for(Shape s : list) {
			out.println(s.getShapeType());
		}
	}
	public static void countOverlapRectangles(Rectangle[] group1, Rectangle[] group2) {
		//ensure array has values within before continuing
		if (group1.length == 0 || group2.length == 0) return;
		//count variable for colours
		int countColour = 0;
		//count variable for perimeter
		int countPerimeter = 0;
		//iterates array to count duplicate colours, calls method to calculate perimeter and counts duplicate perimeters 
		for(Rectangle r1 : group1) {
			for(Rectangle r2 : group2) {
				if(r1.getColour().equals(r2.getColour())) {
					countColour++;
				}
				if(r1.getPerimeter().equals(r2.getPerimeter())) {
					countPerimeter++;
				}
			}
		}
		
		out.printf("There are %d Rectangle objects with overlapping colour between the two arrays\n", countColour);
		out.printf("There are %d Rectangle objects with overlapping perimeter between the two arrays\n", countPerimeter);
	}
}
