package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.Hub;

public class BoutonHub extends Bouton {

    /**
     * Crée un BoutonOrdi qui sera ajouté sur un panel
     * @param i ImageIcon Image du Bouton
     * @param m Machine associé au Bouton
     */
    public BoutonHub(ImageIcon i,Hub h){
        super(i,h);
        this.setName("Hub");
        
    }
}