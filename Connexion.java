import java.io.Serializable;

public class Connexion implements Serializable{
	
	//variable
	private Element element1;
	private Element element2;

	//constructeur
	public Connexion(Element e1, Element e2){
		this.element1 = e1;
		this.element2 = e2;
	}

	//methodes
	//getters
	public Element getElement1(){
		return this.element1;
	}

	public Element getElement2(){
		return this.element2;
	}

	//setters
	public void setElement2(Element e){
		this.element2 = e;
	}

	public void setElement1(Element e){
		this.element1 = e;
	}

	//autres
	public void removeConnection(){
		this.element1.removeConnection(this.element2);
		this.element2.removeConnection(this.element1);
	}

	
}