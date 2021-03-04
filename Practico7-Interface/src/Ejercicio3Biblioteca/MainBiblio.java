package Ejercicio3Biblioteca;

import java.util.Comparator;

public class MainBiblio {

	public static void main(String[] args) {
		Biblioteca Alfa= new Biblioteca("Alfa");
		Libro l1= new Libro(1, "harry potter 1 ", "ziza", 2000, "fantasia");
		Libro l2= new Libro(5, "harry potter 3 ", "reen", 2000, "fantasia");
		Libro l3= new Libro(3, "harry potter 2 ", "austing", 2001, "fantasia");
		Libro l4= new Libro(2, "cien anios de soledad", "marquez", 1960, "bibliografica");

		Libro l5= new Libro(4, "Angular basico", "ww", 2010, "profesional");
		Comparator comparatorAutor = new ComparatorAutor();
		Alfa.agregarLibro(l1);
		Alfa.agregarLibro(l2);
		Alfa.agregarLibro(l3);
		Alfa.agregarLibro(l4);
		Alfa.agregarLibro(l5);
		
		//System.out.println(Alfa.mostrarLibros_porDefecto());
		//System.out.println(Alfa.ordenarLibros_porAutor());
		//System.out.println(Alfa.ordenarLibros_porAnioEdicion());
		//System.out.println(Alfa.ordenarLibros_porGenero());
		System.out.println(Alfa.ordenarLibros_porXCriterio(comparatorAutor));
	}

}
