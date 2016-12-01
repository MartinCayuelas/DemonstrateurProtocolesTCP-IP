import java.util.ArrayList;

public class SousReseau{
	
	//variables
	private ArrayList<ElementSousReseau> elements;

	//constructeur
	public SousReseau(){
		this.elements = new ArrayList<ElementSousReseau>();
	}

	//methodes
	//getters
	public ArrayList<ElementSousReseau> getElements(){
		return this.elements;
	}

	//setters
	public void setElements(ArrayList<ElementSousReseau> e){
		this.elements = e;
	}

	//autres
	public void ajoutElement(ElementSousReseau e){
		if(!this.elements.contains(e)){
			this.elements.add(e);
		}
	}

	public void removeElement(ElementSousReseau e){
		this.elements.remove(e);
	}

}