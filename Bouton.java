package modnetwork.Fenetre;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import modnetwork.Reseau.*;

public class Bouton extends JButton{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1042195159180649815L;
	Element elem;

    /**
     * Crée un Bouton qui sera ajouté sur un panel
     * @param i ImageIcon Image du Bouton
     * @param e Element associé au Bouton
     */
    public Bouton(ImageIcon i,Element e){
        super(i);
        this.elem=e;
    }
    
    /**
     *
     * @return
     */
    public Element getElement(){
        return this.elem;
    }
}