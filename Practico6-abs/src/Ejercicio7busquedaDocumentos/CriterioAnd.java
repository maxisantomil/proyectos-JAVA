package Ejercicio7busquedaDocumentos;

public class CriterioAnd extends Criterio {
	private Criterio c1;
	private Criterio c2;
	
	
	public CriterioAnd(Criterio cc1,Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	@Override
	public boolean cumpleCriterio(Documento doc) {
		return c1.cumpleCriterio(doc) && c2.cumpleCriterio(doc);
	}

}
