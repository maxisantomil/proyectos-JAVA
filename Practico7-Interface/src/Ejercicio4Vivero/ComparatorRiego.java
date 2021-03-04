package Ejercicio4Vivero;

import java.util.Comparator;

public class ComparatorRiego implements Comparator<Fichaplanta> {

	@Override
	public int compare(Fichaplanta o1, Fichaplanta o2) {
		return o1.getRiego()-o2.getRiego();
	}

}
