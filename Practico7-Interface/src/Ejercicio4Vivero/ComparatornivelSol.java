package Ejercicio4Vivero;

import java.util.Comparator;

public class ComparatornivelSol implements Comparator<Fichaplanta>{

	@Override
	public int compare(Fichaplanta o1, Fichaplanta o2) {
		int resultado= o1.getSol()-o2.getSol();
		return resultado;
	}

}
