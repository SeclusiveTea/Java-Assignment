package task5;
/**
 * @author Matthew Wood 08268126
 * Task 5: Class and instance
 * I pledge by honour that this program is solely my own work
 */
import static java.lang.System.*;

public class Note {
	//create fields
	private String pitch;
	private int duration;
	
	//create parameterized constructor
	public Note(String pitch, int duration) {
		this.setPitch(pitch);
		this.setDuration(duration);
	}
	
	//create method to print note
	public void playNote() {
		out.printf("The note %s is played for %d seconds\n", pitch, duration);
	}
	
	//getters and setters
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
}
