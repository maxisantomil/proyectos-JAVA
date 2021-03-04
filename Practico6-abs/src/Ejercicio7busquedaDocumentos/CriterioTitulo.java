package Ejercicio7busquedaDocumentos;

public class CriterioTitulo extends Criterio {
	private String titulo;
	
	
	public CriterioTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	@Override
	public boolean cumpleCriterio(Documento doc) {
		if (doc.getTitulo().equals(titulo)){
			return true;
		}
		return false;
	}

}
