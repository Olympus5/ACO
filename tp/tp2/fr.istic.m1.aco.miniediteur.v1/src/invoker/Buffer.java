package invoker;

/**
 * Buffer class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Buffer {
	private static StringBuffer buffer = new StringBuffer();
	private static String selection;
	
	/**
	 * Add at the end of line a characters sequence
	 * @param s The characters sequence
	 */
	public static void appendString(String s) {
		buffer.append(s);
	}
	
	/**
	 * Add at the offset position a characters sequence
	 * @param offset Where the characters sequence must be insert
	 * @param s The characters sequence
	 */
	public static void insertString(int offset, String s) {
		buffer.insert(offset, s);
	}
	
	/**
	 * Getter
	 * @param begin
	 * @param end
	 * @return
	 */
	public static void setSelection(int begin, int end) {
		selection = buffer.substring(begin, end);
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getSelection() {
		return selection;
	}
	
	/**
	 * Getter
	 * @return buffer
	 */
	public static StringBuffer getBuffer() {
		return buffer;
	}
	
	/**
	 * Setter
	 * @param s the new String value to init the buffer
	 */
	public static void setBuffer(String s) {
		buffer = new StringBuffer(s);
	}
	
	/**
	 * Clean the an element in the buffer
	 */
	public static void clean() {
		buffer.replace(buffer.indexOf(selection), (buffer.indexOf(selection) + selection.length()), "");
	}
}
