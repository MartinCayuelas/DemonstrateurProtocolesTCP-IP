package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.Hub;

public class BoutonHub extends Bouton {

    /**
     * Cr�e un BoutonOrdi qui sera ajout� sur un panel
     * @param i ImageIcon Image du Bouton
     * @param m Machine associ� au Bouton
     */
    public BoutonHub(ImageIcon i,Hub h){
        super(i,h);
        this.setName("Hub");
        
    }
}