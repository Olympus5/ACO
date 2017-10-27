package command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import receiver.Moteur;
import receiver.MoteurImpl;

/**
 * Inserer class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Inserer implements Command
{
	
	public Moteur moteur;

	private static InputStreamReader isr;
	private static BufferedReader br;

	/**
	 * Create an instance of Inserer object
	 */
	public Inserer(){
		super();
		this.moteur = new MoteurImpl();
	}

	@Override
	public void execute() {
		this.moteur.inserer(this.getText());
	}

	/**
	 * Read a line of text from user input
	 */
	public static String getText() {
			try {
				isr = new InputStreamReader(System.in);
				br = new BufferedReader(isr);
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(isr != null) {
					try {
						isr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if(br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			return "";
	}
}

