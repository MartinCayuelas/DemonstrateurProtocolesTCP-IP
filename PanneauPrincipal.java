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

	PanneauBouton panB = new PanneauBouton(this);
	PanneauElement panE = new PanneauElement(this);
	JPanel pan = new JPanel();

	public PanneauPrincipal() {
		this.setLayout(new BorderLayout(1, 1));
		this.setBackground(Color.WHITE);
		panB.setBackground(Color.WHITE);
		panE.setBackground(Color.gray);
		/*
		this.add(panB, BorderLayout.WEST);
		
		this.add("North",pan);*/
		
		
		this.add("North", panB);
		this.add("Center", panE);
		
		
	

	}

	public PanneauBouton getPanneauBouton() {
		return this.panB;
	}

}
