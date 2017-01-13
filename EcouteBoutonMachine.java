package modnetwork.Fenetre;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
*
* @author cayuelasM
*/

public class EcouteBoutonMachine extends MouseAdapter{
	private PanneauBouton pan;
	
	public EcouteBoutonMachine(PanneauBouton pB){
		this.pan = pB;
	}
	
	 @Override
	    public void mousePressed(MouseEvent e){
	        pan.setOrdiSelected(true);
	        pan.setRouteurSelected(false);
	        pan.setSwitchSelected(false);
	        pan.setHubSelected(false);
	        pan.setSousReseauSelected(false);
	       
	        
	        
	    }
	 
	 
	

}
