package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.*;

public class BoutonRouteur extends Bouton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    /**
     * Crée un BoutonRouteur qui sera ajouté sur un panel
     * @param i ImageIcon Image du Bouton
     * @param r Routeur associé au Bouton
     */
    public BoutonRouteur(ImageIcon i,Routeur r){
        super(i,r);
        this.setName("Routeur");
        
    }
}