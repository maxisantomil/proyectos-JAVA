package Ejercicio2;

import java.util.ArrayList;

public class Alumno {
	String nombre;
	String apellido;
	ArrayList<String> cualidades;
	ArrayList<Alumno>familiares;
	
	public Alumno (String n,String a) {
		nombre=n;
		apellido=a;
		cualidades= new ArrayList<>();
		familiares= new ArrayList<>();
	}
	
	public void AgregarCualidades(String c) {
		cualidades.add(c);
	}
	
	public void agregarFamiliar(Alumno a) {
		familiares.add(a);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<String> getCualidades() {
		return cualidades;
	}


	public ArrayList<Alumno> getFamiliares() {
			ArrayList<Alumno> copia= new ArrayList<>();
			for (Alumno n:familiares) {
				copia.add(n);
			}
		return copia;
	}

	public void setFamiliares(ArrayList<Alumno> familiares) {
		this.familiares = familiares;
	}

	public boolean tieneFamiliarCasa(CasaHowart c ) {
		ArrayList<Alumno>alumnosCasa= c.getAlumnos();
		for (Alumno l:alumnosCasa) {
			if ((familiares.contains(l))){
				return true;
			}
		}
		return false;
	}
	public boolean equals (Object o1) {
		try {
			Alumno alum = (Alumno)o1;
			return (alum.getApellido() == apellido);
			
		}catch(Exception e ) {
			return false;
		}
	}
	
	public String toString() {
		return "" + nombre + ", "+ apellido +" cualidades:" + cualidades.toString() +", "+ familiares.size();
	}
}