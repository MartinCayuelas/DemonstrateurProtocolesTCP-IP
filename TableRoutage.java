
package modnetwork.Reseau;

import java.util.ArrayList;

public class TableRoutage {
    private ArrayList<Regle> regles;    
    public static final IPv4 broadcastIP = new IPv4(255,255,255,255);
    public static final IPv4 defautPasserelleIP = new IPv4(0,0,0,0);
    public static final IPv4 moiIP = new IPv4(127,0,0,1);
    public static final MasqueSousReseau broadcastMasque = new MasqueSousReseau(255,255,255,255);
    public static final MasqueSousReseau sousReseauMasque = new MasqueSousReseau(255,255,255,0);
    public static final MasqueSousReseau defautPasserelleMasque = new MasqueSousReseau(0,0,0,0);
    
    /**
    * Crée une nouvelle table de routage
    */
   public TableRoutage () {
       this.regles=new ArrayList();
   }

   //Getters
    
   /**
    * Retourne toutes les règles de la table de routage
    * @return Une ArrayList de toutes les règles de la table
    */
    public ArrayList<Regle> getTable() {
        return this.regles;
    }

    /**
     * Retourne une règle de routage
     * @param index L'index de la règle de routage à return
     * @return La règle de routage à l'index index
     */
    public Regle getRegle(int index) {
        return this.regles.get(index);
    }
    
    /**
     * Renvoie le nomble de règles que comprend la table de routage
     * @return le nombre de règles
     */
    public int getNbRegles() {
        return this.regles.size();
    }
   
    // Setters

    /**
     * Ajoute une règle à la table de routage
     * @param r la règle à ajouter
     */    
    public void addRegle(Regle r) {
        this.regles.add(r);
    }
    
    /**
     * Ajoute une règle à la table de routage à l'index i
     * @param r la règle à ajouter
     * @param index L'index où ajouter la règle
     */    
    public void addRegle(Regle r, int index) {
        this.regles.add(index,r);
    }
    
    /**
     * Supprime une règle de la table de routage
     * @param index L'index de la règle à supprimer
     */
    public void removeRegle(int index) {
        this.regles.remove(index);
    }
     
    /**
     * ToString d'une table de routage
     * @return La table de routage en String
     */
    public String toString() {
        int nbEspaces;
        String s=("IP destinataire  | Masque de sous-réseau | IP Passerelle\n");
        
        
        /*for (int i=0; i<regles.size();i++) {
            String dest=regles.get(i).getDestinataire().toString();
            String masque=regles.get(i).getMasque().toString();
            String passerelle=regles.get(i).getPasserelle().toString()+"\n";
            s+=dest;
            if (regles.get(i).getDestinataire().equals(TableRoutage.broadcastIP)) {
                nbEspaces=23-dest.length();
            }
            else {
                nbEspaces=27-dest.length();
            }

            for (int j=0; j<nbEspaces; j++) {
                s+=" ";
            }
            
            if (regles.get(i).getDestinataire().equals(TableRoutage.defautPasserelleIP)) {
                s+="    ";
            }
            
            s+=masque;

            if (regles.get(i).getMasque().equals(TableRoutage.broadcastMasque)) {
                nbEspaces=13;
            }
            else {
                nbEspaces=30-masque.length();
            }
            
            for (int k=0; k<nbEspaces; k++) {
                s+=" ";
            }
                
            if (regles.get(i).getMasque().equals(TableRoutage.defautPasserelleMasque)) {
                s+="      ";
            }
            s+=passerelle;
        }*/
        return s;
    }
}
