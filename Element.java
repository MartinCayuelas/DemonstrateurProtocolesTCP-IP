package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Element implements Serializable {

    private int nbPorts;
    private ArrayList<Element>elementsConnectes;
    
    /**
     * Cr�e un nouvel �l�ment
     * @param nbp Le nombre de ports de l'�l�ment
     */
    public Element (int nbp) {
        this.nbPorts=nbp;
        this.elementsConnectes=new ArrayList();
    }
}