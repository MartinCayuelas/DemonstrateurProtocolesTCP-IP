package modnetwork.Fenetre;

import java.awt.Color;

import javax.swing.JFrame;

/**
*
* @author cayuelasM
*/

public class FenetreCorrection extends JFrame {

	public FenetreCorrection() {
		this.setTitle("Correction");
		this.setSize(850, 700);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		PanneauCorrection pan = new PanneauCorrection();

		this.setBackground(Color.WHITE);

		this.setContentPane(pan);
	}

}
