package receiver;

import bean.Selection;
import invoker.IHM;

/**
 * Moteur interface
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public  interface Moteur 
{
    public IHM editeur = new IHM();

    /**
     * Paste a string into the buffer
     */
	public void coller() ;

	/**
	 * Copy a part of the buffer into the clipboard
	 */
	public void copier() ;

	/**
	 * Delete a part of the buffer and copy this into the clipboard
	 */
	public void couper() ;

	/**
	 * Insert a sequence of characters at the end of buffer
	 * @param s The characters sequence
	 */
	public void inserer(String s) ;

	/**
	 * Select a part of the buffer
	 * @param start Where the selection begin
	 * @param end Where the selection finish
	 */
	public void selectionner(int start, int end) ;

	public void delete();
	
	StringBuffer getBuffer();

	String getPressePapier();

	Selection getSelection();

	
}
