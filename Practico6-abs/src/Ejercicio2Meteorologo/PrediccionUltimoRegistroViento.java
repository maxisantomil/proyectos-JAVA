package Ejercicio2Meteorologo;

public class PrediccionUltimoRegistroViento extends Criterio {
	Sensor sensor;
	double minViento;
	
	PrediccionUltimoRegistroViento(Sensor s,double min){
		sensor=s;
		minViento=min;
	}
	
	@Override
	public boolean predicelluvia() {
		if (sensor.ultimoRegistro() >minViento){
			return true;
		}
		return false;
	}

}
