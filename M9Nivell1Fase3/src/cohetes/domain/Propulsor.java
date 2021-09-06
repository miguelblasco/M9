package cohetes.domain;

public class Propulsor implements Runnable {

	private int id;
	private int potenciaMax;
	private int potenciaActual;
	private int potenciaObjectiu;

	private boolean cierrePropulsor;
	private byte incrementOdecrement;
	
	
	
	public void accelerar()
	{
		this.incrementOdecrement = 1;
	}

	public void frenar()
	{
		this.incrementOdecrement = -1;
	}

	public void apagarPropulsor()
	{
		this.cierrePropulsor = true;
		
	}


	public Propulsor(int id, int potenciaMax, int potenciaObjectiu) {
		this.id = id;
		this.potenciaMax = potenciaMax;
		this.potenciaObjectiu = potenciaObjectiu;
		this.potenciaActual = 0;
		this.cierrePropulsor = false;
		this.incrementOdecrement = 0;

	}



	@Override
	public void run() {
		
		while (cierrePropulsor != true)
		{
			
			if (this.incrementOdecrement == 0)
			{
				
			}
			else if (this.incrementOdecrement == 1)
			{
				if (potenciaActual <  potenciaObjectiu)
				{
					potenciaActual++;
				}
			}
			else if (this.incrementOdecrement == -1)
			{
				if (potenciaActual >  0)
				{
					potenciaActual--;
				}
			}
			
			System.out.println(this.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Cerrado propulsor: " + this.toString());
		
	}

	@Override
	public String toString() {
		return "Propulsor [id=" + id + ", potenciaActual=" + potenciaActual + ", potenciaObjectiu=" + potenciaObjectiu
				+ "]";
	}
	
	

}
