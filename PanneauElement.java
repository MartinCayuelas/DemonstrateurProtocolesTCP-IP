package modnetwork.Fenetre;

import java.awt.Color;

import javax.swing.JPanel;

public class PanneauElement extends JPanel{
	private PanneauPrincipal pan;
	  /**
     * Cr�� un nouveau PanelElement
     * @param p PanelPrincipal dans lequel est ins�r� le PanelElement
     */
    public PanneauElement(PanneauPrincipal p){
        this.pan=p;
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.addMouseListener(new EcoutePanneauPrincipal(this));
      
        
    }
	public PanneauPrincipal getPanelPrincipal() {
		
		return this.pan;
	}

}
