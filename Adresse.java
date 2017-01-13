
package modnetwork.Reseau;
import java.io.Serializable;

/**
 *
 * @author CayuelasM
 */
public class Adresse <T> implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private char separateur;
    private T octet1;
    private T octet2;
    private T octet3;
    private T octet4;
    
    /**
     * Crée une nouvelle adresse (IPv4, sous-réseau ou MAC)
     * @param s Le séparateur des octets
     * @param o1 Le premier octet
     * @param o2 Le second octet
     * @param o3 Le troisième octet
     * @param o4 Le quatrième octet
     */
    public Adresse (char s, T o1, T o2, T o3, T o4) {
        this.separateur=s;
        this.octet1=o1;
        this.octet2=o2;
        this.octet3=o3;
        this.octet4=o4;
    }
    
    /**
     * Crée une nouvelle adresse par recopie
     * @param a L'adresse à récopier
     */
    public Adresse (Adresse a) {
        this.separateur=a.getSep();
        this.octet1=(T)a.getO1();
        this.octet2=(T)a.getO2();
        this.octet3=(T)a.getO3();
        this.octet4=(T)a.getO4();
    }
    
    // Getters
    
    private char getSep() {
		// TODO Auto-generated method stub
		return this.separateur;
	}

	/**
     * Renvoie le premier octet d'une adresse
     * @return Le premier octet
     */
    public T getO1() {
        return this.octet1;
    }
    
    /**
     * Renvoie le second octet d'une adresse
     * @return Le second octet
     */
    public T getO2() {
        return this.octet2;
    }

    /**
     * Renvoie le troisième octet d'une adresse
     * @return Le troisième octet
     */
    public T getO3() {
        return this.octet3;
    }
    
    /**
     * Renvoie le quatrième octet d'une adresse
     * @return Le quatrième octet
     */
    public T getO4() {
        return this.octet4;
    }
    
    // Setters
    
    /**
     * Modifie le quatrième octet d'une adresse
     * @param o4 L'octet à remplacer
     */
    public void setOctet4 (T o4) {
        this.octet4=o4;
    }
    
    /**
     * Renvoie le séparateur de l'adresse concernée
     * @return Le séparateur
     */
    public char getSeparateur() {
        return this.separateur;
    }
    
    /**
     * Vérifie si un objet est égal à l'adresse courante
     * @param o L'objet à comparer
     * @return true si ce sont les mêmes adresses | false sinon
     */
    public boolean equals(Object o) {
        if (o instanceof Adresse) {
            Adresse a = (Adresse)o;
            if (this.octet1.equals(a.getO1()) && this.octet2.equals(a.getO2()) && this.octet3.equals(a.getO3()) && this.octet4.equals(a.getO4())) {
                return true;
            }
        }
        return false;
    }

     
    
    /**
     * Affiche l'adresse
     * @return Le toString de l'adresse
     */
    public String toString() {
        return ""+this.octet1 + this.separateur + this.octet2 + this.separateur + this.octet3 + this.separateur + this.octet4;
    }
 
}