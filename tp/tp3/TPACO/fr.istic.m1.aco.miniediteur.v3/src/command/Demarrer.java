package command;

import memento.Memento;
import memento.MementoDemarrer;
import receiver.Enregistreur;

public class Demarrer implements Command {
	
	private final Enregistreur enregistreur;
	private Memento memento;
	
	public Demarrer(Enregistreur enregistreur) {
		this.enregistreur= enregistreur;
		this.setMemento(new MementoDemarrer(this.enregistreur));
	}
	
	@Override
	public void execute() {
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.enregistrerC(this.getMemento());
		this.enregistreur.Demarrer();
		
	}

	@Override
	public Memento getMemento() {
		return this.memento;
	}

	@Override
	public void setMemento(Memento m) {
		this.memento=m;
		
	}


}
