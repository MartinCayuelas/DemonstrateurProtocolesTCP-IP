package modnetwork.Reseau;

import java.io.Serializable;

public class Switch extends ElementSousReseau implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CarteReseau carteReseau;
	// private ArrayList<RegleARP> cacheARP;
	private static int oct4 = 35;

	/**
	 * Crée un nouveau Switch avec 6 ports
	 * 
	 * @param sr
	 *   Le sous-réseau auquel la machine appartient
	 */
	
	public Switch(SousReseau sr) {
		super(4, sr);
		
		

		IPv4 ip = new IPv4((int) sr.getIPmachines().getO1(), (int) sr.getIPmachines().getO2(),
				(int) sr.getIPmachines().getO3(), oct4);

		Switch.oct4++;

		this.carteReseau = new CarteReseau(ip);

	}

	/**
	 * Crée un nouveau Switch
	 * 
	 * @param nbp
	 *            Le nombre de ports du switch
	 * @param sr
	 *            Le sous-réseau auquel la machine appartient
	 */
	public Switch(int nbp, SousReseau sr) {
		super(nbp, sr);
	}

	/**
	 * 
	 * @return Le toString du switch
	 */
	public String toString() {
		return "Switch\n" + this.getCarteReseau();
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

	public void setIP(IPv4 ip){
		this.carteReseau.setIP(ip);
	}
	
	

}
