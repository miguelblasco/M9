package cohetes.view;

import cohetes.domain.Cohete;
import cohetes.domain.Propulsor;

public class Principal {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Cohete cohete1 = new Cohete("32WESSDS");
		cohete1.addPropulsor(new Propulsor(10, 10, 8));
		cohete1.addPropulsor(new Propulsor(11, 30, 25));
		cohete1.addPropulsor(new Propulsor(12, 80, 77));

		Cohete cohete2 = new Cohete("LDSFJA32");
		cohete2.addPropulsor(new Propulsor(20, 30, 30));
		cohete2.addPropulsor(new Propulsor(21, 40, 40));
		cohete2.addPropulsor(new Propulsor(22, 50, 45));
		cohete2.addPropulsor(new Propulsor(23, 50, 41));
		cohete2.addPropulsor(new Propulsor(24, 30, 24));
		cohete2.addPropulsor(new Propulsor(25, 10, 5));
		
		cohete1.accelerar();
		cohete2.accelerar();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cohete1.frenar();
		cohete2.frenar();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cohete1.apagarPropulsors();
		cohete2.apagarPropulsors();
	}
}
