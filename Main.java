package modnetwork.Reseau;

public class Main{



	public static void main(String[] args) {
		IPv4 addIp = new IPv4(123,34,21,3);
		MAC addmac = new MAC();
		
		CarteReseau carte = new CarteReseau(addIp);

		System.out.println(addmac);
		System.out.println(addIp);
		System.out.println(carte);
		
		
		
		SousReseau sr = new SousReseau(null);
		
		Machine m = new Machine(sr);
		Machine m2 = new Machine(sr);
		Machine m3= new Machine(sr);
		Machine m4 = new Machine(sr);
		Machine m5 = new Machine(sr);
		Hub h = new Hub(sr);
		Switch s = new Switch(sr);
		
		sr.addMachine(m);
		sr.addMachine(m2);
		sr.addMachine(m3);
		sr.addMachine(m4);
		sr.addMachine(m5);
		System.out.println(sr);
		System.out.println(m);
		System.out.println(h);
		System.out.println(s);
		System.out.println("Test\n");
		System.out.println(sr.getListeMachines());
		
	}
	
}