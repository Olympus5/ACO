package command;

import java.io.IOException;

import bean.Selection;
import invoker.Editeur;
import memento.Memento;
import memento.MementoSelectionner;
import receiver.Enregistreur;
import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Selectionner class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Selectionner implements Command
{
	private final Moteur moteur;
	private final Enregistreur enregistreur;
	private final Editeur ihm;
	
	private Selection selection;
	private Memento memento;

	/**
	 * Create an instance of Selectionner object
	 */
	public Selectionner(Moteur moteur, Editeur ihm, Enregistreur enregistreur){
		this.moteur = moteur;
		this.ihm = ihm;
		this.enregistreur=enregistreur;
		
	}

	@Override
	public void execute() throws IllegalArgumentException, IOException {
		this.selection= this.ihm.getSelection();
		this.setMemento(new MementoSelectionner(this.moteur,this.selection));
		this.moteur.selectionner(this.selection.getBegin(), this.selection.getEnd());
		this.enregistreur.enregistrer(this.getMemento());
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

