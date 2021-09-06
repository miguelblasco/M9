package cohetes.domain;


public class Cohete {

	private String codigo;
	private int propulsores;
	
	public Cohete (String codigo, int propulsores) {
		
		this.codigo = codigo;
		this.propulsores = propulsores;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPropulsores() {
		return propulsores;
	}

	public void setPropulsores(int propulsores) {
		this.propulsores = propulsores;
	}

	@Override
	public String toString() {
		return "Cohete id = " + codigo + ": Tiene " + propulsores + " propulsores";
	}	
}
