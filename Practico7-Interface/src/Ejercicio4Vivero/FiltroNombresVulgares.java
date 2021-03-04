package Ejercicio4Vivero;

public class FiltroNombresVulgares extends Filtro {
	private String nombre;
	
	public FiltroNombresVulgares(String n) {
		this.nombre=n;
	}
	
	@Override
	public boolean cumple(Fichaplanta f) {
		return f.contieneNombreVulgar(nombre);
	}

}
