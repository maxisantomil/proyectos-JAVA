import java.util.ArrayList;

public class Serie {
	private String nombre;
	private String descripcion;
	private String creador;
	private String genero;
	ArrayList<Temporada>Temporadas;
	
	
	
	public Serie(String n, String d, String c, String g) {
		nombre = n; 
		descripcion = d;
		creador = c;
		genero = g;
		Temporadas = new ArrayList<Temporada>();
		
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getCreador() {
		return creador;
	}



	public void setCreador(String creador) {
		this.creador = creador;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public ArrayList<Temporada> getTemporadas() {
		ArrayList<Temporada>nuevo=new ArrayList<>();
		for (Temporada t:Temporadas) {
			nuevo.add(t);
			
			//nuevo.addAll(Temporadas);
		}
		return nuevo;
	}
	
	
	public void addtemporada (Temporada t) {
		Temporadas.add(t);
	}
	
	public int canttemporadas () {
		return Temporadas.size();
	}
	
	public int cantEpisodiosVistos() {
		int cant = 0;
		for (Temporada t: Temporadas) {
			cant = cant + t.totalepisodiosvistos();
		}
		return cant;
	}
	
	public double promedioSerie() {
		double prom=0;
		int cant=0;
		for (Temporada t: Temporadas) {
			if (t.promediotemporada()>0) {
					prom= prom + t.promediotemporada()*t.totalepisodiosvistos();
					cant+= t.totalepisodiosvistos();
			}
		}
		return prom/ cant;
	}
	
	public boolean seriecompleta() {
		int cant=0;
		int total=0;
		for (Temporada t: Temporadas) {
			total+= t.cantidadepisodios();
			cant +=t.totalepisodiosvistos();
		}
		return  cant == total;
	}
}
