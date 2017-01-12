
package modnetwork.Reseau;

import java.io.Serializable;

public class Connexion implements Serializable {
	private Element elem1;
	private Element elem2;

	/**
	 * Cr�e une nouvelle connexion, si cela est possible, entre deux �l�ments
	 * quelconques
	 * 
	 * @param e1
	 *            Le premier �l�ment � connecter
	 * @param e2
	 *            Le second �l�ment � connecter
	 * @throws InvalidConnexionException
	 *             Une exception si le nombre de ports ne le permet pas
	 */
	public Connexion(Element e1, Element e2) throws InvalidConnexionException {
		if (e1.getNbPorts() > e1.getNbConnexions()) {
			if (e2.getNbPorts() > e2.getNbConnexions()) {
				this.elem1 = e1;
				this.elem2 = e2;
				e1.addConnexion(e2);
				e2.addConnexion(e1);
				if (e1 instanceof Routeur && !(e2 instanceof Routeur)) {
					SousReseau sr = ((ElementSousReseau) e2).getSousReseau();
					((Routeur) e1).addCarteReseau(sr);
					for (int i = 0; i < ((Routeur) e1).getNbCartes() - 1; i++) {
						((Routeur) e1).getCarte(i).addRegle(
								new Regle(
										((Routeur) e1).getCarte(((Routeur) e1).getNbCartes() - 1).getIP()
												.generaliserIP(),
										TableRoutage.sousReseauMasque, ((Routeur) e1).getCarte(i).getIP()),
								((Routeur) e1).getCarte(i).getTable().getNbRegles() - 1);
					}
					if (e2 instanceof Machine) {
						((Machine) e2).getCarteReseau().addRegle(
								new Regle(TableRoutage.defautPasserelleIP, TableRoutage.defautPasserelleMasque,
										((Routeur) e1).getIP(((Routeur) e1).getNbCartes() - 1)),
								0);
					}
				} else if (e2 instanceof Routeur && !(e1 instanceof Routeur)) {
					SousReseau sr = ((ElementSousReseau) e1).getSousReseau();
					((Routeur) e2).addCarteReseau(sr);
					for (int i = 0; i < ((Routeur) e2).getNbCartes() - 1; i++) {
						((Routeur) e2).getCarte(i).addRegle(
								new Regle(
										((Routeur) e2).getCarte(((Routeur) e2).getNbCartes() - 1).getIP()
												.generaliserIP(),
										TableRoutage.sousReseauMasque, ((Routeur) e2).getCarte(i).getIP()),
								((Routeur) e2).getCarte(i).getTable().getNbRegles() - 1);
					}
					if (e1 instanceof Machine) {
						((Machine) e1).getCarteReseau().addRegle(
								new Regle(TableRoutage.defautPasserelleIP, TableRoutage.defautPasserelleMasque,
										((Routeur) e2).getIP(((Routeur) e2).getNbCartes() - 1)),
								0);
					}
				}
			}
		}

		/*
		 * else { throw new InvalidConnexionException(
		 * "Tous les ports du deuxi�me �l�ment sont occup�s."); } } else if
		 * (e2.getNbPorts()>e2.getNbConnexions()) { throw new
		 * InvalidConnexionException(
		 * "Tous les ports du premier �l�ment sont occup�s.");
		 * 
		 * } else { throw new InvalidConnexionException(
		 * "Tous les ports des deux �l�ments sont occup�s."); }
		 */
	}

	/**
	 * Le toString() d'une connexion
	 * 
	 * @return Une description de la connexion courante
	 */
	/*public String toString() {
		return elem1.toString() + " connect� � " + elem2.toString();
	}*/
}
