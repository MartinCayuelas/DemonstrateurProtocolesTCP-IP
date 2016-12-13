package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import modnetwork.Reseau.Connexion;
import modnetwork.Reseau.Element;
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
	 * Cr�� un nouveau panel sous-r�seau
	 * 
	 * @param pan
	 * @param p
	 *            PanelElement dans lequel est ins�r� le PanelSousReseau
	 * @param x
	 *            Coordonn�e x du PanelSousReseau
	 * @param y
	 *            Coordonn�e y du PanelSousReseau
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

		IPv4 IP = s.getIPmachines(); /* On r�cup�re @Ip du sousR�seau */

		this.setBorder(new TitledBorder(new LineBorder(c, 0), IP.toString()));
		this.setBackground(Color.WHITE);
		this.setBounds(x - 100, y - 100, 270, 270);
		addMouseListener(new EcoutePanneau(this));
	}

	/**
	 * Ajoute une Machine au PanelSousReseau
	 * 
	 * @param e
	 *            Ev�nement d�clancheur de la fonction.
	 */
	public void AjouterOrdi(MouseEvent e) {
		System.out.println("Machine Pos�e");
		Machine m = new Machine(sousRes);
		sousRes.addMachine(m);
		BoutonMachine Ordi = new BoutonMachine(new ImageIcon(getClass().getResource("./m.png")), m);
		Ordi.addMouseListener(new EcouteElement(this, Ordi));
		int xClic = e.getX();
		int yClic = e.getY();
		Ordi.setBounds(xClic - 25, yClic - 25, 40, 40);
		Ordi.setMaximumSize(Ordi.getPreferredSize());
		this.add(Ordi);
		this.paintComponents(this.getGraphics());

		System.out.println("Ajouter Ordi Marche");
	}

	/**
	 * Ajoute un hub au PanelSousReseau
	 * 
	 * @param e
	 *            Ev�nement d�clancheur de la fonction.
	 */
	public void AjouterHub(MouseEvent e) {
		System.out.println("Hub Pos�");
		Hub h = new Hub(sousRes);
		sousRes.addHub(h);
		BoutonHub hub = new BoutonHub(new ImageIcon(getClass().getResource("./h.png")), h);
		hub.addMouseListener(new EcouteElement(this,hub));
		int xClic = e.getX();
		int yClic = e.getY();
		hub.setBounds(xClic - 25, yClic - 25, 40, 40);
		hub.setMaximumSize(hub.getPreferredSize());
		this.add(hub);
		this.paintComponents(this.getGraphics());

		System.out.println("Ajouter hub Marche");
	}

	/**
	 * Ajoute un Switch au PanelSousReseau
	 * 
	 * @param e
	 *            Ev�nement d�clancheur de la fonction.
	 */

	public void AjouterSwitch(MouseEvent e) {
		System.out.println("Machine Pos�e");
		Switch s = new Switch(sousRes);
		sousRes.addSwitch(s);
		BoutonSwitch sw = new BoutonSwitch(new ImageIcon(getClass().getResource("./s.png")), s);
		sw.addMouseListener(new EcouteElement(this, sw));
		int xClic = e.getX();
		int yClic = e.getY();
		sw.setBounds(xClic - 25, yClic - 25, 40, 40);
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
