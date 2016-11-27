public class Machine extends ElementSousReseau{
	
	//variables
	private CarteReseau carteReseau;

	//constructeurs
	public Machine(SousReseau s, CarteReseau c){
		super(s);
		this.carteReseau = c;
	}

	//methodes
	//getters
	public CarteReseau getCarteReseau(){
		return this.carteReseau;
	}

	//setters
	public void setCarteReseau(CarteReseau c){
		this.carteReseau = c;
	}

}