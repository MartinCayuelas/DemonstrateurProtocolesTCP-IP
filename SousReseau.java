package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public class SousReseau implements Serializable {
	private Reseau res;
	private IPv4 IPmachiches;
	/*
	private ArrayList<Machine> listeMachines;

	private ArrayList<Hub> listeHubs;
	private ArrayList<Switch> listeSwitchs;*/

	public SousReseau(Reseau r) {
		this.res=r;
        this.IPmachiches=new IPv4(164,1,10,0);
        /*
        this.listeMachines=new ArrayList();
       
        this.listeSwitchs=new ArrayList();
        this.listeHubs=new ArrayList();
        */

	}

}
