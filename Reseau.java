package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public class Reseau implements Serializable{

		private String nom;
		private ArrayList<SousReseau> listeSousReseaux;
	    private ArrayList<Routeur> listeRouteurs;
	    
	    
	    public Reseau(){
	    	this.nom = "Reseau";
	    	this.listeSousReseaux = new ArrayList<SousReseau>();
	    	this.listeRouteurs=new ArrayList<Routeur>();
	    	
	    }
	    
	    /**
	     * Crée un nouveau réseau en lui assignant un nom
	     * @param s Le nom du réseau
	     */
	    public Reseau(String s) {
	        this.nom=s;
	        this.listeSousReseaux = new ArrayList<SousReseau>();
	    	this.listeRouteurs=new ArrayList<Routeur>();
	        
	    }
	    
	    public void addSousReseau(SousReseau s){
	    	this.listeSousReseaux.add(s);
	    }

		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/**
		 * @return the listeSousReseaux
		 */
		public ArrayList<SousReseau> getListeSousReseaux() {
			return listeSousReseaux;
		}

		/**
		 * @param listeSousReseaux the listeSousReseaux to set
		 */
		public void setListeSousReseaux(ArrayList<SousReseau> listeSousReseaux) {
			this.listeSousReseaux = listeSousReseaux;
		}

		/**
		 * @return the listeRouteurs
		 */
		public ArrayList<Routeur> getListeRouteurs() {
			return listeRouteurs;
		}

		/**
		 * @param listeRouteurs the listeRouteurs to set
		 */
		public void setListeRouteurs(ArrayList<Routeur> listeRouteurs) {
			this.listeRouteurs = listeRouteurs;
		}
	    
	    
	   
}
