import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class Fenetre extends JFrame {

	private JMenuBar menuBar = new JMenuBar();
	private JMenu fichier = new JMenu("Fichier");
	private JMenuItem quit = new JMenuItem("Quitter");
	
	private JMenu edition = new JMenu("Edition");
	private JMenuItem machine = new JMenuItem("Ajouter une machine");
	private JMenuItem routeur = new JMenuItem("Ajouter un routeur");
	private JMenuItem hub = new JMenuItem("Ajouter un hub");
	private JMenuItem switch1 = new JMenuItem("Ajouter un switch");
	
	private JMenu analyse = new JMenu("Analyse");
	private JMenuItem trame = new JMenuItem("Visualiser une Trame");
	



	//ImageIcon ButtonM = new ImageIcon(this.getClass().getResource("/image/poste.png"));
	//ImageIcon ButtonS = new ImageIcon(this.getClass().getResource("/image/switch.png"));
	//ImageIcon ButtonR = new ImageIcon(this.getClass().getResource("/image/routeur.png"));
	//ImageIcon ButtonH = new ImageIcon(this.getClass().getResource("/image/HUB.png"));

	private JButton bMachine = new JButton("ButtonM");
	private JButton bSwitch = new JButton("ButtonS");
	private JButton bRouteur = new JButton("ButtonR");
	private JButton bHub = new JButton("ButtonH");

	private JPanel fen = new JPanel();
	private	JPanel pan = new JPanel();
	private	JPanel bouton = new JPanel();
	

	public Fenetre() {
		this.setTitle("Demonstrateur TCP/IP");
		this.setSize(1300, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		//barre des tâches


		fen.setBackground(Color.white);
    		fen.setLayout(new BorderLayout());
    		fen.add(pan, BorderLayout.NORTH);

    		pan.setBackground(Color.white);
    		pan.setLayout(new BorderLayout());
    		pan.add(bouton, BorderLayout.WEST);
        	this.setContentPane(fen);
	
	        bouton.add(bMachine);
		bouton.add(bSwitch);
		bouton.add(bRouteur);
		bouton.add(bHub);


		//Barre de Menu
		this.setJMenuBar(menuBar);
		this.fichier.add(quit);
		quit.addActionListener((ActionEvent arg0) -> {
			System.exit(0);
		});
		
		this.edition.add(machine);
		this.edition.add(routeur);
		this.edition.add(hub);
		this.edition.add(switch1);
		
		this.analyse.add(trame);
			trame.addActionListener((ActionEvent arg0) ->{
				FenetreTrame trame = new FenetreTrame();
			});
		menuBar.add(fichier);
		menuBar.add(edition);
		menuBar.add(analyse);
	}

}
