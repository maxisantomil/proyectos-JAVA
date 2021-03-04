package Ejercicio7busquedaDocumentos;

public class CriterioContenidotieneX extends Criterio {
	private String x;
	
	public CriterioContenidotieneX(String x) {
		this.x=x;
	}
	@Override
	public boolean cumpleCriterio(Documento doc) {
		
		return doc.getContenidotex().contains(x);
	}

}
