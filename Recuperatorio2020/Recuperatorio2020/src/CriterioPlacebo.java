
public class CriterioPlacebo implements Criterio {

	
	@Override
	public boolean cumple(Voluntario v) {
		return v.isRecibioPlacebo();
	}

}
