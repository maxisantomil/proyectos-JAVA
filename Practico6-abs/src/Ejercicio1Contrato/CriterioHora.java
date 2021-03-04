package Ejercicio1Contrato;

public class CriterioHora extends Criterio {
	int horas;
	
	public CriterioHora(int h) {
		horas=h;
	}
	
	public boolean acepta(Contrato c) {
		if (c.getHorasSemanales()< horas)
			return true;
		else return false;
	}

}
