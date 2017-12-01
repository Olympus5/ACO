package command;

import memento.Memento;
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
	public void execute()  {
		this.enregistreur.enregistrerM(this.getMemento());
		this.enregistreur.enregistrerC(this.getMemento());
		this.moteur.delete();
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
