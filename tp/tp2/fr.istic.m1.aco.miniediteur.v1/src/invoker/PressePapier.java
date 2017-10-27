package invoker;


/**
 * PressePapier class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class PressePapier {
	public static String pp;
	
	/**
	 * Save some characters in the clipboard
	 * @param The characters
	 */
	public static void save(String buf) {
		pp = buf;
	}
	
	/**
	 * Clean the clipboard
	 */
	public static void delete() {
		pp = "";
	}
}
