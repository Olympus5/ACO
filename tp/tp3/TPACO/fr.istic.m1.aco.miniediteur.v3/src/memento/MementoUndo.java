package memento;

import receiver.Enregistreur;

public class MementoUndo implements Memento {
	public final Enregistreur enregistreur;
	
	public MementoUndo(Enregistreur enregistreur) {
		this.enregistreur = enregistreur;
	}
	
	
	@Override
	public void execute() {
		this.enregistreur.Undo();
	}

}
