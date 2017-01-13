package modnetwork.Fenetre;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EcouteBoutonSousReseau extends MouseAdapter {

	private PanneauBouton panBout;

	public EcouteBoutonSousReseau(PanneauBouton pBout) {
		this.panBout = pBout;

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("SousReseau Button");
		panBout.setOrdiSelected(false);
		panBout.setRouteurSelected(false);
		panBout.setSwitchSelected(false);
		panBout.setHubSelected(false);
		panBout.setSousReseauSelected(true);
		panBout.setSimulationSelected(false);
		
		 
        
		
	}

	public PanneauBouton getPanBout() {
		return panBout;
	}

	public void setPanBout(PanneauBouton panBout) {
		this.panBout = panBout;
	}
}
