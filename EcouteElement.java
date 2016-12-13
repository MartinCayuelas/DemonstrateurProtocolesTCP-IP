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

import modnetwork.Reseau.Connexion;
import modnetwork.Reseau.Element;
import modnetwork.Reseau.Hub;
import modnetwork.Reseau.Machine;
import modnetwork.Reseau.Routeur;
import modnetwork.Reseau.*;

public class EcouteElement extends MouseAdapter {

	PanneauSousReseau pan;
	Bouton bouton, bouton2;

	Connexion connect;

	/**
	 * Ecoute des Clics concernant le PanelSousReseau
	 * 
	 * @param p
	 *            PanelSousReseau dans lequel est contenu l'Element
	 * @param b
	 *            Bouton sur lequel on clique
	 */
	public EcouteElement(PanneauSousReseau p, Bouton b) {
		this.pan = p;
		this.bouton = b;

	}

	public void mouseReleased(MouseEvent e) {
		// Gestion du clique droit sur un élémment
		if (e.isPopupTrigger()) {
			JPopupMenu menu = new JPopupMenu();
			JMenuItem delete = new JMenuItem("Supprimer");
			menu.add(delete);
			menu.show(e.getComponent(), e.getX(), e.getY());
			delete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionevent) {
					System.out.println("Supprimer");
					bouton = (Bouton) e.getSource();
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
	            if ("Machine".equals(b.getName())){
	                String s;
	                s = ((BoutonMachine)b).getElement().toString();
	                JLabel label = new JLabel(s);
	                Machine m = ((Machine)((BoutonMachine)b).getElement());
	                
	                JLabel TabRout = new JLabel( m.getCarteReseau().getTable().toString());
	               
	                routage.getPan().getPanRout().add(TabRout);
	               
	                routage.getPan().getInfos().add(label);
	            
	                routage.getPan().getPanRout().repaint();
		             
	            
	            }else if("Switch".equals(b.getName())){
	            	 String s;
		                s = ((BoutonSwitch)b).getElement().toString();
		                JLabel label = new JLabel(s);
		               Switch sw = ((Switch)((BoutonSwitch)b).getElement());
		                
		                JLabel TabRout = new JLabel( sw.getCarteReseau().getTable().toString());
		               
		                routage.getPan().getPanRout().add(TabRout);
		               
		                routage.getPan().getInfos().add(label);
		            
		                routage.getPan().getPanRout().repaint();
	            }else if("Hub".equals(b.getName())){
	            	 String s;
		                s = ((BoutonHub)b).getElement().toString();
		                JLabel label = new JLabel(s);
		                Hub h = ((Hub)((BoutonHub)b).getElement());
		                
		                JLabel TabRout = new JLabel(h.getCarteReseau().getTable().toString());
		               
		                routage.getPan().getPanRout().add(TabRout);
		               
		                routage.getPan().getInfos().add(label);
		            
		                routage.getPan().getPanRout().repaint();
	            }
	         
	            
	 }
	/**
	 * @return the pan
	 */
	public PanneauSousReseau getPan() {
		return pan;
	}

	/**
	 * @param pan
	 *            the pan to set
	 */
	public void setPan(PanneauSousReseau pan) {
		this.pan = pan;
	}

	/**
	 * @return the bouton
	 */
	public Bouton getBouton() {
		return bouton;
	}

	/**
	 * @param bouton
	 *            the bouton to set
	 */
	public void setBouton(Bouton bouton) {
		this.bouton = bouton;
	}

	/**
	 * @return the bouton2
	 */
	public Bouton getBouton2() {
		return bouton2;
	}

	/**
	 * @param bouton2
	 *            the bouton2 to set
	 */
	public void setBouton2(Bouton bouton2) {
		this.bouton2 = bouton2;
	}

	/**
	 * @return the connect
	 */
	public Connexion getConnect() {
		return connect;
	}

	/**
	 * @param connect
	 *            the connect to set
	 */
	public void setConnect(Connexion connect) {
		this.connect = connect;
	}

}