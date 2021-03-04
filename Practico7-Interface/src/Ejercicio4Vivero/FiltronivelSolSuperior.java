package Ejercicio4Vivero;

public class FiltronivelSolSuperior extends Filtro{
	private int nivelMin;
	
	public FiltronivelSolSuperior(int i) {
		this.nivelMin=i;
	}

	@Override
	public boolean cumple(Fichaplanta f) {
		return f.getSol()> nivelMin;
	}
	
	
}
