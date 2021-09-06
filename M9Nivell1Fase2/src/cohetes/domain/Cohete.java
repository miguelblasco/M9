package cohetes.domain;

import java.util.ArrayList;
import java.util.List;



public class Cohete {

	private String codigo;
	private List<Propulsor> propulsores = new  ArrayList<Propulsor>();
	
	public Cohete (String codigo, int[] propulsores) {
		
		this.codigo = codigo;
		for(Integer potencia:propulsores) {
			this.propulsores.add(new Propulsor(potencia));
			
		}	
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/*	public int getPropulsores() {
		return propulsores;
	}

	public void setPropulsores(int propulsores) {
		this.propulsores = propulsores;
	}  */
	
	public List<Propulsor> getPropulsores() {
		return propulsores;
	}
	
	public void setAnadirPropulsor(Propulsor nuevoPropulsor){
	     propulsores.add(nuevoPropulsor);
	}
	
	@Override
	public String toString() {
		return "Cohete [id = " + codigo + "\n" + " propulsores: " + propulsores + "]";
	}
	
	
}
