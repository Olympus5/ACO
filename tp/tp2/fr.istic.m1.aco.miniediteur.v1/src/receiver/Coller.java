package receiver;

public class Coller implements Command
{
	
	public Moteur moteur;

	public Coller(){
		super();

		this.moteur = new MoteurImpl();
	}

	public void execute() {
		this.moteur.coller();
	}

}

