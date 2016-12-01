package modnetwork.Fenetre;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
*
* @author cayuelasM
*/

public class EcouteBoutonConnexion extends MouseAdapter {
private PanneauBouton pan;
	
	public EcouteBoutonConnexion(PanneauBouton pB){
		this.pan = pB;
	}
	
	 @Override
	    public void mousePressed(MouseEvent e){
	        pan.setOrdiSelected(false);
	        pan.setRouteurSelected(false);
	        pan.setSwitchSelected(false);
	        pan.setHubSelected(false);
	        pan.setSousReseauSelected(false);
	        pan.setConnectSelected(true);
	       
	        
	        
	    }

}
