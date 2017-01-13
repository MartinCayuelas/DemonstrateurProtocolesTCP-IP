package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import modnetwork.Reseau.Element;
import modnetwork.Reseau.Routeur;

public class PanneauElement extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanneauPrincipal pan;
	String s;
	private static Bouton b1, b2;
	
	private static int etapeConnection;
	private static Element elem1, elem2;
	static int xClic1Elem, xClic2Elem, yClic1Elem, yClic2Elem, xClicRouteur, yClicRouteur;

	/*
	 * private static boolean deplaceHub=false; private static boolean
	 * deplaceOrdi=false; private static boolean deplaceSwitch=false; private
	 * static boolean deplaceRouteur=false;
	 */

	/**
	 * Créé un nouveau PanelElement
	 * 
	 * @param p
	 *            PanelPrincipal dans lequel est inséré le PanelElement
	 */
	public PanneauElement(PanneauPrincipal p) {
		this.pan = p;
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		this.addMouseListener(new EcoutePanneauPrincipal(this));
		PanneauElement.etapeConnection = 1;

	}

	public PanneauPrincipal getPanelPrincipal() {

		return this.pan;
	}

	/**
	 * Ajoute un Routeur au PanelElements
	 * 
	 * @param e
	 *            Evènement déclancheur de la fonction.
	 */
	public void AjouterRouteur(MouseEvent e) {
		System.out.println("Routeur posé");
		Routeur r = new Routeur();
		BoutonRouteur root = new BoutonRouteur(new ImageIcon(getClass().getResource("./r.png")), r);
		root.addMouseListener(new EcouteRouteur(this, root));
		int xClic = e.getX();
		int yClic = e.getY();
		root.setBounds(xClic - 25, yClic - 25, 40, 40);
		root.setMaximumSize(root.getPreferredSize());
		this.add(root);

		this.paintComponents(this.getGraphics());

	}
	
	 /**
     * Fonction calculant la position d'un Routeur par rapport à un SousReseau
     * @param r Bouton associé au Routeur
     * @param b2 Bouton associé au SousReseau
     * @return String ("h","g","b","d")
     */
    public String getPositionRouteur(Bouton r, Bouton b2){
        int x = r.getX();
        int y = r.getY();
        int x2=b2.getParent().getX();
        int y2=b2.getParent().getY();
        if (x>x2+200){
            s="d";
        }else if(x<x2){
            s="g";
        }else if (y>y2+200){
            s="b";
        }else if (y<y2){
            s="h";
        }
        return s;
    }
    
    /**
     * Fonction calculant le Point dans un PanelSousReseau pour tracer une connection
     * @param s1 String indiquand la position du Routeur par rapport au SousReseau
     * @return
     */
    public Point getPointSousReseau(String s1){
        int x,y;
        Point p= new Point();
        if(s1=="d"){
            x=200;
            y=100;
            p.setLocation(x,y);
        }else if(s1=="g"){
            x=0;
            y=100;
            p.setLocation(x,y);
        }else if(s1=="b"){ 
            x=100;
            y=200;
            p.setLocation(x,y);
        }else if(s1=="h"){
            x=100;
            y=0;
            p.setLocation(x,y);
        }
        return p;
    }

    /**
     * Fonction calculant le Point dans un PanelElements pour tracer une connection
     * @param s1 String indiquand la position du Routeur par rapport au SousReseau 
     * @param b2 Bouton associé au PanelSousReseau pour pouvoir y accéder
     * @return
     */
    public Point getPointPanel(String s1,Bouton b2){
        int x2=b2.getParent().getX();
        int y2=b2.getParent().getY();
        
        Point p= new Point();
        if(s1=="d"){
            x2=x2+200;
            y2=y2+100;
            p.setLocation(x2,y2);
        }else if(s1=="g"){
           
            y2=y2+100;
            p.setLocation(x2,y2);
        }else if(s1=="b"){ 
            x2=x2+100;
            y2=y2+200;
            p.setLocation(x2,y2);
        }else if(s1=="h"){
            x2=x2+100;
         
            p.setLocation(x2,y2);
        }
        return p;
    }

	/**
	 * @return the pan
	 */
	public PanneauPrincipal getPan() {
		return pan;
	}

	/**
	 * @param pan
	 *            the pan to set
	 */
	public void setPan(PanneauPrincipal pan) {
		this.pan = pan;
	}

	
	/**
	 * @return the etapeConnection
	 */
	public static int getEtapeConnection() {
		return etapeConnection;
	}

	/**
	 * @param etapeConnection the etapeConnection to set
	 */
	public static void setEtapeConnection(int etapeConnection) {
		PanneauElement.etapeConnection = etapeConnection;
	}

	/**
	 * @return the b1
	 */
	public static Bouton getB1() {
		return b1;
	}

	/**
	 * @param b1 the b1 to set
	 */
	public static void setB1(Bouton b1) {
		PanneauElement.b1 = b1;
	}

	/**
	 * @return the b2
	 */
	public static Bouton getB2() {
		return b2;
	}

	/**
	 * @param b2 the b2 to set
	 */
	public static void setB2(Bouton b2) {
		PanneauElement.b2 = b2;
	}

	

	/**
	 * @return the elem1
	 */
	public static Element getElem1() {
		return elem1;
	}

	/**
	 * @param elem1 the elem1 to set
	 */
	public static void setElem1(Element elem1) {
		PanneauElement.elem1 = elem1;
	}

	/**
	 * @return the elem2
	 */
	public static Element getElem2() {
		return elem2;
	}

	/**
	 * @param elem2 the elem2 to set
	 */
	public static void setElem2(Element elem2) {
		PanneauElement.elem2 = elem2;
	}

	/**
	 * @return the xClic1Elem
	 */
	public static int getxClic1Elem() {
		return xClic1Elem;
	}

	/**
	 * @param xClic1Elem the xClic1Elem to set
	 */
	public static void setxClic1Elem(int xClic1Elem) {
		PanneauElement.xClic1Elem = xClic1Elem;
	}

	/**
	 * @return the xClic2Elem
	 */
	public static int getxClic2Elem() {
		return xClic2Elem;
	}

	/**
	 * @param xClic2Elem the xClic2Elem to set
	 */
	public static void setxClic2Elem(int xClic2Elem) {
		PanneauElement.xClic2Elem = xClic2Elem;
	}

	/**
	 * @return the yClic1Elem
	 */
	public static int getyClic1Elem() {
		return yClic1Elem;
	}

	/**
	 * @param yClic1Elem the yClic1Elem to set
	 */
	public static void setyClic1Elem(int yClic1Elem) {
		PanneauElement.yClic1Elem = yClic1Elem;
	}

	/**
	 * @return the yClic2Elem
	 */
	public static int getyClic2Elem() {
		return yClic2Elem;
	}

	/**
	 * @param yClic2Elem the yClic2Elem to set
	 */
	public static void setyClic2Elem(int yClic2Elem) {
		PanneauElement.yClic2Elem = yClic2Elem;
	}

	/**
	 * @return the xClicRouteur
	 */
	public static int getxClicRouteur() {
		return xClicRouteur;
	}

	/**
	 * @param xClicRouteur the xClicRouteur to set
	 */
	public static void setxClicRouteur(int xClicRouteur) {
		PanneauElement.xClicRouteur = xClicRouteur;
	}

	/**
	 * @return the yClicRouteur
	 */
	public static int getyClicRouteur() {
		return yClicRouteur;
	}

	/**
	 * @param yClicRouteur the yClicRouteur to set
	 */
	public static void setyClicRouteur(int yClicRouteur) {
		PanneauElement.yClicRouteur = yClicRouteur;
	}
	
	/* Remet à 1 l'éatpe de connection*/
	 public void resetEtapeConnection(){
	        PanneauElement.etapeConnection=1;
	    }

	

}
