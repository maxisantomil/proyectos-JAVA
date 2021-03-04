
public class CriterioActor implements Criterio {

	private Actor actor1;
	
	public CriterioActor(Actor ac1) {
		this.actor1=ac1;
	}
	
	public boolean cumple(Pelicula p) {
		return p.contieneActor(actor1);
	}

}
