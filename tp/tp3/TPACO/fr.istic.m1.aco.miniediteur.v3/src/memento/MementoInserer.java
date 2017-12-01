package memento;

import receiver.Moteur;

public class MementoInserer implements Memento{
	private Moteur moteur;
	private String text;
	public MementoInserer(Moteur moteur,String text) {
		this.moteur=moteur;
		this.text=text;
	}

	@Override
	public void execute() {
		this.moteur.inserer(text);		
	}
	
}
