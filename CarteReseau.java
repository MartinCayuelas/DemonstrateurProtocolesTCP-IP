import  java.io.Serializable;

public class CarteReseau implements Serializable{

	//variables	
	private MAC adresseMac;
	private IPv4 adresseIp;	

	//constructeur
	public CarteReseau(IPv4 ip){
		this.adresseMac = new MAC();
		this.adresseIp = ip;
	}

	//methodes
	//getters
	public MAC getAdresseMac(){
		return this.adresseMac;
	}

	public IPv4 getAdresseIp(){
		return this.adresseIp;
	}

	//setters
	public void setAdresseMac(MAC m){
		this.adresseMac = m;
	}

	public void setAdresseIp(IPv4 ip){
		this.adresseIp = ip;
	}

	//autres

}
