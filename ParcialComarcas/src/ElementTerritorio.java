import java.util.ArrayList;

public abstract class ElementTerritorio {

	
	
	public abstract int cantHabitantes();
	public abstract double superficieTotal();
	public abstract double ingresosTotales();
	
	public double ingresosPerCapita() {
		return ingresosTotales()/cantHabitantes();
	}
	
	public double densidadPoblacion() {
		return cantHabitantes()/superficieTotal();
	}

	public abstract ArrayList<Comarca> listarComarcasporCriterio(Criterio c);
}
