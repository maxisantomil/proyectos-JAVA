
public class CriterioTituloContiene extends Criterio {
	private String palabra;
		
	public CriterioTituloContiene(String xPalabra) {
		this.palabra=xPalabra;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		if (p.getTitulo().toLowerCase().contains(palabra.toLowerCase())) {
			return true;
		}
		return false;
	}

}
