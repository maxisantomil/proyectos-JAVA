package empleados;

public class EmpleadoshorasExtras extends Empleado{
	final double extra=200;
	int horas;
	


public EmpleadoshorasExtras(String n,int dni,double s, int h) {
	super(n,dni,s);
	horas=h;
	
}


public double getsueldo() {
	return (super.getsueldo()+(extra*horas));
}


}