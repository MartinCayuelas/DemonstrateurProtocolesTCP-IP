package modnetwork.Fenetre;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
*
* @author cayuelasM
*/

public class EcouteBoutonRouteur extends MouseAdapter {
	
private PanneauBouton pan;
	
	public EcouteBoutonRouteur(PanneauBouton pB){
		this.pan = pB;
	}
	
	 @Override
	    public void mousePressed(MouseEvent e){
	        pan.setOrdiSelected(false);
	        pan.setRouteurSelected(true);
	        pan.setSwitchSelected(false);
	        pan.setHubSelected(false);
	        pan.setSousReseauSelected(false);
	        
	        
	        
	    }

}
