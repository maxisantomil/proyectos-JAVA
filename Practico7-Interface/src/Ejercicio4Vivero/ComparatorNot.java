package Ejercicio4Vivero;

import java.util.Comparator;

public class ComparatorNot implements Comparator<Fichaplanta>{
	
	Comparator<Fichaplanta> c1;
	
	public ComparatorNot(Comparator<Fichaplanta> cc1) {
		this.c1=cc1;
	}
	
	@Override
	public int compare(Fichaplanta o1, Fichaplanta o2) {
		return -(c1.compare(o1, o2));
	}

}
