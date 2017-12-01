package receiver;

import command.Command;
import memento.Memento;

public interface Enregistreur {
	public void Demarrer();
	
	public void Stopper();
	
	public void Rejouer();
	
	public void enregistrer(Memento m);
}
