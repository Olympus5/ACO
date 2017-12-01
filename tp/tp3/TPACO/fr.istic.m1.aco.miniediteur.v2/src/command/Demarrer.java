package command;

import memento.Memento;
import receiver.Enregistreur;

public class Demarrer implements Command {
	public final Enregistreur enregistreur;
	public Demarrer(Enregistreur enregistreur) {
		this.enregistreur= enregistreur;
	}
	
	@Override
	public void execute() {
		this.enregistreur.Demarrer();
		
	}

	@Override
	public Memento getMemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMemento(Memento m) {
		// TODO Auto-generated method stub
		
	}


}
