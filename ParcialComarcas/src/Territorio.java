import java.util.ArrayList;
import java.util.Collections;

public class Territorio extends ElementTerritorio{
	private String nombre;
	private ArrayList<ElementTerritorio>territorio;
	
	
	public Territorio(String nom) {
		this.nombre=nom;
		territorio= new ArrayList<>();
	}
	
	public void agregarTerritorio(ElementTerritorio t) {
		if(!territorio.contains(t)){
			territorio.add(t);
		}
	}

	@Override
	public int cantHabitantes() {
	int suma=0;
	for (ElementTerritorio e: territorio) {
		suma+= e.cantHabitantes();
		}
	return suma;
	}

	@Override
	public double superficieTotal() {
		double suma=0;
		for (ElementTerritorio e: territorio) {
			suma+= e.superficieTotal();
			}
		return suma;
	}

	@Override
	public double ingresosTotales() {
		double suma=0;
		for (ElementTerritorio e: territorio) {
			suma+= e.ingresosTotales();
			}
		return suma;
	}

	@Override
	public ArrayList<Comarca> listarComarcasporCriterio(Criterio c) {
		ArrayList<Comarca>listaTotal= new ArrayList<>();
		for (ElementTerritorio e: territorio) {
			listaTotal.addAll(e.listarComarcasporCriterio(c));
			Collections.sort(listaTotal);
		}
		return listaTotal;
	}

	@Override
	public String toString() {
		return "Territorio [nombre=" + nombre + ", territorio=" + territorio + "]";
	}
	
	
	
	
	
	
	
}
