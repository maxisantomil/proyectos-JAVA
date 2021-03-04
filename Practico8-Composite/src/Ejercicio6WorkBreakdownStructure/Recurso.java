package Ejercicio6WorkBreakdownStructure;

import java.util.ArrayList;

public abstract class Recurso {
	String nombre;
	boolean estaocupado;
	ArrayList<Tareaterminal>tareasasignadas;
	
	
	
	public void asignarleTarea(Tareaterminal t) {
		if (!tareasasignadas.contains(t))
		this.tareasasignadas.add(t);
	}
	
	
	public Recurso(String nomb) {
		nombre=nomb;
		tareasasignadas= new ArrayList<>();
	};
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public abstract boolean isEstaocupado() ;

	
	@Override
	public String toString() {
		return "Recurso [nombre=" + nombre + "]";
	}
	
	public abstract void setEstaocupado(Boolean f);
	
	public abstract boolean estoydisponibleparaTarea(Tareaterminal t);
}
