package Ejercicio5Empleados;

public class EmpleadoVenta extends EmpleadoSueldoFijo{

	double porcentaje;
	double ventas;
	
	public EmpleadoVenta(String n, String a, int dni,double s,double por) {
		super(n,a,dni,s);
		porcentaje=por;
		ventas=0;
	}
	
	public void ventarealizada(double v) {
		ventas+=v;
	}
	public double calculoextra() {
		return ventas*porcentaje;
	}
	
	//se puede abstraer metodo y extender del que no es metodo abstracto*/
	
	public double getSueldo() {
		return super.getSueldo()+ calculoextra();
	}
}
