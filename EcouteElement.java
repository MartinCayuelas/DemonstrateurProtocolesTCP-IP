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
import modnetwork.Reseau.Hub;
import modnetwork.Reseau.Machine;
import modnetwork.Reseau.Routeur;
import modnetwork.Reseau.*;

public class EcouteElement extends MouseAdapter {

	PanneauSousReseau pan;
	Bouton bouton, bouton2;

	Connexion connect;

	/**
	 * Ecoute des Clics concernant le PanelSousReseau
	 * 
	 * @param p
	 *            PanelSousReseau dans lequel est contenu l'Element
	 * @param b
	 *            Bouton sur lequel on clique
	 */
	public EcouteElement(PanneauSousReseau p, Bouton b) {
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

		FenetreRoutage routage = new FenetreRoutage();
		Bouton b = (Bouton) e.getSource();
		if ("Machine".equals(b.getName())) {
			String s;
			s = ((BoutonMachine) b).getElement().toString();
			JLabel label = new JLabel(s);
			Machine m = ((Machine) ((BoutonMachine) b).getElement());

			JLabel TabRout = new JLabel(m.getCarteReseau().getTable().toString());

			routage.getPan().getPanRout().add(TabRout);

			routage.getPan().getInfos().add(label);

			routage.getPan().getPanRout().repaint();

		} else if ("Switch".equals(b.getName())) {
			String s;
			s = ((BoutonSwitch) b).getElement().toString();
			JLabel label = new JLabel(s);
			Switch sw = ((Switch) ((BoutonSwitch) b).getElement());

			JLabel TabRout = new JLabel(sw.getCarteReseau().getTable().toString());

			routage.getPan().getPanRout().add(TabRout);

			routage.getPan().getInfos().add(label);

			routage.getPan().getPanRout().repaint();
		} else if ("Hub".equals(b.getName())) {
			String s;
			s = ((BoutonHub) b).getElement().toString();
			JLabel label = new JLabel(s);
			Hub h = ((Hub) ((BoutonHub) b).getElement());

			JLabel TabRout = new JLabel(h.getCarteReseau().getTable().toString());

			routage.getPan().getPanRout().add(TabRout);

			routage.getPan().getInfos().add(label);

			routage.getPan().getPanRout().repaint();
		}

		if (pan.getPan().getPanelPrincipal().getPanneauBouton().isConnectSelected()) {

			if (pan.getPan().getEtapeConnection() == 1) {
				System.out.println("Etape 1: point de départ");
				Bouton bou = (Bouton) bouton;
				pan.getPan().setB1(bou);
				;
				Element elem = bou.getElement();
				pan.getPan().setElem1(elem);
				int xClic = bouton.getBounds().x;
				int yClic = bouton.getBounds().y;
				pan.getPan().setxClic1Elem(xClic);
				pan.getPan().setyClic1Elem(yClic);
				System.out.println("X1 = " + pan.getPan().getxClic1Elem() + " Y1 = " + pan.getPan().getyClic1Elem());
				pan.getPan().setEtapeConnection(2);

				// Gestion de la connexion Deuxième partie ( coordonnées
				// deuxième élémment )
			} else if (pan.getPan().getEtapeConnection() == 2) {
				System.out.println("Etape 2: point d'arrivée");
				Bouton bou = (Bouton) bouton;
				pan.getPan().setB1(bou);
				Element elem2 = bou.getElement();
				pan.getPan().setElem2(elem2);

				connect = new Connexion(pan.getPan().getElem1(), pan.getPan().getElem2());

				String s = connect.toString();
				System.out.println(s);
				if (pan.getPan().getElem1() instanceof Machine | pan.getPan().getElem1() instanceof Switch
						| pan.getPan().getElem1() instanceof Hub) {
					int xClic = bouton.getBounds().x;
					int yClic = bouton.getBounds().y;
					pan.getPan().setxClic2Elem(xClic);
					pan.getPan().setyClic2Elem(yClic);
					System.out
							.println("X1 = " + pan.getPan().getxClic2Elem() + " Y1 = " + pan.getPan().getyClic2Elem());
					Graphics g = pan.getGraphics();
					g.drawLine(pan.getPan().getxClic1Elem() + 15, pan.getPan().getyClic1Elem() + 15,
							pan.getPan().getxClic2Elem() + 15, pan.getPan().getyClic2Elem() + 15);
							/* On rajoute 15 car il y a un décalage */

					
					pan.getPan().resetEtapeConnection();
					pan.getPan().getPanelPrincipal().getPanneauBouton().setConnectSelected(false);
				}
/*
			else if (pan.getPan().getElem1() instanceof Routeur) {
					Point psr, pro, psr2, pro2;
					String s2 = pan.getPan().getPositionRouteur(pan.getPan().getB2(), pan.getPan().getB1());
					psr = pan.getPan().getPointSousReseau(s2);
					pro = pan.getPan().getPointPanel(s2, pan.getPan().getB1());
					psr2 = new Point(pan.getPan().getB1().getX(), pan.getPan().getB1().getY());
					pro2 = new Point(pan.getPan().getB2().getX(), pan.getPan().getB2().getY());
					Graphics g = pan.getGraphics();
					Graphics g2 = pan.getPan().getGraphics();
						g.drawLine(psr.x + 25, psr.y + 25, psr2.x + 25, psr2.y + 25);
					g2.drawLine(pro.x + 25, pro.y + 25, pro2.x + 25, pro2.y + 25);
					pan.getPan().resetEtapeConnection();
					pan.getPan().getPanelPrincipal().getPanneauBouton().setConnectSelected(false);
				}*/
			}

		}

	}

	/**
	 * @return the pan
	 */
	public PanneauSousReseau getPan() {
		return pan;
	}

	/**
	 * @param pan
	 *            the pan to set
	 */
	public void setPan(PanneauSousReseau pan) {
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