package modnetwork.Fenetre;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
*
* @author cayuelasM
*/

public class FenetreRoutage extends JFrame {

	private PanneauTableRoutage pan;
	
	public FenetreRoutage() {

		PanneauTableRoutage rout = new PanneauTableRoutage();
		this.pan = rout;

		this.setTitle("Table de routage");
		this.setSize(300, 300);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		this.setContentPane(rout);

		this.setBounds(145,250, 500, 400);
	}

	/**
	 * @return the pan
	 */
	public PanneauTableRoutage getPan() {
		return pan;
	}

	/**
	 * @param pan the pan to set
	 */
	public void setPan(PanneauTableRoutage pan) {
		this.pan = pan;
	}
	
	

}
