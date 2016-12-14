
package modnetwork.Reseau;
import java.io.Serializable;

/**
 *
 * @author CayuelasM
 */
public class Adresse <T> implements Serializable {
    protected char separateur;
    protected T octet1;
    protected T octet2;
    protected T octet3;
    protected T octet4;
    
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
        this.octet1= (T)a.octet1;
        this.octet2= (T)a.octet2;
        this.octet3= (T)a.octet3;
        this.octet4= (T)a.octet4;
    }
    
    // Getters
    
    private char getSep() {
		// TODO Auto-generated method stub
		return this.separateur;
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
            if (this.octet1.equals(a.octet1) && this.octet2.equals(a.octet2) && this.octet3.equals(a.octet3) && this.octet4.equals(a.octet4)) {
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