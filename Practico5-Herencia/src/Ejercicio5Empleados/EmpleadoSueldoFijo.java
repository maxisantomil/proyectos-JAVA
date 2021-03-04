package Ejercicio5Empleados;

public class EmpleadoSueldoFijo extends Empleado {
	private double sueldoFijo;
	
	public EmpleadoSueldoFijo(String n, String a,int dni,double sueldo) {
		super(n,a,dni);
		sueldoFijo=sueldo;
	}
	
	public void sumarSueldo(double s) {
		sueldoFijo=sueldoFijo+ s;
	}
	
	public double getSueldo() {
		return this.sueldoFijo;
	}


}
