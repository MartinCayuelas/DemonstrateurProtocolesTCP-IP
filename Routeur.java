package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public class Routeur extends Element implements Serializable {
	private ArrayList<CarteReseau> cartesReseaux;

	/**
	 * Crée un nouveau Routeur sans carte réseau
	 */
	public Routeur() {
		super(4);
		this.cartesReseaux = new ArrayList<CarteReseau>();
	}
	

   
    
    //Getters

   /**
    * 
    * @param i Le numéro du port Ethernet
    * @return L'adresse MAC de la carte réseau reliée au port i
    */
   public MAC getMAC(int i) {
       return this.cartesReseaux.get(i).getMAC();
   }

   /**
    * 
    * @param i Le numéro du port Ethernet
    * @return L'adresse IP correspondante de la carte réseau reliée au port i
    */
   public IPv4 getIP(int i) {
       return this.cartesReseaux.get(i).getIP();
   }
   
   /**
    * 
    * @return Le nombre de cartes réseaux du routeur
    */
   public int getNbCartes() {
       return this.cartesReseaux.size();
   }
   
    /**
     * Getter une carte réseau du routeur
     * @param i Le numéro de la carte réseau à retourner
     * @return La carte réseau de la machine
     */
    public CarteReseau getCarte(int i) {
        return this.cartesReseaux.get(i);
    }
    
    // Setters

   /**
    * Change l'adrese IP correspondante de la carte réseau du port Ethernet concerné
    * @param i Le numéro du port Ethernet
    * @param ip La nouvelle adresse IP de l'élément
    */
   public void setIP(int i, IPv4 ip) {
       this.cartesReseaux.get(i).setIP(ip);
   }
    
    /**
     * Affiche un routeur
     * @return Le toString du routeur
     */
    public String toString() {
        String s="Routeur \n" + super.toString();
        for (int i=0; i<this.cartesReseaux.size(); i++) {
            s+="\n Carte "+i+" : " + this.cartesReseaux.get(i);
        }
        return s;
     }


}