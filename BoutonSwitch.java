package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.Switch;

public class BoutonSwitch extends Bouton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    /**
     * Crée un BoutonOrdi qui sera ajouté sur un panel
     * @param i ImageIcon Image du Bouton
     * @param m Machine associé au Bouton
     */
    public BoutonSwitch(ImageIcon i,Switch s){
        super(i,s);
        this.setName("Switch");
        
    }
}