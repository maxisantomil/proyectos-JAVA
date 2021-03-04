package Ejercicio2SistemaElectoral;

import java.util.Comparator;

public class ComparatorAnd implements Comparator<Candidato>{

	private Comparator c1;
	private Comparator c2;
	
	public ComparatorAnd(Comparator cc1, Comparator cc2) {
		c1=cc1;
		c2=cc2;
	}
	@Override
	public int compare(Candidato o1, Candidato o2) {
		int resultado= c1.compare(o1, o2);
		if (resultado==0) {
			resultado= c2.compare(o1, o2);
		}
		return resultado;
	}

}
