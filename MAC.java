package modnetwork.Reseau;
import java.util.Random;

/**
*
* @author cayuelasM
*/

public class MAC extends Adresse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String octet5;  // Le 5e octet
	private String octet6;  // Le 6e octet
	private static Random generateMAC=new Random();  // Generer un nombre aléatoire
	
	// Tableau contenant les lettres utilis�es en Hexad�cimal
	private static char[] TabHexa={'A','B','C','D','E','F'}; 
	 /**
     * Crée une nouvelle adresse MAC
     * @param o1 Le premier octet
     * @param o2 Le second octet
     * @param o3 Le troisième octet
     * @param o4 Le quatrième octet
     * @param o5 Le cinquième octet
     * @param o6 Le sixième octet
     * 
     */
    public MAC (String o1, String o2, String o3, String o4, String o5, String o6) {
    	super(':', o1, o2, o3, o4);
    	this.octet5 = o5;
    	this.octet6 = o6;
    }

    /**
     * Crée une nouvelle adresse MAC générée automatiquement
     */

    public MAC(){
    	super(':',generateOctet(),generateOctet(),generateOctet(),generateOctet());
        this.octet5=generateOctet();
        this.octet6=generateOctet();
    }

     /**
     * Génère un octet aléatoirement
     * @return L'octet généré
     */

    public static String generateOctet() {
        String s1=decimalToHexa(generateMAC.nextInt(15));
        String s2=decimalToHexa(generateMAC.nextInt(15));
        return s1+s2;
    }

    /**
    * Permet de convertir un nombre décimal en hexadecimal
    * Particulierement si n > 9
    *
    * Retourne un nombre en Hexadecimal
    */

    public static String decimalToHexa(int n){
    	if (n>9) {
            for (int i=0; i<TabHexa.length; i++) {
                if (n==(9+i)) {
                    return TabHexa[i]+"";
                }
            }
        }
        
        return n+"";
      
    }

     // Getters
    
    /**
     * Renvoie le cinquième octet d'une adresse
     * @return Le cinquième octet
     */
    public String getO5() {
        return this.octet5;
    }

    /**
     * Renvoie le sixième octet d'une adresse
     * @return Le sixième octet
     */
    public String getO6() {
        return this.octet6;
    }

    public String toString() {
        return super.toString() + super.getSeparateur() + this.octet5 + super.getSeparateur() + this.octet6;
    }
}