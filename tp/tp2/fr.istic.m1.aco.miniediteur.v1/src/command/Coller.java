package command;

import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Coller class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Coller implements Command
{
	
	public Moteur moteur;

	/**
	 * Create an instance of Coller object
	 */
	public Coller(){
		super();

		this.moteur = new MoteurImpl();
	}

	@Override
	public void execute() {
		this.moteur.coller();
	}

}

