package Ejercicio2SistemaElectoral;

public class Candidato implements Comparable<Candidato>{
	private String nombre;
	private String partido_politico;
	private String agrupacion;
	
	
	
	public Candidato(String n, String parti, String agru) {
		this.nombre=n;
		this.partido_politico=parti;
		this.agrupacion=agru;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPartido_politico() {
		return partido_politico;
	}
	public void setPartido_politico(String partido_politico) {
		this.partido_politico = partido_politico;
	}
	public String getAgrupacion() {
		return agrupacion;
	}
	public void setAgrupacion(String agrupacion) {
		this.agrupacion = agrupacion;
	}
	
	public boolean equals(Candidato c) {
		return this.getNombre().equals(c.getNombre());
	}



	@Override
	public String toString() {
		return "Candidato [nombre=" + nombre + ", partido_politico=" + partido_politico + ", agrupacion=" + agrupacion
				+ "]";
	}



	@Override
	public int compareTo(Candidato o) {
		if ((this.getPartido_politico().compareTo(o.getPartido_politico()))>0){
			return 100;
				
		}else  if ((this.getPartido_politico().compareTo(o.getPartido_politico()))==0){
						if (this.getAgrupacion().compareTo(o.getAgrupacion())>0){
							return 100;
							}else if(this.getAgrupacion().compareTo(o.getAgrupacion())==0){
									if (this.getNombre().compareTo(o.getNombre())>0) {
										return 100;
									}else if (this.getNombre().compareTo(o.getNombre())<0) {
										return -100;
										}
									else return 0;
								}
						
							else return -100;
						
			}
		else return -100;
	}
	
	
	

}
