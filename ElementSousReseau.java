public class ElementSousReseau extends Element{
	
	//variables
	private SousReseau sousReseau;

	//constructeur
	public ElementSousReseau(SousReseau s){
		super();
		this.sousReseau = s;
	}

	//methodes
	//getters
	public SousReseau getSousReseau(){
		return this.sousReseau;
	}

	//setters
	public void setSousReseau(SousReseau s){
		this.sousReseau = s;
	}


}