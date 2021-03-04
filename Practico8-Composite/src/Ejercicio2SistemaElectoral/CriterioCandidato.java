package Ejercicio2SistemaElectoral;

public class CriterioCandidato extends Criterio{
	
	private Candidato c;
	
	public CriterioCandidato(Candidato cc1) {
		c=cc1;
	}

	@Override
	public boolean cumple(Voto voto) {
		 if (voto.getCandidato()!=null) {
			 return(voto.getCandidato().equals(c));
		 }
		 return false;
	}
}