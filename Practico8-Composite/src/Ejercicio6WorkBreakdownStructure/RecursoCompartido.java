package Ejercicio6WorkBreakdownStructure;

public class RecursoCompartido extends Recurso {

	
	
	
	
	
	public RecursoCompartido(String nomb) {
		super(nomb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isEstaocupado() {
		return false;
	}

	@Override
	public void setEstaocupado(Boolean f) {
		
	}

	public boolean equals(Object o1) {
		try {
		RecursoCompartido r= (RecursoCompartido)o1;
		return this.getNombre().equals(r.getNombre());
		}catch(Exception exc) {
			return false;
		}
	}

	@Override
	public boolean estoydisponibleparaTarea(Tareaterminal t) {
		return true;
	}
}
