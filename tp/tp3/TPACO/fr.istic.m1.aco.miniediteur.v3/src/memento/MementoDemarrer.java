package memento;

import receiver.Enregistreur;

public class MementoDemarrer implements Memento {
	private final Enregistreur enregistreur;
	
	public MementoDemarrer(Enregistreur enregistreur) {
		this.enregistreur=enregistreur;
	}
	
	@Override
	public void execute() {
		this.enregistreur.Demarrer();
	}

}
