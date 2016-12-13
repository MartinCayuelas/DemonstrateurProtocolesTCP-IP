package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public class Routeur extends Element implements Serializable {
	private ArrayList<CarteReseau> cartesReseaux;

	/**
	 * Cr�e un nouveau Routeur sans carte r�seau
	 */
	public Routeur() {
		super(4);
		this.cartesReseaux = new ArrayList<CarteReseau>();
	}
	

   
    
    //Getters

   /**
    * 
    * @param i Le num�ro du port Ethernet
    * @return L'adresse MAC de la carte r�seau reli�e au port i
    */
   public MAC getMAC(int i) {
       return this.cartesReseaux.get(i).getMAC();
   }

   /**
    * 
    * @param i Le num�ro du port Ethernet
    * @return L'adresse IP correspondante de la carte r�seau reli�e au port i
    */
   public IPv4 getIP(int i) {
       return this.cartesReseaux.get(i).getIP();
   }
   
   /**
    * 
    * @return Le nombre de cartes r�seaux du routeur
    */
   public int getNbCartes() {
       return this.cartesReseaux.size();
   }
   
    /**
     * Getter une carte r�seau du routeur
     * @param i Le num�ro de la carte r�seau � retourner
     * @return La carte r�seau de la machine
     */
    public CarteReseau getCarte(int i) {
        return this.cartesReseaux.get(i);
    }
    
    // Setters

   /**
    * Change l'adrese IP correspondante de la carte r�seau du port Ethernet concern�
    * @param i Le num�ro du port Ethernet
    * @param ip La nouvelle adresse IP de l'�l�ment
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