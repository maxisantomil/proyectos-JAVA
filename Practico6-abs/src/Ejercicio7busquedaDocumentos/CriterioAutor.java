package Ejercicio7busquedaDocumentos;

public class CriterioAutor extends Criterio {
	private String autor;
	
	public CriterioAutor(String autor) {
		this.autor=autor;
	}
	
	@Override
	public boolean cumpleCriterio(Documento doc) {
	    return doc.getAutores().contains(autor);
	}

}
