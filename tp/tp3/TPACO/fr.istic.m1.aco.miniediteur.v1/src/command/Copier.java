package command;

import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Copier class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Copier implements Command {	
	private final Moteur moteur;

	/**
	 * Create an instance of Copier object
	 */
	public Copier(Moteur moteur){
		
		this.moteur = moteur;
	}
	
	@Override
	public void execute() {
		this.moteur.copier();
	}
}

