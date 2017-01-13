package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.Machine;

public class BoutonMachine extends Bouton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Cr�e un BoutonOrdi qui sera ajout� sur un panel
     * @param i ImageIcon Image du Bouton
     * @param m Machine associ� au Bouton
     */
    public BoutonMachine(ImageIcon i,Machine m){
        super(i,m);
        this.setName("Machine");
        
    }
}