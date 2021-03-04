package empleados;

public class Ventas  extends Empleado{
		double comisionventas=40;
		int ventas;
		

	public Ventas(String n,int dni,double s, int h) {
		super(n,dni,s);
		ventas=h;
		
	}


public double getsueldo() {
	return (super.getsueldo()+(comisionventas*ventas));
}


}