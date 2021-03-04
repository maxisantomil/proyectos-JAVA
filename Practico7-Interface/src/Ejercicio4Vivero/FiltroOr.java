package Ejercicio4Vivero;

public class FiltroOr {
	private Filtro f1;
	private Filtro f2;
	
	
	public FiltroOr(Filtro ff1, Filtro ff2) {
		this.f1=ff1;
		this.f2=ff2;
	}
	
	public boolean cumple(Fichaplanta ficha) {
		return f1.cumple(ficha) || f2.cumple(ficha);
	}

}