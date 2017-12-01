package memento;

import receiver.Moteur;

public class MementoCopier implements Memento {
	private Moteur moteur;
	public MementoCopier(Moteur moteur) {
		this.moteur=moteur;
	}
	@Override
	public void execute() {
		this.moteur.copier();
		
	}
	
	
}
