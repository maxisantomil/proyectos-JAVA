
public class CriterioAnd implements Criterio{

	private Criterio c1;
	private Criterio c2;
	
	public CriterioAnd(Criterio cc1, Criterio cc2) {
		this.c1=cc1;
		this.c2=cc2;
	}
	
	@Override
	public boolean cumple(Comarca c) {
	return c1.cumple(c) && c2.cumple(c);
	}

}
