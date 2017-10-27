package command;

import invoker.Buffer;
import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Selectionner class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Selectionner implements Command
{
	private Moteur moteur;
	private static int begin;
	private static int end;
	private static int length;

	/**
	 * Create an instance of Selectionner object
	 */
	public Selectionner(){
		super();

		this.moteur = new MoteurImpl();
	}

	@Override
	public void execute() {
		this.moteur.selectionner(this.begin, this.end);
	}

	/**
	 * Initialize the beginning position of te selection and the length of the selection
	 * @param s The selection
	 */
	public void setBegin(String s) {
		this.length = s.length();
		this.begin = Buffer.getBuffer().indexOf(s);
	}
	
	/**
	 * Initialize the ending position of the selection
	 */
	public void setEnd() {
		this.end = this.begin;
	}
}

