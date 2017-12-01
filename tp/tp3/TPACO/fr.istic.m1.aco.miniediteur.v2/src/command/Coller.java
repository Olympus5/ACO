package command;

import memento.Memento;
import memento.MementoColler;
import receiver.Enregistreur;
import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Coller class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Coller implements Command
{
	private Memento memento;
	public final Moteur moteur;
	public final Enregistreur enregistreur;
	
	/**
	 * Create an instance of Coller object
	 */
	public Coller(Moteur moteur, Enregistreur enregistreur){
		this.moteur = moteur;
		this.enregistreur=enregistreur;
		setMemento(new MementoColler(moteur));
	}

	@Override
	public void execute() {
		this.moteur.coller();
		enregistreur.enregistrer(this.getMemento());
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

