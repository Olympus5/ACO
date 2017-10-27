package command;

import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Copier class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Copier implements Command
{	
	public Moteur moteur;

	/**
	 * Create an instance of Copier object
	 */
	public Copier(){
		super();
		
		this.moteur = new MoteurImpl();
	}
	
	@Override
	public void execute() {
		this.moteur.copier();
	}
}

