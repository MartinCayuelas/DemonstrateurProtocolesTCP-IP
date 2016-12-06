package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.Switch;

public class BoutonSwitch extends Bouton {

    /**
     * Cr�e un BoutonOrdi qui sera ajout� sur un panel
     * @param i ImageIcon Image du Bouton
     * @param m Machine associ� au Bouton
     */
    public BoutonSwitch(ImageIcon i,Switch s){
        super(i,s);
        this.setName("Switch");
        
    }
}