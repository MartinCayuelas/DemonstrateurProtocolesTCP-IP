package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import modnetwork.Reseau.Routeur;

public class PanneauElement extends JPanel{
	private PanneauPrincipal pan;
	
	
	
	
	  /**
     * Créé un nouveau PanelElement
     * @param p PanelPrincipal dans lequel est inséré le PanelElement
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

	
	/**
     * Ajoute un Routeur au PanelElements
     * @param e Evènement déclancheur de la fonction.
     */
    public void AjouterRouteur(MouseEvent e){
        System.out.println("Routeur posé");
        Routeur r=new Routeur();
        BoutonRouteur root = new BoutonRouteur(new ImageIcon(getClass().getResource("./r.png")),r);
        root.addMouseListener(new EcouteRouteur(this,root));
        int xClic=e.getX();
        int yClic=e.getY();
        root.setBounds(xClic-25,yClic-25,40,40);
        root.setMaximumSize(root.getPreferredSize());
        this.add(root);
        
        this.paintComponents(this.getGraphics());
        
    }
	/**
	 * @return the pan
	 */
	public PanneauPrincipal getPan() {
		return pan;
	}
	/**
	 * @param pan the pan to set
	 */
	public void setPan(PanneauPrincipal pan) {
		this.pan = pan;
	}
	
    
}
