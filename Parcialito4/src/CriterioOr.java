
public class CriterioOr extends Criterio {
	private Criterio c1;
	private Criterio c2;
	
	public CriterioOr(Criterio cc1,Criterio cc2) {
		this.c1=cc1;
		this.c2=cc2;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if (c1.cumple(p) || c2.cumple(p)){
			return true;
		}
		return false;
	}

}
