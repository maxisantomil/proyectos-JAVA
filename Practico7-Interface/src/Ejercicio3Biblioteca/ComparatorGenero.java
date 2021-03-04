package Ejercicio3Biblioteca;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		
		return o1.getGenero().toLowerCase().compareTo(o2.getGenero().toLowerCase());
	}
	

}
