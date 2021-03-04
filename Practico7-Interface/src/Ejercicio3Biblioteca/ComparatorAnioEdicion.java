package Ejercicio3Biblioteca;

import java.util.Comparator;

public class ComparatorAnioEdicion implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAnio_edicion()-o2.getAnio_edicion();
	}

}
