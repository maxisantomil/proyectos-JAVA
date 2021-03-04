package Ejercicio1FileSistem;

public class CriterioNot implements Criterio {

	private Criterio c1;
	
	public CriterioNot(Criterio cc1) {
		this.c1=cc1;
	}
	
	@Override
	public boolean cumple(ElementFileSystem elem) {
	return !c1.cumple(elem);
	}

}
