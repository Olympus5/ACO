package receiver;

import command.Selectionner;
import invoker.Buffer;
import invoker.PressePapier;

/**
 * MoteurImpl class
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class MoteurImpl implements Moteur {

	@Override
	public void coller() {
		Buffer.appendString(PressePapier.pp);
	}
	
	@Override
	public void copier() {
		PressePapier.save(Buffer.getBuffer().toString());
	}
	
	@Override
	public void couper() {
		PressePapier.save(Buffer.getSelection());
		Buffer.clean();
	}
	
	@Override
	public void inserer(String s) {
		Buffer.appendString(s);
	}
	
	@Override
	public void selectionner(int begin, int end) {
		Buffer.setSelection(begin, end);
	}

}
