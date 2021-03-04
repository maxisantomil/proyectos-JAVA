package Ejercicio4Vivero;

public class FiltroClasificacion extends Filtro {
	private String clasificacion;
	
	public FiltroClasificacion(String cla) {
		this.clasificacion=cla;
	}
	
	@Override
	public boolean cumple(Fichaplanta f) {
		return f.getClasificaciónSuperior().equals(clasificacion);
	}

}
