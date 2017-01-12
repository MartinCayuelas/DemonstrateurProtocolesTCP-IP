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
         * Getter Adresse IP de la carte rÃ©seau
         * @return Adresse IP
         */
        public IPv4 getIP() {
            return this.addresseIP;
        }

        /**
         * Getter Adresse MAC de la carte rÃ©seau
         * @return Adresse MAC
         */
        public MAC getMAC() {
            return this.addresseMAC;
        }
        
        /**
         * Getter table de routage de la carte rÃ©seau
         */
        public TableRoutage getTable() {
            return this.tabRoutage;
        }

        
       

		/**
		 * @param addresseIP the addresseIP to set
		 */
		public void setIP(IPv4 addresseIP) {
			this.addresseIP = addresseIP;
		}

		
		/**
		 * @param addresseMAC the addresseMAC to set
		 */
		public void setAddresseMAC(MAC addresseMAC) {
			this.addresseMAC = addresseMAC;
		}

		
		/**
		 * @param tabRoutage the tabRoutage to set
		 */
		public void setTabRoutage(TableRoutage tabRoutage) {
			this.tabRoutage = tabRoutage;
		}
		
		/**
         * Ajoute une règle à la table de routage de la carte réseau
         * @param r La règle à ajouter
         */
        public void addRegle(Regle r) {
            this.tabRoutage.addRegle(r);
        }

        /**
         * Ajoute une règle à la table de routage de la carte réseau à l'index i
         * @param Regle la règle à ajouter
         * @param index L'index où ajouter la règle
         */    
        public void addRegle(Regle r, int index) {
            this.tabRoutage.addRegle(r,index);
        }        

        /**
         * Ajoute une règle de broadcast à la table de routage de la carte réseau
         */
        public void addRegleBroadcast() {
            IPv4 ip=TableRoutage.broadcastIP;
            MasqueSousReseau m=TableRoutage.broadcastMasque;
            this.tabRoutage.addRegle(new Regle(ip,m,this.addresseIP));
        }
        
        /**
         * Ajoute une règle de passerelle par défaut à la table de routage de la carte réseau
         * @param ipPasserelle L'ip de la passerelle par défaut à définir
         */
        public void addReglePasserelle(IPv4 ipPasserelle) {
            IPv4 ip=TableRoutage.defautPasserelleIP;
            MasqueSousReseau m=TableRoutage.defautPasserelleMasque;
            this.tabRoutage.addRegle(new Regle(ip,m, ipPasserelle));
        }
        
        /**
         * Ajoute une règle de sous-réseau à la table de routage de la carte réseau
         * @param ipReseau L'ip du sous réseau
         */
        public void addRegleSousReseau(IPv4 ipReseau) {
            MasqueSousReseau m=TableRoutage.sousReseauMasque;
            this.tabRoutage.addRegle(new Regle(ipReseau, m, this.addresseIP));
        }
        
        /**
         * Ajoute une règle de base à la table de routage de la carte réseau
         */
        public void addRegleMoi() {
            IPv4 ip=TableRoutage.moiIP;
            MasqueSousReseau m=TableRoutage.broadcastMasque;
            this.tabRoutage.addRegle(new Regle(this.addresseIP, m, ip));
        }
    
        /**
         * Retire une règle de la table de routage de la carte réseau
         * @param index L'index de la règle à retirer
         */
        public void removeRegle(int index) {
            this.tabRoutage.removeRegle(index);
        }
        
        

		/**
         * Le toString de la classe
         * @return Affichage du couple
         */
        public String toString() {
            return (" @ MAC : " + this.addresseMAC + " @ IP : " + this.addresseIP);
        }
    }
	