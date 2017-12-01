package memento;

import receiver.Moteur;

public class MementoColler implements Memento {
	private Moteur moteur;
	
	public MementoColler(Moteur moteur) {
		this.moteur=moteur;
	}
	
	@Override
	public void execute() {
		this.moteur.coller();
	}


}
