package Ejercicio2;

import java.util.ArrayList;


public class Alarma {
	String nombre;
	ArrayList<Sensor>Sensores;
	Timbre timbre;

	public Alarma() {
		nombre="comun";
		Sensores= new ArrayList<Sensor>();
	}


public ArrayList<Sensor> getSensores() {
		ArrayList<Sensor>copia= new ArrayList<Sensor>();
		for(Sensor s:Sensores) {
			copia.add(s);
		}
		return copia;
	}


	public void AgregarSensor(Sensor s) {
		Sensores.add(s); 
	}


public void  comprobar () {
	for (Sensor s:Sensores) {
		if (s.seActivo) {
			ActivarAlarma();
			mensaje(s);
		}
	}
}

public void ActivarAlarma() {
		timbre.HacerSonar();
	}

public void setTimbre(Timbre t) {
	timbre=t;
}


public void mensaje(Sensor s) {
	System.out.println("Se activo la alarma de la zona: "+ s.getNombreZona());
	}
}