
public class Noeud {
	private String nom ;
	private int coef ;
	private int valeur ;
	
	
	public Noeud(String n,int c,int v){
		this.nom = n ;
		this.coef = c ;
		this.valeur = v ;
	}
	
	public Noeud(){
		
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public int getCoef(){
		return this.coef ;
	}
	
	public int getValeur(){
		return this.valeur ;
	}
	
	public void setNom(String name){
		this.nom = name;
	}
	
	public void setCapacite(int cap){
		this.coef = cap ;
		}
	
	public void setValeur (int val){
		this.valeur = val ;
	}
	
	public String toString(){
		return "le noeud" + getNom() + "son coef est" + getCoef() + "sa valeur est" + getValeur() ;
		
	}
	
	public void majValeur(int v){
		setValeur(v);
	}
	

}
