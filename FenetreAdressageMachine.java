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

public class FenetreAdressageMachine extends JFrame {

	private JPanel container = new JPanel();

	private JComboBox combo = new JComboBox();

	private JLabel label = new JLabel("Choisir classe: ");
	//Machine
	private JTextField o1 = new JTextField();
	private JTextField o2 = new JTextField();
	private JTextField o3 = new JTextField();
	private JTextField o4 = new JTextField();
	
	//Masque
	private JTextField oc1 = new JTextField();
	private JTextField oc2 = new JTextField();
	private JTextField oc3 = new JTextField();
	private JTextField oc4 = new JTextField();
	
	//Passerelle
	private JTextField oct1 = new JTextField();
	private JTextField oct2 = new JTextField();
	private JTextField oct3 = new JTextField();
	private JTextField oct4 = new JTextField();

	public FenetreAdressageMachine() {

		this.setTitle("AdressageMachine");

		this.setSize(300, 170);
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

		JLabel l4 = new JLabel("@ Machine");
		center.add(l4);
		o1.setColumns(3);
		o2.setColumns(3);
		o3.setColumns(2);
		o4.setColumns(2);

		center.add(o1);
		JLabel l = new JLabel(".");
		center.add(l);
		center.add(o2);
		JLabel l2 = new JLabel(".");
		center.add(l2);
		center.add(o3);
		JLabel l3 = new JLabel(".");
		center.add(l3);
		
		center.add(o4);
		
		//Masque
		JLabel l8= new JLabel("");
		JLabel l5 = new JLabel(" Masque");
		center.add(l8);
		center.add(l5);
		
		oc1.setColumns(3);
		oc2.setColumns(3);
		oc3.setColumns(2);
		oc4.setColumns(2);

		center.add(oc1);
		JLabel lll = new JLabel(".");
		center.add(lll);
		center.add(oc2);
		JLabel l2ll = new JLabel(".");
		center.add(l2ll);
		center.add(oc3);
		JLabel l3ll = new JLabel(".");
		center.add(l3ll);
		
		center.add(oc4);
		
		
		//Passerelle
		
		JLabel l9= new JLabel("");
		JLabel l6 = new JLabel(" @ Passerelle");
		center.add(l9);
		center.add(l6);
		
		oct1.setColumns(3);
		oct2.setColumns(3);
		oct3.setColumns(2);
		oct4.setColumns(2);

		center.add(oct1);
		JLabel ll = new JLabel(".");
		center.add(ll);
		center.add(oct2);
		JLabel l2l = new JLabel(".");
		center.add(l2l);
		center.add(oct3);
		JLabel l3l = new JLabel(".");
		center.add(l3l);
		
		center.add(oct4);

		this.setContentPane(container);

		this.setVisible(true);

		JPanel south = new JPanel();
		container.add(south, BorderLayout.SOUTH);

		JButton okBouton = new JButton("Enregistrer");

		okBouton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				System.out.println("Envoyé");

				setVisible(false);
			}

		});

		south.add(okBouton);

	}

	
	
	
}
