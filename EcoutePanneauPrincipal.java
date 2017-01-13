package modnetwork.Fenetre;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import modnetwork.Reseau.Reseau;
import modnetwork.Reseau.SousReseau;

/**
 * 
 * @author cayuelasM
 *
 */
public class EcoutePanneauPrincipal extends MouseAdapter{
	
	private PanneauElement pan;
	
	
	public EcoutePanneauPrincipal(PanneauElement pan){
		this.pan = pan;
	}

	
	 @Override
	    public void mouseClicked (MouseEvent e){
		 System.out.println("Pan Principal");
		 //pan.getPanelPrincipal().repaint();
	        if(this.pan.getPanelPrincipal().getPanneauBouton().isSousReseauSelected()){
	            Reseau r=new Reseau("Reseau 1");
	            SousReseau s = new SousReseau(r);
	          
	    		 PanneauSousReseau p = new PanneauSousReseau(pan,e.getX(),e.getY(),s);
	           
	            pan.add(p);
	            pan.repaint();
	            pan.getPanelPrincipal().getPanneauBouton().setSousReseauSelected(false);
	             System.out.println("Nouveau sous reseau");
	             }
	        
	        else if(pan.getPanelPrincipal().getPanneauBouton().isRouteurSelected()){
	            pan.AjouterRouteur(e);
	            System.out.println("Nouveau Routeur");
	            pan.getPanelPrincipal().getPanneauBouton().setRouteurSelected(false);
	        }
	        
	        }   
}
