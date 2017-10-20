package receiver;

public class MoteurImpl implements Moteur {

	@Override
	public void coller() {
		Buffer.write();
	}
	
	@Override
	public void copier() {
		PressePapier.save(Buffer.getBuffer().toString());
	}
	
	@Override
	public void couper() {
		PressePapier.save(Buffer.getBuffer().toString());
		Buffer.clean();
	}
	
	@Override
	public void inserer(String parameter) {
		Buffer.setBuffer(parameter);
		Buffer.write();
	}
	
	@Override
	public void selectionner(int begin, int end) {
		// TODO Stub de la méthode généré automatiquement
	}

}
