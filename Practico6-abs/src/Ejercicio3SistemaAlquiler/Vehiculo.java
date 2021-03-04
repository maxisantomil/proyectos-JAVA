package Ejercicio3SistemaAlquiler;

import java.time.LocalDate;

public class Vehiculo extends Item {
	private String marca;
	private int km;
	private String patente;
	private boolean ocupado;
	
	public Vehiculo(String marca,int kmm,String patente,boolean c) {
		super();
		this.marca=marca;
		this.km=kmm;
		this.patente=patente;
		this.ocupado=c;
	}
	
	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}


	public boolean isOcupado() {
		return ocupado;
	}


	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}


	public String getMarca() {
		return marca;
	}


	public String getPatente() {
		return patente;
	}


	@Override
	public boolean estaDisponible() {
		if (!ocupado){
		return true;
		}
		return false;
	}


	@Override
	public void itemDevuelto() {
		ocupado=false;
	}


	@Override
	public void itemAlquilado() {
		ocupado=true;
	}
	
	public boolean equals(Object i) {
		Vehiculo item= (Vehiculo)i;
		try {
		return (item.getPatente()== this.patente);
		}catch(Exception e) {
		return false;
		}
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", km=" + km + ", patente=" + patente + ", ocupado=" + ocupado + "]";
	}
	
}
