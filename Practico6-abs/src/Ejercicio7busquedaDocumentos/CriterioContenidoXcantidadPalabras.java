package Ejercicio7busquedaDocumentos;

import java.util.StringTokenizer;

public class CriterioContenidoXcantidadPalabras extends Criterio {

	private int cant;
	
	public CriterioContenidoXcantidadPalabras(int c) {
		cant=c;
	}
	@Override
	public boolean cumpleCriterio(Documento doc) {
		String contenido= doc.getContenidotex();
		StringTokenizer cantPalabras= new StringTokenizer(contenido);
		
		return (cantPalabras.countTokens() >=cant);
	}

}
