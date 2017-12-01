package command;

import memento.Memento;

/**
 * Command interface
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public  interface Command 
{	
	/**
	 * execute an command on the app
	 * @throws Exception 
	 */
	public void execute() throws Exception ;
	public Memento getMemento();
	public void setMemento(Memento m);
	
}

