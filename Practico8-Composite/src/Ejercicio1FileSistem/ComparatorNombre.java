package Ejercicio1FileSistem;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<ElementFileSystem> {

	@Override
	public int compare(ElementFileSystem o1, ElementFileSystem o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
