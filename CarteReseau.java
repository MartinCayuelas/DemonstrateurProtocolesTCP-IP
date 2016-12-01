package modnetwork.Reseau;
import java.io.Serializable;


/**
*
* @author cayuelasM
*/

public class CarteReseau implements Serializable {

	private IPv4 addresseIP;
	private MAC  addresseMAC;
	private TableRoutage tabRoutage;

	public CarteReseau(IPv4 ip){

		this.addresseIP = ip;
		this.addresseMAC = new MAC();
		this.tabRoutage = new TableRoutage();
	}

	// Getters

        /**
         * Getter Adresse IP de la carte réseau
         * @return Adresse IP
         */
        public IPv4 getIP() {
            return this.addresseIP;
        }

        /**
         * Getter Adresse MAC de la carte réseau
         * @return Adresse MAC
         */
        public MAC getMAC() {
            return this.addresseMAC;
        }
        
        /**
         * Getter table de routage de la carte réseau
         */
        public TableRoutage getTable() {
            return this.tabRoutage;
        }


         /**
         * Le toString de la classe
         * @return Affichage du couple
         */
        public String toString() {
            return (" @ MAC : " + this.addresseMAC + " @ IP : " + this.addresseIP);
        }
    }
	