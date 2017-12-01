package memento;

import receiver.Enregistreur;

public class MementoStopper implements Memento {
	private final Enregistreur enregistreur;
	
	public MementoStopper(Enregistreur enregistreur) {
		this.enregistreur=enregistreur;
	}
	
	@Override
	public void execute() {
		this.enregistreur.Stopper();

	}

}
