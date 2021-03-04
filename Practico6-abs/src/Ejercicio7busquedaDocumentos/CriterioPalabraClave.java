package Ejercicio7busquedaDocumentos;

public class CriterioPalabraClave extends Criterio {
	private String palabraclave;
	
	public CriterioPalabraClave(String p) {
		palabraclave=p;
	}
	
	@Override
	public boolean cumpleCriterio(Documento doc) {
		if (doc.getPalabrasClaves().contains(palabraclave)) {
			return true;
		}
		return false;
	}

}
