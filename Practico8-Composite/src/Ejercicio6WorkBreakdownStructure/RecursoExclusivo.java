package Ejercicio6WorkBreakdownStructure;

import java.util.ArrayList;

public class RecursoExclusivo extends Recurso {
	
	
	public RecursoExclusivo(String nomb) {
		super(nomb);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isEstaocupado() {
		return super.estaocupado;
	}


	@Override
	public void setEstaocupado(Boolean f) {
		this.estaocupado = f;
		
	}
	
	public boolean estoydisponibleparaTarea(Tareaterminal t) {
		for (Tareaterminal tarea : tareasasignadas) {
			if (tarea.compararFecha(t)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	public boolean equals(Object o1) {
		try {
		RecursoExclusivo r= (RecursoExclusivo)o1;
		return this.getNombre().equals(r.getNombre());
		}catch(Exception exc) {
			return false;
		}
	}
}
