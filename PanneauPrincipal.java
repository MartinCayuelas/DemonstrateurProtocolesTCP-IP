import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;


public class PanneauPrincipal extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	PanneauBouton panB = new PanneauBouton(this);
	
	public PanneauPrincipal(){
        this.setLayout(new BorderLayout(1,1));
        this.setBackground(Color.WHITE);
        
        this.add(panB, BorderLayout.NORTH);
       // this.add("North",panB);
        
       
       
    }
	
	 public PanneauBouton getPanelBouton(){
	        return this.panB;
	    }
	
	
}
