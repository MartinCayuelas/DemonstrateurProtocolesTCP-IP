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
        this.elementsConnectes=new ArrayList<Element>();
    }

	/**
	 * @return the nbPorts
	 */
	public int getNbPorts() {
		return nbPorts;
	}

	/**
	 * @param nbPorts the nbPorts to set
	 */
	public void setNbPorts(int nbPorts) {
		this.nbPorts = nbPorts;
	}

	/**
	 * @return the elementsConnectes
	 */
	public ArrayList<Element> getElementsConnectes() {
		return elementsConnectes;
	}

	/**
	 * @param elementsConnectes the elementsConnectes to set
	 */
	public void setElementsConnectes(ArrayList<Element> elementsConnectes) {
		this.elementsConnectes = elementsConnectes;
	}
    
    
}