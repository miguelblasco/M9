package cohetes.domain;

import java.util.ArrayList;
import java.util.List;

public class Cohete {

	private String codigo;
	List<Propulsor> propulsores = new ArrayList<Propulsor>();

	public Cohete(String codigo) {// Método constructor
		this.codigo = codigo;

	}

	public void addPropulsor(Propulsor p) {
		this.propulsores.add(p);
		new Thread(p).start();
	}

	public void accelerar()
	{
		for(Propulsor p : propulsores)
		{
			p.accelerar();
		}
	}
	
	public void frenar()
	{
		for(Propulsor p : propulsores)
		{
			p.frenar();
		}
	}
	
	public void apagarPropulsors()
	{
		for(Propulsor p : propulsores)
		{
			p.apagarPropulsor();
		}
		
	}

	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Propulsor> getPropulsores() {
		return propulsores;
	}
	

	
	@Override
	public String toString() {
		return "Cohete [id = " + codigo + "\n" + " potencia máxima: " + propulsores + "]";
	}

}
