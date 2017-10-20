package receiver;

public  interface Moteur 
{
    public Editeur editeur = new Editeur();

	public void coller() ;

	public void copier() ;

	public void couper() ;

	public void inserer(String parameter) ;

	public void selectionner(int parameter, int parameter2) ;
}

