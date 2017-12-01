package command;

import memento.Memento;
import memento.MementoRejouer;
import receiver.Enregistreur;

public class Rejouer implements Command {
	private final Enregistreur enregistreur;
	private Memento memento;
	
	public Rejouer(Enregistreur enregistreur) {
		this.enregistreur = enregistreur;
		this.setMemento(new MementoRejouer(this.enregistreur));
	}
	
	@Override
	public void execute() {
		this.enregistreur.enregistrerC(this.getMemento());
		this.enregistreur.Rejouer();
	}

	@Override
	public Memento getMemento() {
		return this.memento;
	}

	@Override
	public void setMemento(Memento m) {
		this.memento=m;
		
	}

}
