package memento;

import receiver.Moteur;

public class MementoDelete implements Memento {

private Moteur moteur;
	
	public MementoDelete(Moteur moteur) {
		this.moteur=moteur;
	}
	
	@Override
	public void execute() {
		this.moteur.coller();
	}


}
