package receiver;

import java.util.Stack;

import memento.Memento;

public interface Enregistreur {
	public void Demarrer();
	
	public void Stopper();
	
	public void Rejouer();
	
	public void enregistrerM(Memento m);

	void enregistrerC(Memento m);
	
	public void Undo();

	public void Redo();

	int getPosition();

	Stack<Memento> getCommands();

	
}
