/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modnetwork.Reseau;

/**
 *
 * @author leoreynaert
 */
public class InvalidConnexionException extends Exception {
    
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
