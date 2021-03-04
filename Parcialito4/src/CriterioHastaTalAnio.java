
public class CriterioHastaTalAnio extends Criterio {
	private int anio;
	
	public CriterioHastaTalAnio(int anio) {
		this.anio=anio;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if (p.getAnioEstreno()< anio) {
			return true;
		}
		return false;
	}

}