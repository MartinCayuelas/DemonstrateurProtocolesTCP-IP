package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import modnetwork.Reseau.SousReseau;

public class PanneauSousReseau extends JPanel{
	
	private SousReseau sousRes;
	private PanneauElement pan;
	
	/**
     * Créé un nouveau panel sous-réseau
	 * @param pan 
     * @param p PanelElement dans lequel est inséré le PanelSousReseau
     * @param x Coordonnée x du PanelSousReseau
     * @param y Coordonnée y du PanelSousReseau
     * @param s SousReseau correspondant au PanelSousReseau
     */
	public PanneauSousReseau(PanneauElement pan, int x, int y, SousReseau s){
		this.setLayout(null);
		this.sousRes = s; 
		this.pan = pan;
		Dimension dim = new Dimension(200,200);
		this.setPreferredSize(dim);
		Color ColorPan = new Color(220,200,220);
		this.setBackground(ColorPan);
		this.setBounds(x-100, y-100, 255, 255);
		addMouseListener(new EcoutePanneau(this));
	}

}
