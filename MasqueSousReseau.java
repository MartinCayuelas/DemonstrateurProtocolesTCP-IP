/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modnetwork.Reseau;

import java.io.Serializable;

/**
 *
 * @author leoreynaert
 */
class MasqueSousReseau extends Adresse implements Serializable {
    
    /**
     * Crée un nouveau masque de sous-réseau
     * @param o1 Le premier octet
     * @param o2 Le deuxième octet
     * @param o3 Le troisième octet
     * @param o4 Le quatrième octet
     */
    public MasqueSousReseau(int o1, int o2, int o3, int o4) {
        super('.', o1, o2, o3, o4);
    }

}
