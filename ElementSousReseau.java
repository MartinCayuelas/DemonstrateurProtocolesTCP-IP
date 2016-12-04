package modnetwork.Reseau;

import java.io.Serializable;

public class ElementSousReseau extends Element implements Serializable {
    private SousReseau sousReseau;
    
    /**
     * Cr�e un nouvel �l�ment
     * @param nbp Le nombre de ports de l'�l�ment
     */
    public ElementSousReseau (int nbp, SousReseau sr) {
        super(nbp);
        this.sousReseau=sr;
    }
    
    // Getters
    
    /**
     * Renvoie le sous-r�seau dans lequel se trouve l'�l�ment courant
     * @return Le sous-r�seau 
     */
    public SousReseau getSousReseau() {
        return this.sousReseau;
    }
    
}