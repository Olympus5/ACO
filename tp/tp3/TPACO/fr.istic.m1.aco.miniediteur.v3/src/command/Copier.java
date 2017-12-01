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
	private final Moteur moteur;
	private final Enregistreur enregistreur;

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
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.enregistrerC(this.getMemento());
		this.moteur.copier();
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

