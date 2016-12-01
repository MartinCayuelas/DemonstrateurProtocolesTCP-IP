package modnetwork.Fenetre;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
*
* @author cayuelasM
*/

public class EcouteBoutonSwitch extends MouseAdapter {
private PanneauBouton pan;
	
	public EcouteBoutonSwitch(PanneauBouton pB){
		this.pan = pB;
	}
	
	 @Override
	    public void mousePressed(MouseEvent e){
	        pan.setOrdiSelected(false);
	        pan.setRouteurSelected(false);
	        pan.setSwitchSelected(true);
	        pan.setHubSelected(false);
	        pan.setSousReseauSelected(false);
	        
	        
	        
	    }
}
