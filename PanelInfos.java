package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PanelInfos extends JPanel{
	private PanneauTableRoutage pan;

    public PanelInfos(PanneauTableRoutage p){
        super();
        this.pan=p;
        Dimension d = new Dimension(500, 400);
        this.setBackground(new Color(238,234,232));
        this.setPreferredSize(d);
        pan.repaint();
    }
}
