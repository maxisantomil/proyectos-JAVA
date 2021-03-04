package Ejercicio5Empleados;

public class EmpleadoBono extends EmpleadoSueldoFijo{
	int cantventasrealizadas;
	int topeventas;
	double bono;
	
	public EmpleadoBono(String n, String a, int dni,double s,int topventas,double b) {
		super(n, a, dni,s);
		topeventas=topventas;
		bono=b;
		// TODO Auto-generated constructor stub
	}

	public void vende() {
		 this.cantventasrealizadas++;
	}
	
	
	@Override
	public double getSueldo() {
		
		if (cantventasrealizadas > topeventas) {
			return super.getSueldo() + bono;
		}
		return super.getSueldo();
	}

}
