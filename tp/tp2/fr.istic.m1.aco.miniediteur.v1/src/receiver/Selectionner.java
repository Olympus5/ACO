package receiver;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Selectionner implements Command
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Moteur moteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Selectionner(){
		super();

		this.moteur = new MoteurImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void execute() {
		this.moteur.selectionner(this.getBegin(), this.getEnd());
	}

	public int getBegin() {
		return 0;
	}
	
	public int getEnd() {
		return 0;
	}
	
}

