package Ejercicio2Vocabulario;

public class CriterioMasFrecuentes implements Criterio {

	int frecuencia_min;
	
	
	public CriterioMasFrecuentes(int min) {
		this.frecuencia_min=min;
	}
	
	@Override
	public boolean cumple(Palabra p) {
		
		return p.getCantidad()>=frecuencia_min;
	}

}
