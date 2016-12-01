package modnetwork.Fenetre;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
*
* @author cayuelasM
*/

public class PanneauTableRoutage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7163374788719184739L;
	private PanneauPrincipal pan;

	public PanneauTableRoutage() {
		super();

		Dimension d = new Dimension(500, 1200);
		this.setBackground(new Color(238, 234, 232));
		this.setPreferredSize(d);

	}

}
