package Ejercicio7busquedaDocumentos;

public class CriterioOr extends Criterio {
	private Criterio c1;
	private Criterio c2;
	
	
	public CriterioOr(Criterio cc1, Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	@Override
	public boolean cumpleCriterio(Documento doc) {
		
		return c1.cumpleCriterio(doc)||c2.cumpleCriterio(doc);
	}

}
