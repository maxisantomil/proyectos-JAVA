
public class CriterioDirector extends Criterio {
	private String director;
	
	public CriterioDirector(String director) {
		this.director=director;
	}
	
	
	@Override
	public boolean cumple(Pelicula p) {
		if (p.getDirector().toLowerCase().contains(director.toLowerCase())) {
			return true;
		}
		return false;
	}

}