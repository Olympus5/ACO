package command;

import memento.Memento;
import memento.MementoColler;
import memento.MementoDelete;
import receiver.Enregistreur;
import receiver.Moteur;

public class Delete implements Command {
	private Memento memento;
	public final Moteur moteur;
	public final Enregistreur enregistreur;
	
	public Delete(Moteur moteur, Enregistreur enregistreur) {
		this.moteur = moteur;
		this.enregistreur = enregistreur;
		setMemento(new MementoDelete(moteur));
	}
	
	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub

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
