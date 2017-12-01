package memento;

import bean.Selection;
import receiver.Moteur;

public class MementoSelectionner implements Memento {
	private Moteur moteur;
	private Selection selection;
	
	public MementoSelectionner(Moteur moteur,Selection selection) {
		this.moteur=moteur;
		this.selection=selection;
	}
	
	@Override
	public void execute() {
		this.moteur.selectionner(this.selection.getBegin(), this.selection.getEnd());

	}

}
