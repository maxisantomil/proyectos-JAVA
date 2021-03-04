import java.util.ArrayList;

public class CriterioGenero extends Criterio {
	private String genero;
	
	public CriterioGenero(String genero) {
		this.genero=genero;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		ArrayList<String>generos= p.getGeneros();
		for (String g:generos) {
			if (g.toLowerCase().equals(genero.toLowerCase())){
				return true;
			}
		}
		return false;
	}

}
