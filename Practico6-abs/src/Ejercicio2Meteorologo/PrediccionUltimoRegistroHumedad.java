package Ejercicio2Meteorologo;

public class PrediccionUltimoRegistroHumedad extends Criterio {
	private double valormaximo;
	private Sensor sensor;
	
	public PrediccionUltimoRegistroHumedad(Sensor sensor,double valormaximo) {
		this.valormaximo=valormaximo;
		this.sensor=sensor;
	}

	@Override
	public boolean predicelluvia() {
		return sensor.ultimoRegistro()>valormaximo;
	}

}
