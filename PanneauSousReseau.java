package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import modnetwork.Reseau.Hub;
import modnetwork.Reseau.IPv4;
import modnetwork.Reseau.Machine;
import modnetwork.Reseau.SousReseau;
import modnetwork.Reseau.Switch;

public class PanneauSousReseau extends JPanel {

	private SousReseau sousRes;
	private PanneauElement pan;
	private IPv4 IP;

	/**
	 * Créé un nouveau panel sous-réseau
	 * 
	 * @param pan
	 * @param p
	 *            PanelElement dans lequel est inséré le PanelSousReseau
	 * @param x
	 *            Coordonnée x du PanelSousReseau
	 * @param y
	 *            Coordonnée y du PanelSousReseau
	 * @param s
	 *            SousReseau correspondant au PanelSousReseau
	 */

	public PanneauSousReseau(PanneauElement pan, int x, int y, SousReseau s) {
		this.setLayout(null);
		this.sousRes = s;
		this.pan = pan;
		Dimension dim = new Dimension(200, 200);
		this.setPreferredSize(dim);
		

		Color c = new Color(125, 150, 175);

		IPv4 IP = s.getIPmachines(); /* On récupère @Ip du sousRéseau */

		this.setBorder(new TitledBorder(new LineBorder(c, 0), IP.toString()));
		this.setBackground(Color.WHITE);
		this.setBounds(x - 100, y - 100, 270, 270);
		addMouseListener(new EcoutePanneau(this));
	}

