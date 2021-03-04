
public class CriterioNot extends Criterio {
	private Criterio c1;
	
	public CriterioNot(Criterio cc1) {
		this.c1=cc1;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if (!c1.cumple(p)) {
			return true;
		}
		return false;
	}

}
