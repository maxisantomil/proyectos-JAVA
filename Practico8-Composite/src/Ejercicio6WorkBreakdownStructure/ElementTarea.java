package Ejercicio6WorkBreakdownStructure;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementTarea implements Comparable<ElementTarea>{
	private String nombre;
	 LocalDate fechaInicio;
	 LocalDate fechaFin;


	 public ElementTarea(String nombre) {
		 this.nombre=nombre;
	 }
	 
	public abstract LocalDate getFechaInicio() ;
	public abstract LocalDate getFechaFin();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre2) {
		this.nombre=nombre2;
	}
	public abstract void setFechaInicio(LocalDate fechaini);
	
	public abstract void setFechafin(LocalDate fechafin);
	
	public abstract ArrayList<Recurso> listadeRecursosInvolucrados();
	public abstract boolean SepuedeasignarRecurso(Recurso r);
	
	public abstract ArrayList<ElementTarea>listatareasRecurso(Recurso r);
	
	public abstract int duracionTarea();
	
	public int compareTo(ElementTarea o) {
		return (this.getFechaInicio().compareTo(o.getFechaInicio()));
	}
	
	@Override
	public String toString() {
		return "ElementTarea [nombre=" + nombre + "]";
	}
	
}