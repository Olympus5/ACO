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
	public Moteur moteur;
	
	/**
	 * Create an instance of Couper object
	 */
	public Couper(){
		super();
		
		this.moteur = new MoteurImpl();
	}
	
	@Override
	public void execute() {
		this.moteur.couper();	
	}

}

