package Ejercicio4Contribuyentes;

import java.util.ArrayList;

public class Territorio {
	String nombre;
	ArrayList<Ciudad>provincia;
	
	public Territorio(String nombre) {
		this.nombre=nombre;
		provincia=new ArrayList<>();
	}
	
	public void agregarCiudad(Ciudad c) {
		provincia.add(c);
	}

	public String provDeficit() {
		int cant=0;
		for (Ciudad c:provincia) {
			if (c.estaEnDeficit()){
				cant++;
			}
		}
		if (cant > (provincia.size()/2)){
			return "la provincia tiene mas de la mitad de sus ciudades en deficit";
		}else return "la provincia no esta en deficit por el momento";
	}
	
	public ArrayList<Ciudad> ciudadesEnDeficit(){
		ArrayList<Ciudad> copia= new ArrayList<>();
		for (Ciudad c:provincia) {
			if (c.estaEnDeficit()){
				copia.add(c);
			}
		}
		return copia;
	}
}
