package Ejercicio4Vivero;

public class FiltroRiegoSuperior extends Filtro {
	private int riegoMin;
	
	public FiltroRiegoSuperior(int i) {
		this.riegoMin=i;
	}
	
	@Override
	public boolean cumple(Fichaplanta f) {
		return f.getRiego()>riegoMin;
	}

}
