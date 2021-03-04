package Ejercicio1Contrato;

public class CriterioExclusivo extends Criterio {

	@Override
	public boolean acepta(Contrato c) {
		return false;
	}

}
