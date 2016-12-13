package modnetwork.Reseau;

import java.io.Serializable;

public class MasqueSousReseau extends Adresse implements Serializable {
    
    /**
     * Cr�e un nouveau masque de sous-r�seau
     * @param o1 Le premier octet
     * @param o2 Le deuxi�me octet
     * @param o3 Le troisi�me octet
     * @param o4 Le quatri�me octet
     */
    public MasqueSousReseau(int o1, int o2, int o3, int o4) {
        super('.', o1, o2, o3, o4);
    }

}
