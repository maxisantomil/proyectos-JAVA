package Ejercicio4Contribuyentes;

import java.util.ArrayList;

public class Ciudad {
	String nombre;
	int cantHabitantes;
	ArrayList<Contribuyente>contribuyentes; 
	double gastosMantenimiento;
	
	public Ciudad (String n, int cant, double g) {
		nombre=n;
		cantHabitantes=cant;
		gastosMantenimiento=g;
		contribuyentes= new ArrayList<>();
	}
	
	public void agregarContribuyente(Contribuyente x) {
		contribuyentes.add(x);
	}
	
	public double montoRecaudado () {
		double sumaMonto=0.0;
		for (Contribuyente x:contribuyentes) {
			sumaMonto+=x.getMonto();
		}
		return sumaMonto;
	}
	
	public boolean estaEnDeficit() {
		return (montoRecaudado() < gastosMantenimiento);
		}
	
	public String informeCiudad() {
		if (estaEnDeficit()) {
			return "la ciudad gasta mas de lo que recauda";
		}else return "la ciudad se encuentra balanceada";
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", cantHabitantes=" + cantHabitantes + ", contribuyentes=" + contribuyentes
				+ ", gastosMantenimiento=" + gastosMantenimiento + "]";
	}
	
	
}
