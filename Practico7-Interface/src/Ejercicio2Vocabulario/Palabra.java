package Ejercicio2Vocabulario;

public class Palabra implements Comparable<Palabra>{
	private String nombre;
	private int cantidad;
	
	public Palabra (String nom) {
		this.nombre=nom;
		cantidad=1;
	}
	
	
	

	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getCantidad() {
		return cantidad;
	}





	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public int compareTo(Palabra p) {
		return this.getNombre().compareTo(p.getNombre());
	}


	public void sumarCantidad() {
		cantidad++;
	}
	
	public boolean equals(Object p) {
		Palabra aux= (Palabra)p;
		return this.getNombre().toLowerCase().equals(aux.getNombre().toLowerCase());
	}

	@Override
	public String toString() {
		return "Palabra [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
