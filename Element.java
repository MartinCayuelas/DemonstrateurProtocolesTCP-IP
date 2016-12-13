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
    
	  /**
     * Ajoute une connexion entre l'�l�ment courant et l'�l�ment pass� en param�tre
     * @param e L'�l�ment � connecter � l'�l�ment courant
     */
    public void addConnexion(Element e) {
        this.elementsConnectes.add(e);
    }
    
    
}