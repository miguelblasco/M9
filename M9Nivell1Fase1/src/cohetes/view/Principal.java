package cohetes.view;

import cohetes.domain.Cohete;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cohete cohete1 = new Cohete ("32WESSDS", 3);
		Cohete cohete2 = new Cohete ("LDSFJA32", 6);
		
		System.out.println(cohete1.toString());
		System.out.println(cohete2.toString());
		
	}
}
