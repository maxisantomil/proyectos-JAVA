package Ejercicio2Vocabulario;

public class CriterioMenosFrecuentes implements Criterio {

	int frecuencia_max;
	
	public CriterioMenosFrecuentes(int max) {
		this.frecuencia_max=max;
	}
	
	@Override
	public boolean cumple(Palabra p) {
		return p.getCantidad()<frecuencia_max;
	}

}
