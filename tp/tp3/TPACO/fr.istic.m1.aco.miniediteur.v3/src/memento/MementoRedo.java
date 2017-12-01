package memento;

import receiver.Enregistreur;

public class MementoRedo implements Memento {

public final Enregistreur enregistreur;
	
	public MementoRedo(Enregistreur enregistreur) {
		this.enregistreur = enregistreur;
	}
	
	
	@Override
	public void execute() {
		this.enregistreur.Redo();
	}

}
