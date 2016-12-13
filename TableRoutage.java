package modnetwork.Reseau;

import java.util.ArrayList;

/**
*
* @author cayuelasM
*/

public class TableRoutage {
    private ArrayList<Regle> listeregles;    
    public static final IPv4 broadcastIP = new IPv4(255,255,255,255); //adresse de diffusion
    public static final IPv4 defautPasserelleIP = new IPv4(0,0,0,0); //defaut
    public static final IPv4 moiIP = new IPv4(127,0,0,1); //LocalHost

	
	
    public static final MasqueSousReseau broadcastMasque = new MasqueSousReseau(255,255,255,255);
    public static final MasqueSousReseau sousReseauMasque = new MasqueSousReseau(255,255,255,0);
    public static final MasqueSousReseau defautPasserelleMasque = new MasqueSousReseau(0,0,0,0);
    
    /**
    * Crée une nouvelle table de routage
    */
   public TableRoutage () {
       this.listeregles=new ArrayList<Regle>();
   }

   /**
   * Retourne toutes les r�gles de la table de routage
   */
   
   
   
  
   public ArrayList<Regle> getTable(){
   	return this.listeregles;
   }

   /**
   * Retourne une règle de routage
   */

   public Regle getRegle(int index){
   		return this.listeregles.get(index);

   }

   /**
   * Renvoie le nomble de règles que comprend la table de routage
   */

   public int getNbRegles(){
   	return this.listeregles.size();
   }

   /**
     * Ajoute une règle à la table de routage
     * @param r la règle à ajouter
     */    
    public void addRegle(Regle r) {
        this.listeregles.add(r);
    }
    
    /**
     * Ajoute une règle à la table de routage à l'index i
     * @param r la règle à ajouter
     * @param index L'index où ajouter la règle
     */    
    public void addRegle(Regle r, int index) {
        this.listeregles.add(index,r);
    }
    
    /**
     * Supprime une règle de la table de routage
     * @param index L'index de la règle à supprimer
     */
    public void removeRegle(int index) {
        this.listeregles.remove(index);
    }
     
    /**
     * ToString d'une table de routage
     * @return La table de routage en String
     */
    
    
    public String toString() {
        int nbEspaces;
        String s = new String();
        s=("@IP destinataire | Masque de sous-reseau | @IP Passerelle\n");

        for (int i=0; i<listeregles.size();i++) {
            String ipDest=listeregles.get(i).getDestinataire().toString();
            String masque=listeregles.get(i).getMasque().toString();
            String passerelle=listeregles.get(i).getPasserelle().toString()+"\n";

            s+=ipDest;

            if (listeregles.get(i).getDestinataire().equals(TableRoutage.broadcastIP)) {
                nbEspaces=23-ipDest.length();
            }
            else {
                nbEspaces=27-ipDest.length();
            }

            for (int j=0; j<nbEspaces; j++) {
                s+=" ";
            }
            
            if (listeregles.get(i).getDestinataire().equals(TableRoutage.defautPasserelleIP)) {
                s+="    ";
            }
            
            s+=masque;

            if (listeregles.get(i).getMasque().equals(TableRoutage.broadcastMasque)) {
                nbEspaces=13;
            }
            else {
                nbEspaces=30-masque.length();
            }
            
            for (int k=0; k<nbEspaces; k++) {
                s+=" ";
            }
                
            if (listeregles.get(i).getMasque().equals(TableRoutage.defautPasserelleMasque)) {
                s+="      ";
            }
            s+=passerelle;
        }
        return s;
    }
}


