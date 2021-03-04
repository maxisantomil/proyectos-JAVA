package Ejercicio7busquedaDocumentos;

public class CriterioTitulocontieneX extends Criterio {
	String palabraoFrase;

	public CriterioTitulocontieneX(String palabra) {
		palabraoFrase=palabra;
	}
	public boolean cumpleCriterio(Documento doc) {
		if (doc.getTitulo().contains(palabraoFrase)){
			return true;
		}
		return false;
	}

}
