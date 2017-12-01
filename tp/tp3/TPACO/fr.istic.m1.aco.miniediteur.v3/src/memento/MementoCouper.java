package memento;

import receiver.Moteur;

public class MementoCouper implements Memento {
	private Moteur moteur;
	
	public MementoCouper(Moteur moteur) {
		this.moteur = moteur;
	}
	@Override
	public void execute() {
		this.moteur.couper();
		
	}

}
