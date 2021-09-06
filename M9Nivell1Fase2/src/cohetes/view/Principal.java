package cohetes.view;

import cohetes.domain.Cohete;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] propulsores1 = { 10, 30, 80};
		int [] propulsores2 = { 30, 40, 50, 50, 30, 10};

		Cohete cohete1 = new Cohete ("32WESSDS", propulsores1);
		Cohete cohete2 = new Cohete ("LDSFJA32", propulsores2);
		
		System.out.println(cohete1.toString());     
		System.out.println(cohete2.toString());
		
	}
}
