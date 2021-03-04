package Ejercicio2SistemaElectoral;

import java.util.ArrayList;

public abstract class ElementoElectoral {
	
	private String nombre;
	
	
	public abstract String getNombre();


	protected abstract int contarTotalidadVotos();
	public abstract double porcentajeporCriterio(Criterio criterio);

	protected abstract int contarVotoxCriterio(Criterio criterio);
	public abstract ArrayList<Candidato>listaCandidatos();
}
