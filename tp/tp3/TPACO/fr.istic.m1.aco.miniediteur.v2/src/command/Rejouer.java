package command;

import memento.Memento;
import receiver.Enregistreur;

public class Rejouer implements Command {
	public final Enregistreur enregistreur;

	public Rejouer(Enregistreur enregistreur) {
		this.enregistreur = enregistreur;
	}
	@Override
	public void execute() {
		this.enregistreur.Rejouer();
	}

	@Override
	public Memento getMemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMemento(Memento m) {
		// TODO Auto-generated method stub
		
	}

}
