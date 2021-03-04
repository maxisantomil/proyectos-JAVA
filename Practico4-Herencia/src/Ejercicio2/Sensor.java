package Ejercicio2;

public class Sensor {
	String nombreZona;
	Boolean seActivo;
	
	
	public Sensor(String n) {
		nombreZona=n;
		seActivo=false;
	}


	public String getNombreZona() {
		return nombreZona;
	}


	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}


	public Boolean getSeActivo() {
		return seActivo;
	}


	public void setSeActivo(Boolean seActivo) {
		this.seActivo = seActivo;
	}
	
	
}
