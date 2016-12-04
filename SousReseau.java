//package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public class SousReseau implements Serializable {
	
	//variables
	private Reseau res;
	private IPv4 IPmachines;
	private ArrayList<ElementSousReseau> listeElements;

	//constructeur
	public SousReseau(Reseau r) {
		this.res=r;
        this.IPmachines=new IPv4(164,1,10,0);
        this.listeElements = new ArrayList<ElementSousReseau>();
	}

	//methodes
	//getters
	public Reseau getReseau(){
		return this.res;
	}

	public IPv getIPmachines(){
		return this.IPmachines;
	}

	public ArrayList<ElementSousReseau> getElements(){
		return this.listeElements;
	}

	//setters
	public void setReseau(Reseau r){
		this.res = r;
	}

	public void setIPmachines(IPv4 ip){
		this.IPmachines = ip;
	}

	public void setElements(ArrayList<ElementSousReseau> l){
		this.listeElements = l;
	}

	//autres
	public boolean contientElement(ElementSousReseau e){
		return this.listeElements.contains(e);
	}

	public void ajoutElement(ElementSousReseau e){
		if (!this.contientElement(e)){
			this.listeElements.add(e);
		}
	}

	public void removeElement(Element e){
		this.listeElements.remove(e);
	}

}
