package receiver;


public class Inserer implements Command
{
	
	public Moteur moteur;

	public Inserer(){
		super();
		this.moteur = new MoteurImpl();
	}

	public void execute() {
		this.moteur.inserer(this.getText());
	}
	
	public String getText() {
		return "";
	}

}

