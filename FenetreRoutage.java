package modnetwork.Fenetre;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
*
* @author cayuelasM
*/

public class FenetreRoutage extends JFrame {

	// Element e sera dedans
	public FenetreRoutage() {

		PanneauTableRoutage rout = new PanneauTableRoutage();

		this.setTitle("Table de routage");// Apres il y a aura l'adresse Ip de l'element
		this.setSize(700, 720);

		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		this.setContentPane(rout);

		this.setBounds(145,125, 700, 710);
	}

}
