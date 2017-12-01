package memento;

import receiver.Enregistreur;

public class MementoRejouer implements Memento {
	private final Enregistreur enregistreur;
	
	public MementoRejouer(Enregistreur enregistreur) {
		this.enregistreur=enregistreur;
	}
	
	@Override
	public void execute() {
		this.enregistreur.Rejouer();
	}

}
