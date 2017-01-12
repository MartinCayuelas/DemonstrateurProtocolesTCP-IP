package modnetwork.Reseau;
 import java.io.Serializable;

/**
* @author CayuelasM
*
*/

public class IPv4 extends Adresse{

	 /**
     * Crée une nouvelle adresse IPv4
     * @param o1 Le premier octet
     * @param o2 Le deuxième octet
     * @param o3 Le troisième octet
     * @param o4 Le quatrième octet
     */
    public IPv4(int o1, int o2, int o3, int o4) {
        super('.',o1, o2, o3, o4);
    }

    /**
     * Crée une nouvelle adresse IPv4 par recopie
     * @param ip L'adresse IP à récopier
     */
    public IPv4(IPv4 ip) {
        super('.',ip.getO1(), ip.getO2(), ip.getO3(), ip.getO4());
    }  
    
    /**
     * G�n�raliser une adresse ip pour les tables de routage
     * @return L'adresse ip correspondante ayant pour dernier octet O
     */
    public IPv4 generaliserIP() {
        IPv4 ip = new IPv4(this);
        ip.setOctet4(0);
        return ip;
    }

    public String toString(){
    	return super.toString();
    }  
    
    


}
