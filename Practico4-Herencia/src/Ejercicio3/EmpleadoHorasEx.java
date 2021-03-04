package Ejercicio3;

public class EmpleadoHorasEx extends Empleado{
	int horasExtras;
	final int montoHorasEx=200;
	
	public EmpleadoHorasEx(String n,int i,int h) {
		super(n,i);
		horasExtras=h;
		
		
	}
	
	
	
	public int getSalario() {
		return super.getSalario()+ horasExtras*montoHorasEx;
	}
}
