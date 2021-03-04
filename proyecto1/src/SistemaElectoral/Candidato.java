package SistemaElectoral;

public class Candidato {
	String nombre;
	String partido;
	String Agrupacion;


	public Candidato(String n,String p,String a){
		nombre=n;
		partido=p;
		Agrupacion=a;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getAgrupacion() {
		return Agrupacion;
	}

	public void setAgrupacion(String agrupacion) {
		Agrupacion = agrupacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
