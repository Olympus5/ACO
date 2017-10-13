package tp1;

import java.util.Collection;

public class EtudiantImpl implements Etudiant {

	private Collection<Cours> cours;
	
	public EtudiantImpl(Collection<Cours> cours) {
		this.cours = cours;
	}

	@Override
	public Cours getCours() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCours(Cours cours) {
		// TODO Auto-generated method stub
		
	}
}
