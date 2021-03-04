package Ejercicio3;

public class Empleado {
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getSalario() {
		return salariofijo;
	}



	public void setSalario(int salariofijo) {
		this.salariofijo = salariofijo;
	}



	String nombre;
	int salariofijo;
	
	
	public Empleado (String n, int i) {
		nombre=n;
		salariofijo= i;
	}
	
}
