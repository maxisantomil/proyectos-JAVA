package Ejercicio1Contrato;

public class Contrato {
	String empresa;
	double sueldo;
	int horasSemanales;
	
	public Contrato(String e, double s, int h) {
		empresa=e;
		sueldo=s;
		horasSemanales=h;
	}
	
	
	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public int getHorasSemanales() {
		return horasSemanales;
	}


	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

}