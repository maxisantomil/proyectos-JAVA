package Ejercicio2Meteorologo;

import java.util.ArrayList;

public class PrediccionPrecipitaciones extends Criterio {
	int cantRegistros;
	Sensor sensor;
	double max;
	public PrediccionPrecipitaciones(Sensor s,int cantRegistros,double maxmilimetros) {
		this.sensor=s;
		this.cantRegistros=cantRegistros;
		this.max=maxmilimetros;
	}

	@Override
	public boolean predicelluvia() {
	 if (sensor.promedioXcantRegistros(cantRegistros)< max) {
		 return true;
	 }
		return false;
		
	}
	

}
