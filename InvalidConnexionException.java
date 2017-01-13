
package modnetwork.Reseau;

/**
 *
 * @author leoreynaert
 */
public class InvalidConnexionException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Crée une nouvelle exception lors de la création d'une connexion comportant des erreurs
     */
    public InvalidConnexionException() {
        super();
    }
    
    /**
     * Crée une nouvelle exception lors de la création d'une connexion comportant des erreurs
     * @param s Le texte à afficher
     */
    public InvalidConnexionException(String s) {
        super(s);
    }
    
}
