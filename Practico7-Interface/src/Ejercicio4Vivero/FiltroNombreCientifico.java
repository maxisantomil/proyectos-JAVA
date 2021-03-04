package Ejercicio4Vivero;


public class FiltroNombreCientifico extends Filtro{
	private String nombre;
	
	public FiltroNombreCientifico(String n) {
		this.nombre=n;
	}
	@Override
	public boolean cumple(Fichaplanta f) {
		return (f.getNombreCientifico().toLowerCase().contains(nombre.toLowerCase())); 
	}

	

}
