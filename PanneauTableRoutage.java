package modnetwork.Fenetre;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
*
* @author cayuelasM
*/

public class PanneauTableRoutage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7163374788719184739L;
	
	private  PanelRoutage  pan1;
	private PanelInfos  pan2;

	public PanneauTableRoutage(){
		
		
		
		Dimension d = new Dimension(500, 400);
		this.setBackground(new Color(238, 234, 232));
		this.setPreferredSize(d);
		
		 JTabbedPane tabbedPane = new JTabbedPane();
	       pan1 = new PanelRoutage(this);
	       pan2 = new PanelInfos(this);
	        
	        tabbedPane.addTab("Table de Routage",pan1);
	        
	        tabbedPane.addTab("Caractéritiques",pan2);
	      
	       
	        this.add(tabbedPane);
	        
	    }
	    
	   

		/**
		 * @return the pan1
		 */
		public PanelRoutage getPanRout() {
			return pan1;
		}

		/**
		 * @param pan1 the pan1 to set
		 */
		public void setPanRout(PanelRoutage pan1) {
			this.pan1 = pan1;
		}

		/**
		 * @return the pan2
		 */
		public PanelInfos getInfos() {
			return pan2;
		}

		/**
		 * @param pan2 the pan2 to set
		 */
		public void setInfos(PanelInfos pan2) {
			this.pan2 = pan2;
		}

	    
}