	/**
	 * Ajoute une Machine au PanelSousReseau
	 * 
	 * @param e
	 *            Evènement déclancheur de la fonction.
	 */
	public void AjouterOrdi(final MouseEvent e) {

		// CREATION FENETRE
		// informations fenetre
		final JFrame fenetre = new JFrame();
		fenetre.setTitle("Initialiser une machine");
		fenetre.setSize(400, 200);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetre.setVisible(true);

		JPanel panneau = new JPanel();
		// initialisation des zones de texte et boutons
		final JFormattedTextField jtf1 = new JFormattedTextField();
		final JFormattedTextField jtf2 = new JFormattedTextField();
		final JFormattedTextField jtf3 = new JFormattedTextField();
		final JFormattedTextField jtf4 = new JFormattedTextField();
		jtf1.setValue(new Integer(0));
		jtf2.setValue(new Integer(0));
		jtf3.setValue(new Integer(0));
		jtf4.setValue(new Integer(0));
		jtf1.setPreferredSize(new Dimension(50, 30));
		jtf2.setPreferredSize(new Dimension(50, 30));
		jtf3.setPreferredSize(new Dimension(50, 30));
		jtf4.setPreferredSize(new Dimension(50, 30));
		JButton bouton = new JButton("Creation de la machine");

		// ajout des elements au panel
		panneau.add(new JLabel("Adresse IP"));
		panneau.add(jtf1);
		panneau.add(jtf2);
		panneau.add(jtf3);
		panneau.add(jtf4);
		panneau.add(bouton);
		fenetre.setContentPane(panneau);
		// FIN CREATION FENETRE

		// creation de la machine
		System.out.println("Creation de la machine");
		final Machine m = new Machine(sousRes);
		this.sousRes.addMachine(m);
		// Action du bouton
		bouton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// recuperation des données
				Integer o1 = (Integer) jtf1.getValue();
				Integer o2 = (Integer) jtf2.getValue();
				Integer o3 = (Integer) jtf3.getValue();
				Integer o4 = (Integer) jtf4.getValue();

				// parametrage de la machine
				if (o1 != 0 | o2 != 0 | o3 != 0 | o4 != 0) {
					IPv4 ip = new IPv4(o1, o2, o3, o4);
					m.setIP(ip);
					System.out.println("Machine parametree");
				}
				System.out.println(m);
				fenetre.dispose();
			}
		});

		BoutonMachine Ordi = new BoutonMachine(new ImageIcon(getClass()
				.getResource("./m.png")), m);
		Ordi.addMouseListener(new EcouteElement(this,Ordi));
		int xClic = e.getX();
		int yClic = e.getY();
		Ordi.setBounds(xClic - 25, yClic - 25, 32, 32);
		Ordi.setMaximumSize(Ordi.getPreferredSize());
		this.add(Ordi);
		this.paintComponents(this.getGraphics());

		System.out.println("Machine Ajoutee");

	}

	/**
	 * Ajoute un hub au PanelSousReseau
	 * 
	 * @param e
	 *            Ev�nement d�clancheur de la fonction.
	 */
	public void AjouterHub(MouseEvent e) {
		// CREATION FENETRE
		// informations fenetre
		final JFrame fenetre = new JFrame();
		fenetre.setTitle("Initialiser une machine");
		fenetre.setSize(400, 200);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetre.setVisible(true);

		JPanel panneau = new JPanel();
		// initialisation des zones de texte et boutons
		final JFormattedTextField jtf1 = new JFormattedTextField();
		final JFormattedTextField jtf2 = new JFormattedTextField();
		final JFormattedTextField jtf3 = new JFormattedTextField();
		final JFormattedTextField jtf4 = new JFormattedTextField();
		jtf1.setValue(new Integer(0));
		jtf2.setValue(new Integer(0));
		jtf3.setValue(new Integer(0));
		jtf4.setValue(new Integer(0));
		jtf1.setPreferredSize(new Dimension(50, 30));
		jtf2.setPreferredSize(new Dimension(50, 30));
		jtf3.setPreferredSize(new Dimension(50, 30));
		jtf4.setPreferredSize(new Dimension(50, 30));
		JButton bouton = new JButton("Creation hub");

		// ajout des elements au panel
		panneau.add(new JLabel("Adresse IP"));
		panneau.add(jtf1);
		panneau.add(jtf2);
		panneau.add(jtf3);
		panneau.add(jtf4);
		panneau.add(bouton);
		fenetre.setContentPane(panneau);
		// FIN CREATION FENETRE

		System.out.println("Hub Pos�");
		final Hub h = new Hub(sousRes);
		sousRes.addHub(h);
		// action du bouton
		bouton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// recuperation des données
				Integer o1 = (Integer) jtf1.getValue();
				Integer o2 = (Integer) jtf2.getValue();
				Integer o3 = (Integer) jtf3.getValue();
				Integer o4 = (Integer) jtf4.getValue();

				// parametrage de la machine
				if (o1 != 0 | o2 != 0 | o3 != 0 | o4 != 0) {
					IPv4 ip = new IPv4(o1, o2, o3, o4);
					h.setIP(ip);
					System.out.println("Hub parametr�");
				}
				System.out.println(h);
				fenetre.dispose();
			}
		});

		BoutonHub hub = new BoutonHub(new ImageIcon(getClass().getResource(
				"./h.png")), h);
		hub.addMouseListener(new EcouteElement(this,hub));
		int xClic = e.getX();
		int yClic = e.getY();
		hub.setBounds(xClic - 25, yClic - 25, 32, 32);
		hub.setMaximumSize(hub.getPreferredSize());
		this.add(hub);
		this.paintComponents(this.getGraphics());

		System.out.println("Hub ajout�");
	}

	/**
	 * Ajoute un Switch au PanelSousReseau
	 * 
	 * @param e
	 *            Ev�nement d�clancheur de la fonction.
	 */

	public void AjouterSwitch(MouseEvent e) {
		// CREATION FENETRE
		// informations fenetre
		final JFrame fenetre = new JFrame();
		fenetre.setTitle("Initialiser un Switch");
		fenetre.setSize(400, 200);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetre.setVisible(true);

		JPanel panneau = new JPanel();
		// initialisation des zones de texte et boutons
		final JFormattedTextField jtf1 = new JFormattedTextField();
		final JFormattedTextField jtf2 = new JFormattedTextField();
		final JFormattedTextField jtf3 = new JFormattedTextField();
		final JFormattedTextField jtf4 = new JFormattedTextField();
		jtf1.setValue(new Integer(0));
		jtf2.setValue(new Integer(0));
		jtf3.setValue(new Integer(0));
		jtf4.setValue(new Integer(0));
		jtf1.setPreferredSize(new Dimension(50, 30));
		jtf2.setPreferredSize(new Dimension(50, 30));
		jtf3.setPreferredSize(new Dimension(50, 30));
		jtf4.setPreferredSize(new Dimension(50, 30));
		JButton bouton = new JButton("Creation du switch");

		// ajout des elements au panel
		panneau.add(new JLabel("Adresse IP"));
		panneau.add(jtf1);
		panneau.add(jtf2);
		panneau.add(jtf3);
		panneau.add(jtf4);
		panneau.add(bouton);
		fenetre.setContentPane(panneau);
		// FIN CREATION FENETRE

		System.out.println("Machine Pos�e");
		final Switch s = new Switch(sousRes);
		sousRes.addSwitch(s);
		// action du bouton
		bouton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// recuperation des données
				Integer o1 = (Integer) jtf1.getValue();
				Integer o2 = (Integer) jtf2.getValue();
				Integer o3 = (Integer) jtf3.getValue();
				Integer o4 = (Integer) jtf4.getValue();

				// parametrage de la machine
				if (o1 != 0 | o2 != 0 | o3 != 0 | o4 != 0) {
					IPv4 ip = new IPv4(o1, o2, o3, o4);
					s.setIP(ip);
					System.out.println("Switch parametr�");
				}
				System.out.println(s);
				fenetre.dispose();
			}
		});

		BoutonSwitch sw = new BoutonSwitch(new ImageIcon(getClass()
				.getResource("./s.png")), s);
		sw.addMouseListener(new EcouteElement(this,sw));
		int xClic = e.getX();
		int yClic = e.getY();
		sw.setBounds(xClic - 25, yClic - 25, 32, 32);
		sw.setMaximumSize(sw.getPreferredSize());
		this.add(sw);
		this.paintComponents(this.getGraphics());

		System.out.println("Ajouter Switch Marche");
	}


	/**
	 * @return the sousRes
	 */
	public SousReseau getSousRes() {
		return sousRes;

	}

	/**
	 * @param sousRes
	 *            the sousRes to set
	 */
	public void setSousRes(SousReseau sousRes) {
		this.sousRes = sousRes;
	}

	/**
	 * @return the pan
	 */
	public PanneauElement getPan() {
		return pan;
	}

	/**
	 * @param pan
	 *            the pan to set
	 */
	public void setPan(PanneauElement pan) {
		this.pan = pan;
	}

	/**
	 * @return the iP
	 */
	public IPv4 getIP() {
		return IP;
	}

	/**
	 * @param iP
	 *            the iP to set
	 */
	public void setIP(IPv4 iP) {
		IP = iP;
	}

}
