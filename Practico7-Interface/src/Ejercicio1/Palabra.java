package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Palabra implements Comparable<Palabra> {
	private String nombre_palabra;
	private String definicion;
	private ArrayList<String>sinonimos;
	private ArrayList<String>antonimos;
	
	public Palabra (String n,String definicion) {
		this.nombre_palabra=n;
		this.definicion=definicion;
		sinonimos= new ArrayList<>();
		antonimos= new ArrayList<>();
	}
	
	
	
	public void agregarSinonimo(String sino) {
		sinonimos.add(sino);
		Collections.sort(this.sinonimos);
	}
	

	public void agregarAntonimo(String anto) {
		antonimos.add(anto);
		Collections.sort(this.antonimos);
	}
	
	
	public String getNombre_palabra() {
		return nombre_palabra;
	}



	public void setNombre_palabra(String nombre_palabra) {
		this.nombre_palabra = nombre_palabra;
	}



	public String getDefinicion() {
		return definicion;
	}



	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}


	

	public ArrayList<String> getSinonimos() {
		return (ArrayList<String>)sinonimos.clone();
	}




	public void setSinonimos(ArrayList<String> sinonimos) {
		this.sinonimos = sinonimos;
	}




	public ArrayList<String> getAntonimos() {
		return (ArrayList<String>)antonimos.clone();
	}




	public void setAntonimos(ArrayList<String> antonimos) {
		this.antonimos = antonimos;
	}

	
	public boolean equals(Object p) {
		try {
			Palabra comparar= (Palabra)p;
		return (this.getNombre_palabra().equals(comparar.getNombre_palabra()));
		}catch(Exception exc) { 
			return false;
		}
	}



	public int compareTo(Palabra x) {
		return this.getNombre_palabra().toLowerCase().compareTo(x.getNombre_palabra().toLowerCase());

	}

	
	public void modificarpalabra(Palabra p) {
		this.setDefinicion(p.getDefinicion());
		this.setAntonimos(p.getAntonimos());
		this.setSinonimos(p.getSinonimos());
	}


	@Override
	public String toString() {
		return "Palabra [nombre_palabra=" + nombre_palabra + ", definicion=" + definicion + ", sinonimos=" + sinonimos
				+ ", antonimos=" + antonimos + "]";
	}
	
	
}
