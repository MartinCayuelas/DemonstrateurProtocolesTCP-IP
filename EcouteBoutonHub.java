package modnetwork.Fenetre;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
*
* @author cayuelasM
*/

public class EcouteBoutonHub extends MouseAdapter{
private PanneauBouton pan;
	
	public EcouteBoutonHub(PanneauBouton pB){
		this.pan = pB;
	}
	
	 @Override
	    public void mousePressed(MouseEvent e){
	        pan.setOrdiSelected(false);
	        pan.setRouteurSelected(false);
	        pan.setSwitchSelected(false);
	        pan.setHubSelected(true);
	        pan.setSousReseauSelected(false);
	        
	        
	        
	    }

}
