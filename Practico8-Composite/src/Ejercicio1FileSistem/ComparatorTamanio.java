package Ejercicio1FileSistem;

import java.util.Comparator;

public class ComparatorTamanio implements Comparator<ElementFileSystem> {

	@Override
	public int compare(ElementFileSystem o1, ElementFileSystem o2) {
		return (int)(o1.getTamanio()-o2.getTamanio());
	}

}
