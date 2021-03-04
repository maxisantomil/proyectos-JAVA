package Ejercicio3Biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
	private String nombre;
	private ArrayList<Libro>libros;
	
	
	
	public Biblioteca(String nombre) {
		this.nombre=nombre;
		libros= new ArrayList<>();
	}
	
	
	public void agregarLibro(Libro l) {
		if (!libros.contains(l)) {
			libros.add(l);
		}
	}

	public ArrayList<Libro> mostrarLibros_porDefecto() {
		ArrayList<Libro> copia=(ArrayList<Libro>) libros.clone();
		Collections.sort(copia);
		return copia;
	}
	
	//modificar el ordenar
	public ArrayList<Libro> ordenarLibros_porXCriterio(Comparator Comparador ) {
		ArrayList<Libro> copia=(ArrayList<Libro>) libros.clone();
		Collections.sort(copia,Comparador);
		return copia;
	}


	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", libros=" + libros + "]";
	}
	
	
	
}
