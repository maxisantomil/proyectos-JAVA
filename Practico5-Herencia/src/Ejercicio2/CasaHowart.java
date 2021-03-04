package Ejercicio2;

import java.util.ArrayList;

public class CasaHowart {
	private String nombre;
	 ArrayList<String> cualidades;
	 ArrayList<Alumno>Alumnos;
	protected int cantMaximaAlumnos;
	
	
	public CasaHowart(String n, int c) {
		nombre=n;
		cantMaximaAlumnos=c;
		cualidades= new ArrayList<>();
		Alumnos= new ArrayList<>();
	}
	
	
	public void AsignarCualidades(String cuali) {
		cualidades.add(cuali);
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<String> getCualidades() {
		return cualidades;
	}



	public ArrayList<Alumno> getAlumnos() {
		return Alumnos;
	}


	public void setAlumnos(ArrayList<Alumno> alumnos) {
		Alumnos = alumnos;
	}


	public int getCantMaximaAlumnos() {
		return cantMaximaAlumnos;
	}


	public void setCantMaximaAlumnos(int cantMaximaAlumnos) {
		this.cantMaximaAlumnos = cantMaximaAlumnos;
	}
	
	
	public boolean casallena() {
		return this.Alumnos.size()==this.cantMaximaAlumnos;
	}
	
	
	public boolean cumpleCualidades(Alumno a) {
		ArrayList<String> cualidadesA= a.getCualidades();
		for (String x:cualidadesA) {
			if (!(cualidades.contains(x))) {
				return false;
			}
		}
		return true;
	}

	public boolean cumpleCondiciones(Alumno p) {
		
		 if (!casallena()&& cumpleCualidades(p)){
			 return true;
		 	}
		 return false;
		}
	public void AgregarAlumno (Alumno p) {
		if (cumpleCondiciones(p)){
			Alumnos.add(p);
		}
	}
}
