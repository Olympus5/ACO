package receiver;

public class PressePapier {
	public static String pp;
	
	public static void save(String buf) {
		pp = buf;
	}
	
	public static void delete() {
		pp = "";
	}
}
