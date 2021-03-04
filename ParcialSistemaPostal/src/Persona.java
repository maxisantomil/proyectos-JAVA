
public class Persona {
	private String nombre;
	private Direccion direccion;
	
	
	public Persona(String nombre, Direccion d ) {
		this.nombre=nombre;
		this.direccion=d;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}


	public boolean contieneDireccion(String ciudad) {
	return direccion.contieneCiudad(ciudad);
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + "]";
	}


	
	
}
