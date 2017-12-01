package command;

import memento.Memento;
import memento.MementoRedo;
import receiver.Enregistreur;

public class Redo implements Command {
	
	private Memento memento;
	private final Enregistreur enregistreur;
	
	public Redo (Enregistreur enregistreur) {
		this.enregistreur =enregistreur;
		this.setMemento(new MementoRedo(this.enregistreur));
	}

	@Override
	public void execute() throws Exception {
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.Redo();
		
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
