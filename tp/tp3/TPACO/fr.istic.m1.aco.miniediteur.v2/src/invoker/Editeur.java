package invoker;

import java.awt.List;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import bean.Selection;
import command.Command;

/**
 * IHM Class
 * 
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class Editeur {
	public IHM editeur;

	/**
	 * Create an instance of IHM object
	 */
	public Editeur() {
	}

	public void execute(Command cmd) throws Exception {
		cmd.execute();
	}

	public Selection getSelection() throws NumberFormatException, IOException {
		int debut;
		int fin;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("Veuillez entrer le debut de selection: ");

		debut = Integer.valueOf(br.readLine());
		System.out.print("Veuillez entrer le fin de selection: ");
		fin = Integer.valueOf(br.readLine());
		return new Selection(debut, fin);
	}

	public String getText() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Veuillez entrer le text a inserer: ");
		String text = br.readLine(); 
		return text;
	}
}
