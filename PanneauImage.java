import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauImage extends JPanel {
	public void paintComponent(Graphics g){
		 try {

		     Image  img = ImageIO.read(new File("./images/Trame.png"));
		     g.drawImage(img, 50, 0, 1100, 770, this);
		     

		    } catch (IOException e) {

		      e.printStackTrace();

		    }
	}

}
