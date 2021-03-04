package Ejercicio1FileSistem;

public class CriterioContienePalabra implements Criterio{

	private String nombre;
	
	public CriterioContienePalabra(String n) {
		this.nombre=n;
	}
	
	@Override
	public boolean cumple(ElementFileSystem elem) {
		return elem.getNombre().contains(this.nombre);
	}

}
