import java.util.ArrayList;

public class Actor {
	private String nombre;
	private String apellido;
	private int anioNacimiento;
	private ArrayList<Pelicula>peliculasParticipo;
	
	
	
	public Actor(String n, String a, int anio) {
		this.nombre=n;
		this.apellido=a;
		this.anioNacimiento=anio;
		peliculasParticipo= new ArrayList<>();
	}
	
	public void agregarPelicula(Pelicula p) {
		if (!peliculasParticipo.contains(p))
			peliculasParticipo.add(p);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	public boolean equals(Object o) {
		try {
			Actor ac= (Actor)o;
			if (this.getNombre().equals(ac.getNombre()))
				if (this.getApellido().equals(ac.getApellido())){
					return true;
				}
		}catch(Exception exc) {
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public Actor getCopia() {
		Actor a= new Actor(this.getNombre(), this.getApellido(), this.getAnioNacimiento());
		for(Pelicula p: peliculasParticipo) {
			a.agregarPelicula(p);
		}
		return a;
	}
	
	
}
