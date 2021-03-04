
public class CriterioContrajoEnfermedad implements Criterio {

	@Override
	public boolean cumple(Voluntario v) {
		return v.isContrajoEnfermedad();
	}

}
