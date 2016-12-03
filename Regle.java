
package modnetwork.Reseau;

import java.io.Serializable;

/**
 *
 * @author cayuelasM
 */
public class Regle implements Serializable {
	private IPv4 destinataire;
	private MasqueSousReseau masque;
	private IPv4 passerelle;

	/**
	 * Crée une nouvelle règle de table de routage
	 * 
	 * @param d
	 *            L'adresse IP du destinataire
	 * @param m
	 *            Le masque de sous-réseau
	 * @param p
	 *            L'adresse IP de la passerelle
	 */
	public Regle(IPv4 d, MasqueSousReseau m, IPv4 p) {
		this.destinataire = d;
		this.masque = m;
		this.passerelle = p;
	}

	// Getters

	/**
	 * Retourne l'adresse du destinataire
	 * 
	 * @return L'IPv4 du destinataire
	 */
	public IPv4 getDestinataire() {
		return this.destinataire;
	}

	/**
	 * Retourne le masque de sous-réseau
	 * 
	 * @return le masque de sous-réseau
	 */
	public MasqueSousReseau getMasque() {
		return this.masque;
	}

	/**
	 * Retourne l'adresse de la passerelle
	 * 
	 * @return L'IPv4 de la passerelle
	 */
	public IPv4 getPasserelle() {
		return this.passerelle;
	}

	/**
	 * Le toString de la classe
	 * 
	 * @return Affichage de la règle
	 */
	public String toString() {
		return this.getDestinataire() + " " + this.masque + " " + this.getPasserelle();
	}

}