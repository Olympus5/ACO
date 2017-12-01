package command;

import memento.Memento;
import memento.MementoUndo;
import receiver.Enregistreur;

public class Undo implements Command {
	private Memento memento;
	private final Enregistreur enregistreur;
	
	public Undo (Enregistreur enregistreur) {
		this.enregistreur =enregistreur;
		this.setMemento(new MementoUndo(this.enregistreur));
	}

	@Override
	public void execute() throws Exception {
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.Undo();
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
