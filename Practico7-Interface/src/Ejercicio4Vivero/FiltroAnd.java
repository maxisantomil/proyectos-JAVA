package Ejercicio4Vivero;

public class FiltroAnd extends Filtro{

	private Filtro f1;
	private Filtro f2;
	
	
	public FiltroAnd(Filtro ff1, Filtro ff2) {
		this.f1=ff1;
		this.f2=ff2;
	}
	
	@Override
	public boolean cumple(Fichaplanta ficha) {
		return f1.cumple(ficha) && f2.cumple(ficha);
	}

}
