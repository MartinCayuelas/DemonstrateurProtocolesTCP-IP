package modnetwork.Fenetre;
import java.awt.Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
*
* @author cayuelasM
*/
public class PanneauCorrection extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		try {

			 BufferedImage myPicture;
			    myPicture = ImageIO.read(new File("images\\Correction.png"));
			g.drawImage(myPicture, 0, 0, 849, 699, this);

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
