package command;

import java.io.IOException;

import receiver.Moteur;

public class Delete implements Command  {
	private final Moteur moteur;

	/**
	 * Create an instance of Copier object
	 */
	public Delete(Moteur moteur){
		
		this.moteur = moteur;
	}
	
	
	@Override
	public void execute() throws IOException, NumberFormatException {
		this.moteur.delete();
		
	}

}
