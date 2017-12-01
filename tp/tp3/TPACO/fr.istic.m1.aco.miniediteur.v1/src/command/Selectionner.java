package command;

import java.io.IOException;

import bean.Selection;
import invoker.Editeur;
import receiver.Moteur;

/**
 * Selectionner class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Selectionner implements Command
{
	private final Moteur moteur;
	private Selection selection;
	private final Editeur ihm;

	/**
	 * Create an instance of Selectionner object
	 */
	public Selectionner(Moteur moteur, Editeur ihm){
		this.moteur = moteur;
		this.ihm = ihm;
		
	}

	@Override
	public void execute() throws NumberFormatException, IOException {
		this.selection = this.ihm.getSelection();
		this.moteur.selectionner(this.selection.getBegin(), this.selection.getEnd());
	}


}

