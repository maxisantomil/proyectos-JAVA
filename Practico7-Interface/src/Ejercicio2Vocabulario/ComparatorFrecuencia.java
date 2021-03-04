package Ejercicio2Vocabulario;

import java.util.Comparator;

public class ComparatorFrecuencia implements Comparator<Palabra>{
	
	
	
	public int compare(Palabra p1, Palabra p2) {
		return p1.getCantidad()-p2.getCantidad();
	}

}
