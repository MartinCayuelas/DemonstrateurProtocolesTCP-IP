package modnetwork.Fenetre;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import modnetwork.Reseau.Connexion;
import modnetwork.Reseau.Element;
import modnetwork.Reseau.InvalidConnexionException;
import modnetwork.Reseau.Routeur;

public class EcouteRouteur extends MouseAdapter {
	PanneauElement pan;
	Bouton bouton, bouton2;

	Connexion connect;

	/**
	 * Ecoute des Clics concernant le PanelSousReseau
	 * 
	 * @param p
	 *            PanelElemenrs dans lequel est contenu l'Element
	 * @param b
	 *            Bouton sur lequel on clique
	 */
	public EcouteRouteur(PanneauElement p, Bouton b) {
		this.pan = p;
		this.bouton = b;

	}

	public void mouseReleased(MouseEvent e) {
		// Gestion du clique droit sur un élémment
		if (e.isPopupTrigger()) {
			JPopupMenu menu = new JPopupMenu();
			JMenuItem delete = new JMenuItem("Supprimer");
			menu.add(delete);
			menu.show(e.getComponent(), e.getX(), e.getY());
			delete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionevent) {
					System.out.println("Supprimer");
					bouton = (Bouton) e.getSource();
					pan.remove(bouton);
					pan.repaint();
				}
			});

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Bouton but = (Bouton) e.getSource();
		if (this.getPan().getPan().getPanneauBouton().isConnectSelected() == false) {
			FenetreRoutage routage = new FenetreRoutage();
			Bouton b = (Bouton) e.getSource();
			if ("Routeur".equals(b.getName())) {
				String s;
				s = ((BoutonRouteur) b).getElement().toString();
				JLabel label = new JLabel(s);
				Routeur r = ((Routeur) ((BoutonRouteur) b).getElement());

				JLabel TabRout = new JLabel("table routage Routeur a mettre");

				routage.getPan().getPanRout().add(TabRout);

				routage.getPan().getInfos().add(label);

				routage.getPan().getPanRout().repaint();
			}
		}

		if (pan.getPanelPrincipal().getPanneauBouton().isConnectSelected() && pan.getEtapeConnection() == 1) {
			System.out.println("Connexion_Etape2 : Dans le if cpt = 1");
			Bouton bou = (Bouton) bouton;
			pan.setB2(bou);
			Element elem = bou.getElement();

			pan.setElem1(elem);
			int xClic = bouton.getBounds().x;
			int yClic = bouton.getBounds().y;

			pan.setxClic1Elem(xClic + 25);
			pan.setyClic1Elem(yClic + 25);
			System.out.println("X1 = " + pan.getxClic1Elem() + " Y1 = " + pan.getyClic1Elem());

			pan.setEtapeConnection(2);

			// Gestion de la connexion Deuxième partie ( coordonnées deuxième
			// élémment )
		} else if (pan.getEtapeConnection() == 2) {
			System.out.println("Connexion_Etape3 : Dans le else if cpt = 2");
			Bouton bou = (Bouton) bouton;
			pan.setB2(bou);
			Element elem2 = bou.getElement();
			pan.setElem2(elem2);
			try {
				Connexion connect = new Connexion(pan.getElem1(), pan.getElem2());
				String sa = connect.toString();
			} catch (InvalidConnexionException ex) {
				Logger.getLogger(EcouteRouteur.class.getName()).log(Level.SEVERE, null, ex);
			}
			Point psr, pro, psr2, pro2;
			String s2 = pan.getPositionRouteur(pan.getB2(), pan.getB1());
			psr = pan.getPointSousReseau(s2);
			pro = pan.getPointPanel(s2, pan.getB1());
			psr2 = new Point(pan.getB1().getX(), pan.getB1().getY());
			pro2 = new Point(pan.getB2().getX(), pan.getB2().getY());
			Graphics g = pan.getB1().getParent().getGraphics();
			Graphics g2 = pan.getGraphics();
			g.drawLine(psr.x + 25, psr.y + 25, psr2.x + 25, psr2.y + 25);
			g2.drawLine(pro.x + 25, pro.y + 25, pro2.x + 25, pro2.y + 25);
			// connect.toString();
			int xClic = bouton.getBounds().x;
			int yClic = bouton.getBounds().y;
			pan.resetEtapeConnection();
			pan.getPanelPrincipal().getPanneauBouton().setConnectSelected(false);
		}

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
	 * @return the bouton
	 */
	public Bouton getBouton() {
		return bouton;
	}

	/**
	 * @param bouton
	 *            the bouton to set
	 */
	public void setBouton(Bouton bouton) {
		this.bouton = bouton;
	}

	/**
	 * @return the bouton2
	 */
	public Bouton getBouton2() {
		return bouton2;
	}

	/**
	 * @param bouton2
	 *            the bouton2 to set
	 */
	public void setBouton2(Bouton bouton2) {
		this.bouton2 = bouton2;
	}

	/**
	 * @return the connect
	 */
	public Connexion getConnect() {
		return connect;
	}

	/**
	 * @param connect
	 *            the connect to set
	 */
	public void setConnect(Connexion connect) {
		this.connect = connect;
	}

}