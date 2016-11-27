import java.util.ArrayList;

public class Routeur extends Element{
	
	//variables
	private ArrayList<CarteReseau> cartesReseau;

	//constructeur	
	public CarteReseau(){
		this.cartesReseau = new ArrayList<CarteReseau>();
	}

	//methodes
	//getters
	public ArrayList<CarteReseau> getCartesReseau(){
		return this.cartesReseau
	}

	//setters
	public void setCartesReseau(ArrayList<CarteReseau> l){
		this.cartesReseau = l;
	}

	//autres
	public void ajoutCarteReseau(CarteReseau c){
		if(!this.cartesReseau.contains(c)){
			this.cartesReseau.add(c);
		}
	}

	public void removeCarteReseau(CarteReseau c){
		this.cartesReseau.remove(c);
	}

}