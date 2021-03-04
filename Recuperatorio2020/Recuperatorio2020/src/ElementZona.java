import java.util.ArrayList;

public abstract class ElementZona {

	private String nombre;
	
	public ElementZona(String n) {
		nombre=n;
	}
	

	public String getNombre() {
		return nombre;
	}
	
	public abstract int cantidadVoluntarios();
	public abstract int cantidadVoluntariosCriterio(Criterio c);
	
	public double porcentajeVoluntariosCriterio(Criterio c) {
		return ((double)cantidadVoluntariosCriterio(c)/cantidadVoluntarios())*100;
	}
	
	public abstract ArrayList<Voluntario>ListaVoluntariosVacuna(Criterio c);
	
	
	public boolean  equals(Object o) {
		try {
			ElementZona e= (ElementZona)o;
			return this.getNombre().equals(e.getNombre());
		}catch(Exception exc) {
			return false;
		}
	}
}
