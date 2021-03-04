package Ejercicio4Vivero;

import java.util.Comparator;

public class ComparatorAnd implements Comparator<Fichaplanta> {
	
	Comparator<Fichaplanta>c1;
	Comparator<Fichaplanta>c2;
	
	
	public ComparatorAnd(Comparator<Fichaplanta> cc1,Comparator<Fichaplanta> cc2 ) {
		this.c1=cc1;
		this.c2=cc2;
	}

	@Override
	public int compare(Fichaplanta o1, Fichaplanta o2) {
		int resultado= c1.compare(o1, o2);
		if (resultado==0) {
			return c2.compare(o1, o2);
		}
		return resultado;
	}

}
