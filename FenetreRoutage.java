import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenetreRoutage extends JFrame{
	
						//Element e sera dedans
	public FenetreRoutage(){
		
		PanneauTableRoutage rout = new PanneauTableRoutage();
		
	
		
		
		
		
		this.setTitle("Routage");//Apres il y a aura l'adresse Ip de l'element
		this.setSize(700, 720);
		
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		this.setContentPane(rout);
		
		this.setBounds(20,115, 700, 720);
		}

}
