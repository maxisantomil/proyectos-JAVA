import java.util.ArrayList;
import java.util.Collections;

public class Comarca extends ElementTerritorio implements Comparable<Comarca>{
	private String nombre;
	private double superficie;
	private int cantHabitantes;
	private double totalIngresos;
	
	
	public Comarca (String n,double sup, int cant, double ingresos) {
		this.nombre=n;
		this.superficie=sup;
		this.cantHabitantes=cant;
		this.totalIngresos=ingresos;
	}

	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public int cantHabitantes() {
		return this.cantHabitantes;
	}


	@Override
	public double superficieTotal() {
		return this.superficie;
	}


	@Override
	public double ingresosTotales() {
		return this.totalIngresos;
	}
	
	public ArrayList<Comarca> listarComarcasporCriterio(Criterio c){
		ArrayList<Comarca> lista= new ArrayList<>();
		if (c.cumple(this)){
			lista.add(this);
		}
		return lista;
	}



	@Override
	public String toString() {
		return "Comarca [nombre=" + nombre + ", superficie=" + superficie + ", cantHabitantes=" + cantHabitantes
				+ ", totalIngresos=" + totalIngresos + "]";
	}



	@Override
	public int compareTo(Comarca o) {
		return (this.getNombre().compareTo(o.getNombre()));
	}
	
	
}
