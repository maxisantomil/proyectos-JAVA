package Ejercicio2SistemaElectoral;

public class CriterioVotosBlanco extends Criterio {

	@Override
	public boolean cumple(Voto voto) {
		return (voto.getCandidato()==null);
	}

}
