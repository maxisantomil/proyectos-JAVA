import java.util.ArrayList;

public class Grupo extends ElementP {
	private String titulo;
	private ArrayList<ElementP>conjunto;
	
	
	public Grupo(String t) {
		this.titulo=t;
		conjunto= new ArrayList<>();
	}
	public Grupo() {
		conjunto=new ArrayList<>();
	}
	
	public void agregarElementoIMDB(ElementP e) {
		if (!conjunto.contains(e))
			this.conjunto.add(e);
	}

	@Override
	public int cantOscars() {
		int suma=0;
		for (ElementP e: conjunto) {
			suma+= e.cantOscars();
		}
		return suma;
	}

	@Override
	public int cantPeliculas() {
		int cant=0;
		for (ElementP e:conjunto) {
			cant+= e.cantPeliculas();
		}
		return cant;
	}

	@Override
	public double promedioPuntaje() {
		double suma=0;
		for (ElementP e: conjunto) {
			suma+= e.promedioPuntaje();
		}
		return suma/cantPeliculas();
		
	}

	@Override
	public ArrayList<Pelicula> listaPeliculasCriterio(Criterio c) {
		ArrayList<Pelicula>lista = new ArrayList<>();
		for (ElementP e:conjunto) {
			lista.addAll(e.listaPeliculasCriterio(c));
		}
		return lista;
	}

	@Override
	public ElementP getCopia(Criterio c) {
		Grupo g= new Grupo(this.titulo);
		for(ElementP e: conjunto) {
			ElementP copiaHijo= e.getCopia(c);
			if (copiaHijo!=null) {
				g.agregarElementoIMDB(copiaHijo);
			}
		}
		if (g.tieneElementos()){
			return g;
		}
		else return null;
	}
	private boolean tieneElementos() {
		return this.conjunto.size()>0;
		}
	}
	
	
	
	
}
