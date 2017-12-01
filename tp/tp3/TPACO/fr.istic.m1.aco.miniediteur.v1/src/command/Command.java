package command;

import java.io.IOException;

/**
 * Command interface
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public  interface Command 
{	
	/**
	 * execute an command on the app
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public void execute() throws IOException, NumberFormatException ;
}

