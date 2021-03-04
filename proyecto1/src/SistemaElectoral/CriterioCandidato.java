package SistemaElectoral;

public class CriterioCandidato implements Criterio{
	private String candidato;

	
	public CriterioCandidato(String n) {
		this.candidato=n;
	}
	
	public boolean Cumple(ElementSE e) {
		return e.getCandidato()==this.candidato;
	}
}
