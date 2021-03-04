package Ejercicio7busquedaDocumentos;

public class CriterioNot extends Criterio {
	private Criterio c;
	
	
	public CriterioNot(Criterio cc) {
		c=cc;
	}
	@Override
	public boolean cumpleCriterio(Documento doc) {
		if (!c.cumpleCriterio(doc)){
			return true;
		}
		return false;
	}

}
