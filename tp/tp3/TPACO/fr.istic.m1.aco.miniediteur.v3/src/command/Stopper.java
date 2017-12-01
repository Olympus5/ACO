package command;

import memento.Memento;
import memento.MementoStopper;
import receiver.Enregistreur;

public class Stopper implements Command{
	private final Enregistreur enregistreur;
	private Memento memento;
	
	public Stopper(Enregistreur enregistreur) {
		this.enregistreur= enregistreur;
		this.setMemento(new MementoStopper(this.enregistreur));
	}
	
	@Override
	public void execute() {
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.enregistrerC(this.getMemento());
		this.enregistreur.Stopper();
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
