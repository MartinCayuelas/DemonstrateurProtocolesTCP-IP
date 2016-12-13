package modnetwork.Reseau;

import java.io.Serializable;

public class Connexion implements Serializable {
    private Element elem1;
    private Element elem2;
    
    /**
     * Crée une nouvelle connexion, si cela est possible, entre deux éléments quelconques
     * @param e1 Le premier élément à connecter
     * @param e2 Le second élément à connecter
     * @throws InvalidConnexionException Une exception si le nombre de ports ne le permet pas
     */
    public Connexion (Element e1, Element e2){
       
                this.elem1=e1;
                this.elem2=e2;
                e1.addConnexion(e2);
                e2.addConnexion(e1);
                
    }
    
    /**
     * Le toString() d'une connexion
     * @return Une description de la connexion courante
     */
    public String toString() {
        return elem1.toString() + " connecté à " + elem2.toString();
    }
}
