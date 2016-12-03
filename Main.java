package modnetwork.Reseau;

public class Main{



	public static void main(String[] args) {
		IPv4 addIp = new IPv4(123,34,21,3);
		MAC addmac = new MAC();
		
		CarteReseau carte = new CarteReseau(addIp);

		System.out.println(addmac);
		System.out.println(addIp);
		System.out.println(carte);
	}
	
}