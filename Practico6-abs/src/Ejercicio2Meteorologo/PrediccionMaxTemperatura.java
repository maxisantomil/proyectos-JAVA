package Ejercicio2Meteorologo;

import java.util.ArrayList;

public class PrediccionMaxTemperatura extends Criterio {
	Sensor sensor;
	int cantMaximaRegistros;
	double minTemperatura;
	PrediccionMaxTemperatura(Sensor sensor,int cant, int maxT){
		this.sensor= sensor;
		this.cantMaximaRegistros=cant;
		this.minTemperatura=maxT;
	
	}

	@Override
	public boolean predicelluvia() {
		if (sensor.valorMaximoNRegistros(cantMaximaRegistros) > minTemperatura){
			return true;
		}
		return false;
	}

}
