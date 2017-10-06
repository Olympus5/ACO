package tp1;

public class EtudiantImpl1 implements Etudiant {
	/**
	 * Course studied by student
	 */
	private Cours cours;
	
	private boolean verrou;
	
	public EtudiantImpl1() {
		this.verrou = false;
	}
	
	public EtudiantImpl1(Cours cours) {
		this.cours = cours;
		this.verrou = false;
	}
	
	public Cours getCours() {
		return this.cours;
	}
	
	public void setCours(Cours cours) {
		if(this.verrou) {
			this.verrou = true;
			
			if(this.cours != null) {
				cours.setEtudiant(null);
			}
			
			
			if(cours != null) {
				cours.setEtudiant(this);
			}
			
			this.cours = cours;
			
			this.verrou = false;
		}
	}
}
