package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class SousReseau implements Serializable {
	private Reseau res;
	private IPv4 IPmachines;
	private static int octet2 = 40;
	private int octet3 = new Random().nextInt(15);
	
	
	private ArrayList<Machine> listeMachines;
	/*
	private ArrayList<Hub> listeHubs;
	private ArrayList<Switch> listeSwitchs;
	
	*/

	public SousReseau(Reseau r) {
		this.res=r;
		
        this.IPmachines= new IPv4(158,octet2,octet3,0);
        
        this.octet2++;
        
        
        
        this.listeMachines=new ArrayList<Machine>();
        /*
        this.listeSwitchs=new ArrayList();
        this.listeHubs=new ArrayList();
        */

	}

	/**
	 * @return the iPmachiches
	 */
	public IPv4 getIPmachines() {
		return IPmachines;
	}

	/**
	 * @param iPmachiches the iPmachiches to set
	 */
	public void setIPmachiches(IPv4 iPmachiches) {
		IPmachines = iPmachiches;
	}

// Setters
    
    /**
     * Ajoute une machine au sous-réseau
     * @param m La machine à ajouter
     */
    public void addMachine(Machine m) {
        this.listeMachines.add(m);
    }
    
}
