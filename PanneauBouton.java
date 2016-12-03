package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author cayuelasM
 * @author gonzalezR
 */
public class PanneauBouton extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton bMachine = new JButton();
	private JButton bSwitch = new JButton();
	private JButton bRouteur = new JButton();

	private JButton bHub = new JButton();
	private JButton bSousReseau = new JButton();
	private JButton bConnexion = new JButton();
	private boolean ordiSelected = false;
	private boolean hubSelected = false;
	private boolean routeurSelected = false;
	private boolean switchSelected = false;
	private boolean connectSelected = false;
	private boolean sousReseauSelected = false;
	private boolean simulationSelected = false;

	private final JButton rout = new JButton("routage");// Test

	private PanneauPrincipal panneau;

	/**
	 *
	 * @param p
	 *            PanelPrincipal dans lequel est inséré le PanelBouton
	 */
	public PanneauBouton(PanneauPrincipal p) {
		this.panneau = p;

		ImageIcon ButtonM = new ImageIcon("./images/poste.png");
		ImageIcon ButtonS = new ImageIcon("./images/switch.png");
		ImageIcon ButtonR = new ImageIcon("./images/routeur.png");
		ImageIcon ButtonH = new ImageIcon("./images/HUB.png");
		ImageIcon ButtonL = new ImageIcon("./images/liaison.png");
		ImageIcon ButtonSR = new ImageIcon("./images/sousR.png");

		bMachine.setIcon(ButtonM);
		bSwitch.setIcon(ButtonS);
		bRouteur.setIcon(ButtonR);
		bHub.setIcon(ButtonH);
		bSousReseau.setIcon(ButtonSR);
		bConnexion.setIcon(ButtonL);

		bMachine.setBackground(Color.GRAY);
		bSwitch.setBackground(Color.GRAY);
		bRouteur.setBackground(Color.GRAY);
		bHub.setBackground(Color.GRAY);
		bSousReseau.setBackground(Color.GRAY);
		bConnexion.setBackground(Color.GRAY);

		this.add(bMachine);
		this.add(bSwitch);
		this.add(bRouteur);
		this.add(bHub);
		this.add(bSousReseau);
		this.add(bConnexion);

		this.add(rout); // Test

		this.repaint();

		bMachine.addMouseListener(new EcouteBoutonMachine(this));
		bHub.addMouseListener(new EcouteBoutonHub(this));
		bSwitch.addMouseListener(new EcouteBoutonSwitch(this));
		bRouteur.addMouseListener(new EcouteBoutonRouteur(this));
		bConnexion.addMouseListener(new EcouteBoutonConnexion(this));
		bSousReseau.addMouseListener(new EcouteBoutonReseau(this));

		// Afficher Tab ROutage
		ActionListener routage = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FenetreRoutage rout = new FenetreRoutage();
			}
		};

		rout.addActionListener(routage);

	}

	public JButton getbMachine() {
		return bMachine;
	}

	public void setbMachine(JButton bMachine) {
		this.bMachine = bMachine;
	}

	public boolean isOrdiSelected() {
		return ordiSelected;
	}

	public void setOrdiSelected(boolean ordiSelected) {
		this.ordiSelected = ordiSelected;
	}

	public boolean isHubSelected() {
		return hubSelected;
	}

	public void setHubSelected(boolean hubSelected) {
		this.hubSelected = hubSelected;
	}

	public boolean isRouteurSelected() {
		return routeurSelected;
	}

	public void setRouteurSelected(boolean routeurSelected) {
		this.routeurSelected = routeurSelected;
	}

	public boolean isSwitchSelected() {
		return switchSelected;
	}

	public void setSwitchSelected(boolean switchSelected) {
		this.switchSelected = switchSelected;
	}

	public boolean isConnectSelected() {
		return connectSelected;
	}

	public void setConnectSelected(boolean connectSelected) {
		this.connectSelected = connectSelected;
	}

	public boolean isSousReseauSelected() {
		return sousReseauSelected;
	}

	public void setSousReseauSelected(boolean sousReseauSelected) {
		this.sousReseauSelected = sousReseauSelected;
	}

	public boolean isSimulationSelected() {
		return simulationSelected;
	}

	public void setSimulationSelected(boolean simulationSelected) {
		this.simulationSelected = simulationSelected;
	}
	
	
	
	
	
	
	public PanneauPrincipal getPanneau() {
		return panneau;
	}

	public void setPanneau(PanneauPrincipal panneau) {
		this.panneau = panneau;
	}

	}