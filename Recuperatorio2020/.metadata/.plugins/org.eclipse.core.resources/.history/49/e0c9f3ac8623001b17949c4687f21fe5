
public class CriterioNot implements Criterio {

	private Criterio c;
	
	
	public CriterioNot(Criterio cc) {
		c=cc;
	}
	
	@Override
	public boolean cumple(Voluntario v) {
		return !c.cumple(v);
	}

}
