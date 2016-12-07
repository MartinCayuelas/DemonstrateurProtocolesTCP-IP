package modnetwork.Reseau;

import java.io.Serializable;
import java.util.ArrayList;

public class Routeur extends Element implements Serializable {
	private ArrayList<CarteReseau> cartesReseaux;

	/**
	 * Cr�e un nouveau Routeur sans carte r�seau
	 */
	public Routeur() {
		super(4);
		this.cartesReseaux = new ArrayList<CarteReseau>();
	}
}