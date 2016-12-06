package modnetwork.Fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetreAdressage extends JFrame {

	private JPanel container = new JPanel();

	private JComboBox combo = new JComboBox();

	private JLabel label = new JLabel("Choisir classe: ");

	private JTextField o1 = new JTextField();
	private JTextField o2 = new JTextField();
	private JTextField o3 = new JTextField();
	

	public FenetreAdressage() {

		this.setTitle("Adressage");

		this.setSize(300, 150);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		this.setLocationRelativeTo(null);

		container.setBackground(Color.white);

		container.setLayout(new BorderLayout());

		combo.setPreferredSize(new Dimension(100, 20));

		JPanel top = new JPanel();
		
		container.add(top, BorderLayout.NORTH);
		top.add(label);
		
		combo.setPreferredSize(new Dimension(100, 20));

		combo.addItem("A");

		combo.addItem("B");

		combo.addItem("C");

		combo.addItem("D");
		
		top.add(combo);
		JPanel center = new JPanel();
		container.add(center, BorderLayout.CENTER);
		center.setLayout(new FlowLayout());
		
		 JLabel l4 = new JLabel("@ ");
		 center.add(l4);
		o1.setColumns(3);
		o2.setColumns(3);
		o3.setColumns(2);
		
		center.add(o1);
		JLabel l = new JLabel(".");
		center.add(l);
		center.add(o2);
	       JLabel l2 = new JLabel(".");
	       center.add(l2);
	       center.add(o3);
	       JLabel l3 = new JLabel(". 0");
	       center.add(l3);
		
		
		
		

		

		this.setContentPane(container);

		this.setVisible(true);

		
		JPanel south = new JPanel();
		container.add(south, BorderLayout.SOUTH);
		
		JButton okBouton = new JButton("Enregistrer");

	    okBouton.addActionListener(new ActionListener(){

	      public void actionPerformed(ActionEvent arg0) {        
	      
	        System.out.println("Envoyé");
	        
	        setVisible(false);
	      }

	    });
	    
	   south.add(okBouton);
	  
	}

}
