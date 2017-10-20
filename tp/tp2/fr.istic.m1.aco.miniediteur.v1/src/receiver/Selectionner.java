package receiver;

public class Selectionner implements Command
{
	public Moteur moteur;

	public Selectionner(){
		super();

		this.moteur = new MoteurImpl();
	}

	public void execute() {
		this.moteur.selectionner(this.getBegin(), this.getEnd());
	}

	public int getBegin() {
		return 0;
	}
	
	public int getEnd() {
		return 0;
	}
	
}

