package receiver;

public class Copier implements Command
{	
	public Moteur moteur;

	public Copier(){
		super();
		
		this.moteur = new MoteurImpl();
	}
	
	public void execute() {
		this.moteur.copier();
	}



}

