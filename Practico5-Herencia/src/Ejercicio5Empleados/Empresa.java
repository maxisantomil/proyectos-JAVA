package Ejercicio5Empleados;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Empleado>empleados;
	
	public Empresa(String n) {
		nombre=n;
		empleados= new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void  agregarEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	
	public double totalgastosSueldos() {
		double suma=0;
		for (Empleado e: empleados) {
			suma+= e.getSueldo();
		}
		return suma;
	}
}
