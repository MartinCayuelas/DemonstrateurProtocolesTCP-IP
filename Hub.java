package modnetwork.Reseau;

import java.io.Serializable;

public class Hub extends ElementSousReseau implements Serializable {

	private CarteReseau carteReseau;
	// private ArrayList<RegleARP> cacheARP;
	private static int oct4 = 15;

	/**
	 * Crée un nouveau Hub avec 4 ports
	 * 
	 * @param sr
	 *            Le sous-réseau auquel la machine appartient
	 */
	public Hub(SousReseau sr) {
		super(4, sr);

		IPv4 ipSR = sr.getIPmachines();

		IPv4 ip = new IPv4((int) sr.getIPmachines().getO1(), (int) sr.getIPmachines().getO2(),
				(int) sr.getIPmachines().getO3(), oct4);

		this.oct4++;

		this.carteReseau = new CarteReseau(ip);
	}

	/**
	 * Crée un nouveau Hub
	 * 
	 * @param nbp
	 *            Le nombre de ports du hub
	 * @param sr
	 *            Le sous-réseau auquel la machine appartient
	 */
	public Hub(int nbp, SousReseau sr) {
		super(nbp, sr);
	}

	/**
	 * 
	 * @return Le toString du hub
	 */
	public String toString() {
		return "Hub\n" + this.getCarteReseau();
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