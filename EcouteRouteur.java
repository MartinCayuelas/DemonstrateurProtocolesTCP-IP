package modnetwork.Fenetre;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import modnetwork.Reseau.*;

public class EcouteRouteur extends MouseAdapter {
	PanneauElement pan;
	Bouton bouton, bouton2;

	Connexion connect;

	/**
	 * Ecoute des Clics concernant le PanelSousReseau
	 * 
	 * @param p
	 *            PanelElemenrs dans lequel est contenu l'Element
	 * @param b
	 *            Bouton sur lequel on clique
	 */
	public EcouteRouteur(PanneauElement p, Bouton b) {
		this.pan = p;
		this.bouton = b;

	}
	
	
	 public void mouseReleased(MouseEvent e){
	        // Gestion du clique droit sur un élémment
		if(e.isPopupTrigger()){
		    JPopupMenu menu = new JPopupMenu();
		    JMenuItem delete = new JMenuItem("Supprimer" );
	            menu.add(delete);
		    menu.show(e.getComponent(),e.getX(), e.getY()); 
		    delete.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent actionevent)
			    {
	                        System.out.println("Supprimer");
	                        bouton=(Bouton)e.getSource();
				pan.remove(bouton);
	                        pan.repaint();
			    }
			});
	            
		}
	    }
	 
	  @Override
	    public void mousePressed(MouseEvent e){
		  Bouton but= (Bouton)e.getSource();
	       
      	FenetreRoutage routage  = new FenetreRoutage();
          Bouton b = (Bouton)e.getSource();
          if ("Routeur".equals(b.getName())){
              String s;
              s = ((BoutonRouteur)b).getElement().toString();
              JLabel label = new JLabel(s);
             Routeur r = ((Routeur)((BoutonRouteur)b).getElement());
              
              JLabel TabRout = new JLabel("table routage Routeur a mettre");
             
              routage.getPan().getPanRout().add(TabRout);
             
              routage.getPan().getInfos().add(label);
          
              routage.getPan().getPanRout().repaint();
          }
	  }
	             
	 
	 
	 
	 
}