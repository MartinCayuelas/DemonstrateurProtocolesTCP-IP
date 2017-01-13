package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.*;

public class BoutonRouteur extends Bouton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    /**
     * Cr�e un BoutonRouteur qui sera ajout� sur un panel
     * @param i ImageIcon Image du Bouton
     * @param r Routeur associ� au Bouton
     */
    public BoutonRouteur(ImageIcon i,Routeur r){
        super(i,r);
        this.setName("Routeur");
        
    }
}