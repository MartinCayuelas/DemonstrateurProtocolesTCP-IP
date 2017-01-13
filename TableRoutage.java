
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
    * Cr�e une nouvelle table de routage
    */
   public TableRoutage () {
       this.regles=new ArrayList<Regle>();
   }

   //Getters
    
   /**
    * Retourne toutes les r�gles de la table de routage
    * @return Une ArrayList de toutes les r�gles de la table
    */
    public ArrayList<Regle> getTable() {
        return this.regles;
    }

    /**
     * Retourne une r�gle de routage
     * @param index L'index de la r�gle de routage � return
     * @return La r�gle de routage � l'index index
     */
    public Regle getRegle(int index) {
        return this.regles.get(index);
    }
    
    /**
     * Renvoie le nomble de r�gles que comprend la table de routage
     * @return le nombre de r�gles
     */
    public int getNbRegles() {
        return this.regles.size();
    }
   
    // Setters

    /**
     * Ajoute une r�gle � la table de routage
     * @param r la r�gle � ajouter
     */    
    public void addRegle(Regle r) {
        this.regles.add(r);
    }
    
    /**
     * Ajoute une r�gle � la table de routage � l'index i
     * @param r la r�gle � ajouter
     * @param index L'index o� ajouter la r�gle
     */    
    public void addRegle(Regle r, int index) {
        this.regles.add(index,r);
    }
    
    /**
     * Supprime une r�gle de la table de routage
     * @param index L'index de la r�gle � supprimer
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
        String s=("IP destinataire  | Masque de sous-r�seau | IP Passerelle\n");
        
        
        for (int i=0; i<regles.size();i++) {
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
        }
        return s;
    }
}
