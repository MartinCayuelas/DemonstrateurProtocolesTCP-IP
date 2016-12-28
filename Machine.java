package modnetwork.Reseau;

import java.io.Serializable;

public class Machine extends ElementSousReseau implements Serializable {
    private CarteReseau carteReseau;
    //private ArrayList<RegleARP> cacheARP;
    private static int oct4 = 2;
    /**
     * Crée une nouvelle Machine
     * @param sr Le sous-réseau auquel la machine appartient
     */
    public Machine(SousReseau sr){
    	super(1,sr);
        IPv4 ipSR = sr.getIPmachines();
        
        
        IPv4 ip = new IPv4((int)sr.getIPmachines().getO1(), (int)sr.getIPmachines().getO2(), (int)sr.getIPmachines().getO3(), oct4);
      
        this.oct4++;
        
        this.carteReseau=new CarteReseau(ip);
       /* this.cacheARP = new ArrayList<RegleARP>();
        
        //On assigne les règles de base de la table de routage
        this.carteReseau.addRegleMoi();
        this.carteReseau.addRegleSousReseau(sr.getIP());
        this.carteReseau.addRegleBroadcast();*/
    }
	/**
	 * @return the carteReseau
	 */
	public CarteReseau getCarteReseau() {
		return carteReseau;
	}
	/**
	 * @param carteReseau the carteReseau to set
	 */
	public void setCarteReseau(CarteReseau carteReseau) {
		this.carteReseau = carteReseau;
	}
	public String toString() {
		return "Machine\n" + this.getCarteReseau();
	}

	public void setIP(IPv4 ip){
		this.carteReseau.setIP(ip);
	}
    
}