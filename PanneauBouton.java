import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauBouton extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ImageIcon ButtonM = new ImageIcon(this.getClass().getResource("/image/poste.png"));
	ImageIcon ButtonS = new ImageIcon(this.getClass().getResource("/image/switch.png"));
 	ImageIcon ButtonR = new ImageIcon(this.getClass().getResource("/image/routeur.png"));
	ImageIcon ButtonH = new ImageIcon(this.getClass().getResource("/image/HUB.png"));
	ImageIcon ButtonL = new ImageIcon(this.getClass().getResource("/image/liaison.png"));
	ImageIcon ButtonSR = new ImageIcon(this.getClass().getResource("/image/sousR.png"));
	
	private JButton bMachine = new JButton(ButtonM);
	private JButton bSwitch = new JButton(ButtonS);
	private JButton bRouteur = new JButton(ButtonR);
	private JButton bHub = new JButton(ButtonH);
	private JButton bSousReseau = new JButton(ButtonSR);
	private JButton bConnexion = new JButton(ButtonL);

	private final JButton rout = new JButton("routage");// Test

	/**
	 *
	 * @param p
	 *            PanelPrincipal dans lequel est inséré le PanelBouton
	 */
	public PanneauBouton(PanneauPrincipal p) {
		
			this.add(bMachine);
		 	this.add(bSwitch);
			this.add(bRouteur);
			this.add(bHub);
			this.add(bSousReseau);
			this.add(bConnexion);

		this.add(rout); // Test

		this.repaint();

		// ActionListener des diffrents boutons

		//Action Listener
		
		
				ActionListener ordi = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("ordi");

					}

				};
				ActionListener hub1 = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("hub");
					}

				};
				ActionListener switch1 = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("switch");

					}

				};
				ActionListener routeur = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("routeur");

					}

				};
				ActionListener connexion = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("connexion");

					}

				};

				ActionListener sousRes = new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("sous-reseau");
					}

				};
				
				bMachine.addActionListener(ordi);
				bHub.addActionListener(hub1);
				bSwitch.addActionListener(switch1);
				bRouteur.addActionListener(routeur);
				bConnexion.addActionListener(connexion);
				bSousReseau.addActionListener(sousRes);
				
		// Afficher Tab ROutage
		ActionListener routage = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FenetreRoutage rout = new FenetreRoutage();
			}
		};

		
		rout.addActionListener(routage);

		/*
		 * bouton1.addMouseListener(new EcouteClicBoutonOrdi(this));
		 * bouton2.addMouseListener(new EcouteClicBoutonHub(this));
		 * bouton3.addMouseListener(new EcouteClicBoutonSwitch(this));
		 * bouton4.addMouseListener(new EcouteClicBoutonRouteur(this));
		 * bouton5.addMouseListener(new EcouteClicBoutonConnexion(this));
		 * bouton6.addMouseListener(new EcouteClicBoutonSousReseau(this));
		 */
	}

}
