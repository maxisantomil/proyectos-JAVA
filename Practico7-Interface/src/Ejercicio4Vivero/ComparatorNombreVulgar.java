package Ejercicio4Vivero;

import java.util.Comparator;

public class ComparatorNombreVulgar implements Comparator<Fichaplanta> {

	@Override
	public int compare(Fichaplanta o1, Fichaplanta o2) {
		return o1.getPrimerNombreVulgar().compareTo(o2.getPrimerNombreVulgar());
	}

}
