package modnetwork.Fenetre;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

/**
*
* @author cayuelasM
* @author gonzalezR
*/
public class PanneauPrincipal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	PanneauBouton panBut = new PanneauBouton(this);
	PanneauElement panE = new PanneauElement(this);
	JPanel panBas = new JPanel();
	
	JPanel panG = new JPanel();
	JPanel panD = new JPanel();

	public PanneauPrincipal() {
		this.setLayout(new BorderLayout(1, 1));
		this.setBackground(Color.WHITE);
		panBut.setBackground(Color.WHITE);
		panG.setBackground(Color.WHITE);
		panD.setBackground(Color.WHITE);
		panBas.setBackground(Color.WHITE);
		panE.setBackground(Color.LIGHT_GRAY);
		/*
		this.add(panB, BorderLayout.WEST);
		
		this.add("North",pan);*/
		
		
		this.add("North", panBut);
		this.add("Center", panE);
		this.add("South",panBas);
		
		this.add("West",panG);
		this.add("East", panD);
		
	

	}

	public PanneauBouton getPanneauBouton() {
		return this.panBut;
	}

}
