package command;

import memento.Memento;
import memento.MementoColler;
import receiver.Enregistreur;
import receiver.Moteur;

/**
 * Couper class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Couper implements Command
{
	private Memento memento;
	private final Moteur moteur;
	private final Enregistreur enregistreur;
	
	/**
	 * Create an instance of Couper object
	 */
	public Couper(Moteur moteur,Enregistreur enregistreur){
		this.moteur = moteur;
		this.enregistreur=enregistreur;
		this.setMemento(new MementoColler(moteur));
	}
	
	@Override
	public void execute() {
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.enregistrerC(this.getMemento());
		this.moteur.couper();	
		
	}

	@Override
	public Memento getMemento() {
		return memento;
	}

	@Override
	public void setMemento(Memento m) {
		this.memento=m;
	}

}

