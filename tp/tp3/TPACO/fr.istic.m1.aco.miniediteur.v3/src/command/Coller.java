package command;

import memento.Memento;
import memento.MementoColler;
import receiver.Enregistreur;
import receiver.Moteur;

/**
 * Coller class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Coller implements Command
{
	private Memento memento;
	private final Moteur moteur;
	private final Enregistreur enregistreur;
	
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
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.enregistrerC(this.getMemento());
		this.moteur.coller();
		
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

