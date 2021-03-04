import java.util.ArrayList;

public class PlataformaStreaming {
	private String nombre;
	private ArrayList<Pelicula>catalogoPeliculas;
	private Criterio CriterioRentable;
	
	public PlataformaStreaming (String nombre) {
		this.nombre=nombre;
		this.catalogoPeliculas= new ArrayList<>();
	}
	
	
	public void agregarCriterioRentabilidad(Criterio c) {
		this.CriterioRentable=c;
	}
	
	
	
	public void agregarPelicula(Pelicula p) {
		if (!catalogoPeliculas.contains(p)){ //redefino el equals en la clase pelicula
			catalogoPeliculas.add(p);
		}
	}
	
	public ArrayList<Pelicula> mostrarCatalogo(){
		 ArrayList<Pelicula>peliculas=(ArrayList<Pelicula>)catalogoPeliculas.clone();
		 return peliculas;
	}
	
	public ArrayList<Pelicula> buscadorPeliculas(Criterio criterio){
		ArrayList<Pelicula>auxiliar= new ArrayList<>();
		for (Pelicula p:catalogoPeliculas) {
			if (criterio.cumple(p)){
				auxiliar.add(p);
			}
		}
		return auxiliar;
	}
	

	public boolean esrentable(Pelicula p) {
			if (!CriterioRentable.cumple(p)){
				return false;
			}
		return true;
	}

	@Override
	public String toString() {
		return "PlataformaStreaming [nombre=" + nombre + ", catalogoPeliculas=" + catalogoPeliculas + "]";
	}
	
	
	
}