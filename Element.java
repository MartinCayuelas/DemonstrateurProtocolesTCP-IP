import java.util.ArrayList;
import java.io.Serializable;

public class Element implements Serializable{

	//variables
	private ArrayList<Element> elementsConnectes;

	//constructeur
	public Element(){
		this.elementsConnectes = new ArrayList<Element>();
	}

	//methodes
	//getters

	public ArrayList<Element> getElementsConnectes(){
		return this.elementsConnectes
	}

	//setters

	public void setElementConnectes(ArrayList<Element> l){
		this.elementsConnectes = l;
	}

	//autres

	public void ajoutConnection(Element e){
		if(!this.elementsConnectes.contains(e)){
			this.elementsConnectes.add(e);
		}
	}

	public void removeConnection(Element e){
		this.elementsConnectes.remove(e);
	}


}