package modnetwork.Fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

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
