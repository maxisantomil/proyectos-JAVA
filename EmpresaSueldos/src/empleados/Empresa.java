package empleados;

import java.util.ArrayList;

public class Empresa {
	public static void main(String []args) {
		
		ArrayList<Empleado>Empleados;
		Empleados=new ArrayList<Empleado>();
		Empleado e1=new Empleado("Jorge",12258756,20000);
		Empleado e2=new Empleado("Marcelo",10258756,20000);
		Empleado e3=new Empleado("Pedro",17258756,20000);
		Empleado e4=new Ventas("Maxi",35172571,20000,50);
		Empleado e5=new Ventas("Javi",34172571,20000,48);
		Empleado e6=new EmpleadoshorasExtras("Jose",34172571,20000,48);
		
		Empleados.add(e1);
		Empleados.add(e2);
		Empleados.add(e3);
		Empleados.add(e4);
		Empleados.add(e5);
		Empleados.add(e6);
		//System.out.println(e2.getsueldo());
		//System.out.println(e4.getsueldo());
		//System.out.println(e6.getsueldo());
		//System.out.println(e5.getsueldo());
		
		for(Empleado e: Empleados) {
			System.out.println(e.toString());
		}
	}
}
	

