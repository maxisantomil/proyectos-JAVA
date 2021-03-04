package Ejercicio2SistemaElectoral;

import java.util.Comparator;

public class ComparatorporPartido implements Comparator<Candidato>{

	
	
	
	@Override
	public int compare(Candidato o1, Candidato o2) {
		int aux=o1.getPartido_politico().compareTo(o2.getPartido_politico());
		if ((aux)>0) {
			return 1000;
		}
		else if (aux < 0) {
			return -1000;
		}else { 
				return(o1.getAgrupacion().compareTo(o2.getAgrupacion()));
			}
		}
		
	}
	
