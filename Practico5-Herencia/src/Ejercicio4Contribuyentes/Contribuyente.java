package Ejercicio4Contribuyentes;

public class Contribuyente {
	String nombre;
	int codid;
	double monto;
	
	
	public Contribuyente(String n, int cod, double mont){
		nombre= n;
		codid= cod;
		monto=mont;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCodid() {
		return codid;
	}


	public void setCodid(int codid) {
		this.codid = codid;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double montofijo) {
		this.monto = montofijo;
	}
	
	

}
