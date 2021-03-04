import java.util.ArrayList;

public class Pelicula extends ElementP{
	private String titulo;
	private double puntaje;
	private int anio_lanzamiento;
	private int cantOscars;
	ArrayList<Actor>listaActores;
	
	
	public Pelicula(String t, double p, int anio, int oscars) {
		this.titulo=t;
		this.puntaje=p;
		this.anio_lanzamiento=anio;
		this.cantOscars=oscars;
		listaActores= new ArrayList<>();
	}
	
	
	public void agregarActor(Actor a) {
		if (!listaActores.contains(a)){
			listaActores.add(a);
		}
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}


	public int getAnio_lanzamiento() {
		return anio_lanzamiento;
	}


	public void setAnio_lanzamiento(int anio_lanzamiento) {
		this.anio_lanzamiento = anio_lanzamiento;
	}



	public void setCantOscars(int cantOscars) {
		this.cantOscars = cantOscars;
	}


	@Override
	public int cantOscars() {
		return cantOscars;
	}


	@Override
	public int cantPeliculas() {
		return 1;
	}


	@Override
	public double promedioPuntaje() {
		return this.puntaje;
	}


	public boolean contieneActor(Actor act) {
		return listaActores.contains(act);
	}

	
	public ArrayList<Pelicula> listaPeliculasCriterio(Criterio c){
		ArrayList<Pelicula> lista= new ArrayList<>();
		if (c.cumple(this)){
			lista.add(this);
			}
		return lista;
	}


	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", puntaje=" + puntaje + ", anio_lanzamiento=" + anio_lanzamiento
				+ ", cantOscars=" + cantOscars + ", listaActores=" + listaActores + "]";
	}


	@Override
	public ElementP getCopia(Criterio c) {
		if (c.cumple(this)){
			Pelicula p = new Pelicula(this.getTitulo(),this.getPuntaje(),this.getAnio_lanzamiento(),this.cantOscars());
			for(Actor a: listaActores) {
				p.agregarActor(a.getCopia());
			}
			return p;
		}
		return null;
	}
	
	
	
}
