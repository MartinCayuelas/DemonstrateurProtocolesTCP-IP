package modnetwork.Reseau;

import java.io.Serializable;

public class Switch extends ElementSousReseau implements Serializable {

	private CarteReseau carteReseau;
	// private ArrayList<RegleARP> cacheARP;
	private static int oct4 = 35;

	/**
	 * Cr�e un nouveau Switch avec 6 ports
	 * 
	 * @param sr
	 *   Le sous-r�seau auquel la machine appartient
	 */
	
	public Switch(SousReseau sr) {
		super(4, sr);
		
		IPv4 ipSR = sr.getIPmachines();

		IPv4 ip = new IPv4((int) sr.getIPmachines().getO1(), (int) sr.getIPmachines().getO2(),
				(int) sr.getIPmachines().getO3(), oct4);

		this.oct4++;

		this.carteReseau = new CarteReseau(ip);

	}

	/**
	 * Cr�e un nouveau Switch
	 * 
	 * @param nbp
	 *            Le nombre de ports du switch
	 * @param sr
	 *            Le sous-r�seau auquel la machine appartient
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
	
	

}
