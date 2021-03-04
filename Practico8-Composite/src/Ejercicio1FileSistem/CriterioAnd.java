package Ejercicio1FileSistem;

public class CriterioAnd implements Criterio {
	private Criterio c1;
	private Criterio c2;
	
	
	public CriterioAnd(Criterio cc1, Criterio cc2) {
		this.c1=cc1;
		this.c2=cc2;
	}
	@Override
	public boolean cumple(ElementFileSystem elem) {
		return c1.cumple(elem) && c2.cumple(elem);
	}

}
