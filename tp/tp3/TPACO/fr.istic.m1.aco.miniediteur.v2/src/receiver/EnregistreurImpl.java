package receiver;

import java.util.ArrayList;
import java.util.Iterator;

import memento.Memento;

public class EnregistreurImpl implements Enregistreur {

	protected ArrayList<Memento> CommandsMacro = new ArrayList<Memento>();
	private boolean EnregistrementOn;

	public EnregistreurImpl() {
		this.setEnregistrementOn(false);
	}

	@Override
	public void enregistrer(Memento m) {
		if (EnregistrementOn)
			CommandsMacro.add(m);
	}

	@Override
	public void Demarrer() {
		if (!CommandsMacro.isEmpty())
			CommandsMacro.clear();
		this.setEnregistrementOn(true);
	}

	@Override
	public void Stopper() {
		this.setEnregistrementOn(false);

	}

	@Override
	public void Rejouer() {
		if (!(this.isEnregistrementOn() && this.CommandsMacro.isEmpty())) {
			for (Iterator<Memento> m = CommandsMacro.iterator(); m.hasNext();) {
				Memento memento = m.next();
				memento.execute();
			}
		}
	}

	public boolean isEnregistrementOn() {
		return EnregistrementOn;
	}

	private void setEnregistrementOn(boolean enregistrementOn) {
		EnregistrementOn = enregistrementOn;
	}

}
