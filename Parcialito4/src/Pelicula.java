import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String>generos;
	private String director;
	private ArrayList<String>actores;
	private int anioEstreno;
	private int duracion;
	private int edadminima;
	
	public Pelicula(String titulo, String sinopsis, String director,int anio, int duracion, int edad ) {
		this.titulo=titulo;
		this.sinopsis=sinopsis;
		this.generos= new ArrayList<>();
		this.director=director;
		this.actores= new ArrayList<>();
		this.anioEstreno=anio;
		this.duracion=duracion;
		this.edadminima=edad;
	}
	
	public void agregarGenero(String g) {
		if (!generos.contains(g)){
			generos.add(g);
		}
	}
	
	public void agregarActor(String actor) {
		if (!actores.contains(actor)) {
			actores.add(actor);
		}
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadminima() {
		return edadminima;
	}

	public void setEdadminima(int edadminima) {
		this.edadminima = edadminima;
	}

	public ArrayList<String> getGeneros() {
		ArrayList<String>aux= (ArrayList<String>)generos.clone();
		return aux;
	}

	public ArrayList<String> getActores() {
		ArrayList<String>aux= (ArrayList<String>)actores.clone();
		return aux;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", sinopsis=" + sinopsis + ", generos=" + generos + ", director="
				+ director + ", actores=" + actores + ", anioEstreno=" + anioEstreno + ", duracion=" + duracion
				+ ", edadminima=" + edadminima + "]";
	}
	
	
	public boolean equals(Object p) {
		try {
		Pelicula aux= (Pelicula)p;
		return this.getTitulo().equals(aux.getTitulo());
		}catch(Exception exc) {
			return false;
		}
	}
	
}
