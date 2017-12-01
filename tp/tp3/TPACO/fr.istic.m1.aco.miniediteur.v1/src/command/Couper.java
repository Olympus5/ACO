package command;

import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Couper class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Couper implements Command
{
	private final Moteur moteur;
	
	/**
	 * Create an instance of Couper object
	 */
	public Couper(Moteur moteur){
		
		this.moteur = moteur;
	}
	
	@Override
	public void execute() {
		this.moteur.couper();	
	}

}

