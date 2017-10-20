package receiver;


public class IHM
{
	
	public Editeur editeur;

	public IHM(){
		super();
	}

	public String getText() {
		return Buffer.getBuffer().toString();
	}
}

