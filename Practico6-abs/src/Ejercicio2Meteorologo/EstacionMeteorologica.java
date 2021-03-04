package Ejercicio2Meteorologo;

import java.util.ArrayList;

public class EstacionMeteorologica {
	private String Nombre;
	private Sensor lluvia;
	private Sensor humedad;
	private Sensor temperatura;
	private Sensor viento;
	private Criterio criterioPrediccion;
	
	public EstacionMeteorologica(String n,Sensor lluvia, Sensor humedad,Sensor temperatura,Sensor viento,Criterio criterio) {
		this.Nombre=n;
		this.lluvia=lluvia;
		this.humedad=humedad;
		this.temperatura=temperatura;
		this.viento=viento;
		this.criterioPrediccion=criterio;
	}
	
	public double cantidadllovido() {
		return lluvia.sumaderegistros();
	}

	public boolean valloverenproxhora() {
			return criterioPrediccion.predicelluvia();
			
	}
	
	public void cambiarCriterio(Criterio x) {
		criterioPrediccion=x;
	}
	
	public String toString() {
		return  this.Nombre;
	}
	
}