package Ejercicio5Empleados;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private int dni;
	
	
	public Empleado(String n, String a,int dni) {
		nombre=n;
		apellido=a;
		this.dni=dni;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public int getDni() {
		return dni;
	}



	public abstract double getSueldo();


}