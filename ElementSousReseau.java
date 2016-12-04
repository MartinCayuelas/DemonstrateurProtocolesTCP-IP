public class ElementSousReseau extends Element{
	
	//variables
	private SousReseau sousReseau;
	private CarteReseau carteReseau;

	//constructeur
	public ElementSousReseau(SousReseau s){
		super();
		this.sousReseau = s;
		this.carteReseau = c;
	}

	//methodes
	//getters
	public SousReseau getSousReseau(){
		return this.sousReseau;
	}

	public CarteReseau getCarteReseau(){
		return this.carteReseau;
	}

	//setters
	public void setSousReseau(SousReseau s){
		this.sousReseau = s;
	}

	public void setCarteReseau(CarteReseau c){
		this.carteReseau = c;
	}



}