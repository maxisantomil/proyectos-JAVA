
public class CriterioGenero implements Criterio {

	private String genero;
	
	public CriterioGenero(String s) {
		genero=s;
	}
	@Override
	public boolean cumple(Voluntario v) {
		return v.getGenero().equals(genero.toLowerCase());
	}

}
