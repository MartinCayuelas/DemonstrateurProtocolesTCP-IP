package modnetwork.Fenetre;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
*
* @author cayuelasM
*/
public class FenetreTrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton correction = new JButton("Correction");
	private int heightButton, widthButton;
    private int posXButton, posYButton;

	public FenetreTrame() {
	
    	
    	heightButton = 95;
    	widthButton = 286;
    	
    	posXButton = 800;
    	posYButton = 575;
		
		
		
		this.setTitle("Visualisation de la trame");
		this.setSize(1300, 780);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		PanneauImage pan = new PanneauImage();

		pan.setLayout(null);
		correction.setBounds(posXButton, posYButton, widthButton, heightButton);
		pan.add(correction);

		this.setBackground(Color.WHITE);

		this.setContentPane(pan);

		correction.addActionListener(new ActionListener() {
			// On affiche la correction de l'exercice sur la Trame

			public void actionPerformed(ActionEvent event) {

				FenetreCorrection correct = new FenetreCorrection();

			}

		});
	}
}
