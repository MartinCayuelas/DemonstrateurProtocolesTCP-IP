package modnetwork.Fenetre;

import javax.swing.ImageIcon;

import modnetwork.Reseau.Machine;

public class BoutonMachine extends Bouton {

    /**
     * Crée un BoutonOrdi qui sera ajouté sur un panel
     * @param i ImageIcon Image du Bouton
     * @param m Machine associé au Bouton
     */
    public BoutonMachine(ImageIcon i,Machine m){
        super(i,m);
        this.setName("Machine");
        
    }
}