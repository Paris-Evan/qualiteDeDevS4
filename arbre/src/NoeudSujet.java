import java.util.ArrayList;

public class NoeudSujet extends Noeud implements Sujet {
	private ArrayList<Observateur> observateurs;
	
	public NoeudSujet(String nom,int coef,int val) {
		super(nom, coef,val) ;
	}
	

	  public void enregistrerObservateur(Observateur o) {
		  this.observateurs.add(o); }
	  
	  public void supprimerObservateur(Observateur o) {
			this.observateurs.remove(o); }
	  
	  public void notifierObservateur() {
	   for(int i = 0; i < this.observateurs.size(); i ++)
	     {this.observateurs.get(i).actualiser(..); } }
	
	public void majValeur(int v){
		int res = this.getValeur() + v * this.getCoef() ;
		setValeur(res);
	}

}
