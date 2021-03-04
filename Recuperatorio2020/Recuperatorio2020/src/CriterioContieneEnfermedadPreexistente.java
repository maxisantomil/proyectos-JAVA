
public class CriterioContieneEnfermedadPreexistente implements Criterio {

	private String enfermedad;
	
	public CriterioContieneEnfermedadPreexistente(String enf) {
		enfermedad= enf;
	}
	
	@Override
	public boolean cumple(Voluntario v) {
		return v.contieneEnfermedad(enfermedad.toLowerCase());
	}

}