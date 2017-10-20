package receiver;

public class Couper implements Command
{
	public Moteur moteur;
	
	public Couper(){
		super();
		
		this.moteur = new MoteurImpl();
	}
	
	public void execute() {
		this.moteur.couper();	
	}

}

