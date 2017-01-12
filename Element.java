
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
    
    /**
     * V�rifie si deux �l�ments sont connect�s entre eux par le biais d'autres �l�ments
     * @param elementsVisites La liste des �l�ments d�j� visit�s
     * @param ipDest L'adresse ip du destinataire
     * @return True si les deux �l�ments sont reli�s | false sinon
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
     * Retourne le nombre de ports que poss�de l'�l�ment courant
     * @return Le nombre de ports
     */
    public int getNbPorts() {
        return this.nbPorts;
    }

    /**
     * Retourne la liste des �l�ments connect�s � l'�l�ment courant
     * @return Une ArrayList des �l�ments connect�s
     */
    public ArrayList<Element> getElementsConnectes() {
        return this.elementsConnectes;
    }
    
    /**
     * Retourne un �l�ment qui est connect� � l'�l�ment courant
     * @param i L'index dans la liste de l'�l�ment � retourn�
     * @return L'�l�ment concern�
     */
    public Element getElementConnecte(int i) {
         return this.elementsConnectes.get(i);
    }
    
    /**
     * Retourne le nombre d'�l�ments connect�s � l'�l�ment courant
     * @return Le nombre de connexions
     */
    public int getNbConnexions() {
        return this.elementsConnectes.size();
    }

    // Setters
    
    /**
     * Ajoute un port � l'�l�ment courant
     */
    public void addPort() {
        this.nbPorts++;
    }
    
    /**
     * Retire un port � l'�l�ment courant
     */
    public void removePort() {
        this.nbPorts++;
    }

    /**
     * Ajoute une connexion entre l'�l�ment courant et l'�l�ment pass� en param�tre
     * @param e L'�l�ment � connecter � l'�l�ment courant
     */
    public void addConnexion(Element e) {
        this.elementsConnectes.add(e);
    }
    
    /**
     * Retire une connexion entre l'�l�ment courant et l'�l�ment e
     * @param e L'�l�ment � d�connecter de l'�l�ment courant
     * @return True si la suppression � fonctionn� | false sinon
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
     * Compare un �l�ment � un objet et regarde s'il s'agit du m�me �l�ment
     * @param o L'objet � comparer
     * @return Bool�en
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
     * @return Le toString de l'�l�ment courant
     */
    public String toString() {
        String np="Nb ports : " + this.nbPorts + "\n";
        String nc="Nb connexions : " + getNbConnexions();
        return np+nc;
    }
    
}
