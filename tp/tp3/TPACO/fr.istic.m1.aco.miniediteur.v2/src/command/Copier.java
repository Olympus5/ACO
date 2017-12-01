package command;

import memento.Memento;
import memento.MementoCopier;
import receiver.Enregistreur;
import receiver.Moteur;


/**
 * Copier class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Copier implements Command
{	
	private Memento memento;
	public final Moteur moteur;
	public final Enregistreur enregistreur;

	/**
	 * Create an instance of Copier object
	 */
	public Copier(Moteur moteur,Enregistreur enregistreur){
		this.moteur = moteur;
		this.enregistreur=enregistreur;
		this.setMemento(new MementoCopier(moteur));
		
	}
	
	@Override
	public void execute() {
		this.moteur.copier();
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

