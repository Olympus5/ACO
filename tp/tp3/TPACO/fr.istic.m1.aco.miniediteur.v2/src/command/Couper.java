package command;

import memento.Memento;
import memento.MementoColler;
import memento.MementoCopier;
import receiver.Enregistreur;
import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Couper class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Couper implements Command
{
	private Memento memento;
	public final Moteur moteur;
	public final Enregistreur enregistreur;
	
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
		this.moteur.couper();	
		this.enregistreur.enregistrer(this.getMemento());
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

