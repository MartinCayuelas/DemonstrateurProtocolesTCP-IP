package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Element implements Serializable {

    private int nbPorts;
    private ArrayList<Element>elementsConnectes;
    
    /**
     * Crée un nouvel élément
     * @param nbp Le nombre de ports de l'élément
     */
    public Element (int nbp) {
        this.nbPorts=nbp;
        this.elementsConnectes=new ArrayList();
    }
}