package Ejercicio3;

public class EmpleadoComision extends Empleado {
	int porcentaje= 20;
	int cantventas=0;
	
	
	public EmpleadoComision(String n, int s,int c) {
		super(n,s);
		cantventas=c;
	}
	
	
	public int  getSalario(){
		return super.getSalario() + cantventas*porcentaje;
	}
}