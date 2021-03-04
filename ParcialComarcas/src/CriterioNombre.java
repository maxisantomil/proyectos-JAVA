
public class CriterioNombre implements Criterio {

	private String nombre;
	
	public CriterioNombre(String n) {
		nombre=n;
	}
	@Override
	public boolean cumple(Comarca c) {
		return c.getNombre().equals(nombre);
	}

}
