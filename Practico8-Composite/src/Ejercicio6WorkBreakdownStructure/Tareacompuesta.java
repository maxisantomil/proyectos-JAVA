package Ejercicio6WorkBreakdownStructure;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Tareacompuesta extends ElementTarea {
	private ArrayList<ElementTarea>tareas;
	
	public Tareacompuesta(String nombre) {
		super(nombre);
		tareas= new ArrayList<>();
	}
	
	
	
	

	public ArrayList<ElementTarea> getTareas() {
		return new ArrayList<>(this.tareas);
	}



	@Override
	public ArrayList<ElementTarea> listatareasRecurso(Recurso r) {
		ArrayList<ElementTarea> aux= new ArrayList<>();
		for (ElementTarea t:tareas) {
			aux.addAll(t.listatareasRecurso(r));
		}
		if (!aux.isEmpty())
			aux.add(this);
		return aux;
	}
	
	public void agregarTarea(ElementTarea n) {
		if (!tareas.contains(n)) {
			tareas.add(n);
			Collections.sort(tareas);
		}
	}

	@Override
	public ArrayList<Recurso> listadeRecursosInvolucrados() {
		ArrayList<Recurso>recursos= new ArrayList<>();
		ArrayList<Recurso>aux= null;
		for (ElementTarea t:tareas) {
			aux=t.listadeRecursosInvolucrados();
			for (Recurso r: aux) {
				if (!recursos.contains(r)) {
					recursos.add(r);
				}
			}
		}
		return recursos;
	}

	@Override
	public boolean SepuedeasignarRecurso(Recurso r) {
		for (ElementTarea t: tareas) {
			if (t.SepuedeasignarRecurso(r)){
				return true;
			}
		}
		return false;
	}


	@Override
	public int duracionTarea() {
		int suma= 0 ;
		for (ElementTarea t:tareas) {
			suma+= t.duracionTarea();
		}
		return suma;
	}





	@Override
	public LocalDate getFechaInicio() {
		return this.tareas.get(0).getFechaInicio();
	}





	@Override
	public LocalDate getFechaFin() {
		return this.tareas.get(tareas.size()-1).getFechaFin();
	}





	@Override
	public void setFechaInicio(LocalDate fechaini) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void setFechafin(LocalDate fechafin) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public String toString() {
		return "Tareacompuesta [tareas=" + tareas + "]";
	}





	
	
	
	
	
}
