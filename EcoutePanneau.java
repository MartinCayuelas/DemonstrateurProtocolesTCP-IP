package modnetwork.Fenetre;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EcoutePanneau extends MouseAdapter {
	private PanneauSousReseau pan;

	public EcoutePanneau(PanneauSousReseau pan) {
		this.pan = pan;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		pan.getPan().getPanelPrincipal().repaint();

		// Ajout des éléments lors d'un clic sur le panel si un des bouton est
		// selectionné
		if (pan.getPan().getPanelPrincipal().getPanneauBouton().isOrdiSelected()) {
			pan.AjouterOrdi(e);
			pan.getPan().getPanelPrincipal().getPanneauBouton().setOrdiSelected(false);
		} else if (pan.getPan().getPanelPrincipal().getPanneauBouton().isHubSelected()) {
			pan.AjouterHub(e);
			pan.getPan().getPanelPrincipal().getPanneauBouton().setHubSelected(false);
		} else if (pan.getPan().getPanelPrincipal().getPanneauBouton().isSwitchSelected()) {
			pan.AjouterSwitch(e);
			pan.getPan().getPanelPrincipal().getPanneauBouton().setSwitchSelected(false);

		}
	}
	
	
}
