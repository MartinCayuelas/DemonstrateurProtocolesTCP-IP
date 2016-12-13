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
	
	private ArrayList<Hub> listeHubs;
	private ArrayList<Switch> listeSwitchs;

	private ArrayList<Connexion> listConnexions;

	public SousReseau(Reseau r) {
		this.res=r;
		
        this.IPmachines= new IPv4(195,octet2,octet3,0);
        
        this.octet2++;
        
        
        
        this.listeMachines=new ArrayList<Machine>();
        
        this.listeSwitchs=new ArrayList<Switch>();
        this.listeHubs=new ArrayList<Hub>();
        
        this.listConnexions=new ArrayList<Connexion>();
        

	}
	
	public String toString() {
		return "SousReseau\n" + this.getIPmachines();
	}

	/**
	 * @return the listeMachines
	 */
	public ArrayList<Machine> getListeMachines() {
		return listeMachines;
	}


	/**
	 * @param listeMachines the listeMachines to set
	 */
	public void setListeMachines(ArrayList<Machine> listeMachines) {
		this.listeMachines = listeMachines;
	}


	/**
	 * @return the listeHubs
	 */
	public ArrayList<Hub> getListeHubs() {
		return listeHubs;
	}


	/**
	 * @param listeHubs the listeHubs to set
	 */
	public void setListeHubs(ArrayList<Hub> listeHubs) {
		this.listeHubs = listeHubs;
	}


	/**
	 * @return the listeSwitchs
	 */
	public ArrayList<Switch> getListeSwitchs() {
		return listeSwitchs;
	}


	/**
	 * @param listeSwitchs the listeSwitchs to set
	 */
	public void setListeSwitchs(ArrayList<Switch> listeSwitchs) {
		this.listeSwitchs = listeSwitchs;
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
	 * @return the listConnexions
	 */
	public ArrayList<Connexion> getListConnexions() {
		return listConnexions;
	}

	/**
	 * @param listConnexions the listConnexions to set
	 */
	public void setListConnexions(ArrayList<Connexion> listConnexions) {
		this.listConnexions = listConnexions;
	}

	/**
     * Ajoute une machine au sous-réseau
     * @param m La machine à ajouter
     */
    public void addMachine(Machine m) {
        this.listeMachines.add(m);
    }
    /**
     * Ajoute un switch au sous-réseau
     * @param s Le switch à ajouter
     */    
    public void addSwitch(Switch s) {
        this.listeSwitchs.add(s);
    }
    
    /**
     * Ajoute un hub au sous-réseau
     * @param h Le hub à ajouter
     */    
    public void addHub(Hub h) {
        this.listeHubs.add(h);
    }
    
    public void addConnexion(Connexion c){
    	this.listConnexions.add(c);
    }
}
