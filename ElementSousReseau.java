package modnetwork.Reseau;

import java.io.Serializable;

public class ElementSousReseau extends Element implements Serializable {
    private SousReseau sousReseau;
    
    /**
     * Crée un nouvel élément
     * @param nbp Le nombre de ports de l'élément
     */
    public ElementSousReseau (int nbp, SousReseau sr) {
        super(nbp);
        this.sousReseau=sr;
    }
    
    // Getters
    
    /**
     * Renvoie le sous-réseau dans lequel se trouve l'élément courant
     * @return Le sous-réseau 
     */
    public SousReseau getSousReseau() {
        return this.sousReseau;
    }
    
}