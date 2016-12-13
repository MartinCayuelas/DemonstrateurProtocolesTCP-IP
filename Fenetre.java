package modnetwork.Fenetre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
*
* @author cayuelasM
* @author gonzalezR
*/
public class Fenetre extends JFrame {

	private JMenuBar menuBar = new JMenuBar();
	private JMenu fichier = new JMenu("Fichier");
	private JMenuItem quit = new JMenuItem("Quitter");

	private JMenu edition = new JMenu("Edition");
	private JMenuItem machine = new JMenuItem("Ajouter une machine");
	private JMenuItem routeur = new JMenuItem("Ajouter un routeur");
	private JMenuItem hub = new JMenuItem("Ajouter un hub");
	private JMenuItem switch1 = new JMenuItem("Ajouter un switch");
	private JMenuItem sousreseau = new JMenuItem("Ajouter un sous-réseau");

	private JMenu analyse = new JMenu("Analyse");
	private JMenuItem trame = new JMenuItem("Visualiser une Trame");

	// ImageIcon ButtonM = new
	// ImageIcon(this.getClass().getResource("/image/poste.png"));
	// ImageIcon ButtonS = new
	// ImageIcon(this.getClass().getResource("/image/switch.png"));
	// ImageIcon ButtonR = new
	// ImageIcon(this.getClass().getResource("/image/routeur.png"));
	// ImageIcon ButtonH = new
	// ImageIcon(this.getClass().getResource("/image/HUB.png"));

	

	private PanneauPrincipal pan = new PanneauPrincipal();
	private PanneauBouton bouton = new PanneauBouton(pan);

	public Fenetre() {
		this.setTitle("Demonstrateur TCP/IP");
		this.setSize(1300, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		// barre des tâches

		this.setContentPane(pan);

		// Barre de Menu
		this.setJMenuBar(menuBar);
		this.fichier.add(quit);
		// Listener pour quitter l'application
		ActionListener quitter = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Quitter");
				System.exit(0);
			}
		};
		quit.addActionListener(quitter);

		this.edition.add(machine);
		this.edition.add(routeur);
		this.edition.add(hub);
		this.edition.add(switch1);
		this.edition.add(sousreseau);
		
		
		

		this.analyse.add(trame);

		// Listener pour afficher la trame
		ActionListener trame2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FenetreTrame trame = new FenetreTrame();

			}
		};
		this.trame.addActionListener(trame2);
		menuBar.add(fichier);
		menuBar.add(edition);
		menuBar.add(analyse);

	}
}