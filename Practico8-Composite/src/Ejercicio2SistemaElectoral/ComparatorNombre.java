package Ejercicio2SistemaElectoral;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Candidato> {

	@Override
	public int compare(Candidato o1, Candidato o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
