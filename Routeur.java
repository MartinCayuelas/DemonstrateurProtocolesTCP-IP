package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public class Routeur extends Element implements Serializable {
	private ArrayList<CarteReseau> cartesReseaux;

	/**
	 * Crée un nouveau Routeur sans carte réseau
	 */
	public Routeur() {
		super(4);
		this.cartesReseaux = new ArrayList<CarteReseau>();
	}
}