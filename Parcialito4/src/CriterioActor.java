import java.util.ArrayList;

public class CriterioActor extends Criterio {
	private String actor;
	
	public CriterioActor(String actor) {
		this.actor=actor;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		ArrayList<String>actores= p.getActores();
		for (String a: actores) {
			if (a.toLowerCase().equals(actor.toLowerCase())){
				return true;
			}
		}
		return false;
	}
}
