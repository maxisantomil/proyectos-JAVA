package Ejercicio1Contrato;

public class CriterioSueldo extends Criterio {
	double sueldo;
	
	public CriterioSueldo(double s) {
		sueldo=s;
	}
	
	
	public void setSueldo(double s) {
		sueldo=s;
	}
	@Override
	public boolean acepta(Contrato c) {
		// TODO Auto-generated method stub
		if (c.getSueldo()>sueldo) {
			return true;
		}
		
		return false;
	}

}
