
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
    
    /**
     * Vérifie si deux éléments sont connectés entre eux par le biais d'autres éléments
     * @param elementsVisites La liste des éléments déjà visités
     * @param ipDest L'adresse ip du destinataire
     * @return True si les deux éléments sont reliés | false sinon
     */
    public boolean parcoursConnexions(ArrayList<Element> elementsVisites, IPv4 ipDest) {
        Element e;
        for (int i=0; i<this.getNbConnexions(); i++) {
            e=this.getElementConnecte(i);
            if (!elementsVisites.contains(e)) {
                if (e instanceof Machine) {
                    if (((Machine)e).getCarteReseau().getIP()==ipDest) {
                        return true;
                    }
                }
                else {
                    elementsVisites.add(this);
                    return (false || e.parcoursConnexions(elementsVisites, ipDest));
                }
            }
        }
        return false;
    }

    // Getters

    /**
     * Retourne le nombre de ports que possède l'élément courant
     * @return Le nombre de ports
     */
    public int getNbPorts() {
        return this.nbPorts;
    }

    /**
     * Retourne la liste des éléments connectés à l'élément courant
     * @return Une ArrayList des éléments connectés
     */
    public ArrayList<Element> getElementsConnectes() {
        return this.elementsConnectes;
    }
    
    /**
     * Retourne un élément qui est connecté à l'élément courant
     * @param i L'index dans la liste de l'élément à retourné
     * @return L'élément concerné
     */
    public Element getElementConnecte(int i) {
         return this.elementsConnectes.get(i);
    }
    
    /**
     * Retourne le nombre d'éléments connectés à l'élément courant
     * @return Le nombre de connexions
     */
    public int getNbConnexions() {
        return this.elementsConnectes.size();
    }

    // Setters
    
    /**
     * Ajoute un port à l'élément courant
     */
    public void addPort() {
        this.nbPorts++;
    }
    
    /**
     * Retire un port à l'élément courant
     */
    public void removePort() {
        this.nbPorts++;
    }

    /**
     * Ajoute une connexion entre l'élément courant et l'élément passé en paramètre
     * @param e L'élément à connecter à l'élément courant
     */
    public void addConnexion(Element e) {
        this.elementsConnectes.add(e);
    }
    
    /**
     * Retire une connexion entre l'élément courant et l'élément e
     * @param e L'élément à déconnecter de l'élément courant
     * @return True si la suppression à fonctionné | false sinon
     */
    public boolean removeConnexion(Element e) {
        for (int i=0; i<getNbConnexions(); i++) {
            if (this.elementsConnectes.get(i).equals(e)) {
                this.elementsConnectes.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Compare un élément à un objet et regarde s'il s'agit du même élément
     * @param o L'objet à comparer
     * @return Booléen
     */    
    public boolean equals(Object o) {
        if (o instanceof Element) {
        Element e = (Element)o;
            if ((this.getNbPorts()==e.getNbPorts()) && (this.getElementsConnectes().equals(e.getElementsConnectes()))) {
                return true;
            }
        }
        return false;
    }

    //To String

    /**
     * 
     * @return Le toString de l'élément courant
     */
    public String toString() {
        String np="Nb ports : " + this.nbPorts + "\n";
        String nc="Nb connexions : " + getNbConnexions();
        return np+nc;
    }
    
}
