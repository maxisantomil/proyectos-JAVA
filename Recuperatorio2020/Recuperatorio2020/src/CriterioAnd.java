
public class CriterioAnd implements Criterio {

	private Criterio c1;
	private Criterio c2;
	
	
	public CriterioAnd( Criterio cc1, Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	@Override
	public boolean cumple(Voluntario v) {
	return (c1.cumple(v)&& c2.cumple(v));
	
	}

}
