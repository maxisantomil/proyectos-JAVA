package Ejercicio4;

import java.util.ArrayList;

public class SeleccionFutbol {
	String nombre;
	ArrayList<Persona>Plantel;
	
	
	public SeleccionFutbol(String n) {
		nombre=n;
		Plantel= new ArrayList<Persona>();
	}
	
	public void incorporarPersona(Persona p) {
		Plantel.add(p);
	}
	
	
	public ArrayList<Persona> disponiblesparaevento(){
		ArrayList<Persona> nuevo = new ArrayList<> ();
		for (Persona p:Plantel) {
			if (p.estadisponible()){
				nuevo.add(p);
			}
		}
		return nuevo;
	}
	public void estaDisponible(Persona p) {
		if (p.estadisponible()){
			System.out.println("se encuentra disponible para ir al evento");
		}
		else {
			System.out.println("no esta disponible "+ p.apellido);
		}
	}
}
