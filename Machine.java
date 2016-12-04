package modnetwork.Reseau;

import java.io.Serializable;

public class Machine extends Element implements Serializable {
    private CarteReseau carteReseau;
    //private ArrayList<RegleARP> cacheARP;
    private static int oct4 = 2;
    /**
     * Cr�e une nouvelle Machine
     * @param sr Le sous-r�seau auquel la machine appartient
     */
    public Machine(SousReseau sr){
    	super(1);
        IPv4 ipSR = sr.getIPmachines();
        
        
        IPv4 ip = new IPv4((int)sr.getIPmachines().getO1(), (int)sr.getIPmachines().getO2(), (int)sr.getIPmachines().getO3(), oct4);
      
        this.oct4++;
        
        this.carteReseau=new CarteReseau(ip);
       /* this.cacheARP = new ArrayList();
        
        //On assigne les r�gles de base de la table de routage
        this.carteReseau.addRegleMoi();
        this.carteReseau.addRegleSousReseau(sr.getIP());
        this.carteReseau.addRegleBroadcast();*/
    }
}