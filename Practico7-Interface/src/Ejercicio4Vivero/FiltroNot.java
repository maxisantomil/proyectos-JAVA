package Ejercicio4Vivero;

public class FiltroNot extends Filtro{
	Filtro f1;
	
	public FiltroNot(Filtro f) {
		this.f1=f;
	}

	@Override
	public boolean cumple(Fichaplanta f) {
		return (!f1.cumple(f));
	}
	
	
}
