package Ejercicio5Empleados;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa sumaSoluciones= new Empresa("suma soluciones");
		EmpleadoSueldoFijo e1= new EmpleadoSueldoFijo("jorge", "perez",33524, 18000);
		EmpleadoVenta e2= new EmpleadoVenta("maxi", "santoval", 3517251, 20000,0.15);
		EmpleadoBono e3= new EmpleadoBono("damian","lucero",22222,15000,3,1000);
		
		
		
		sumaSoluciones.agregarEmpleado(e1);
		sumaSoluciones.agregarEmpleado(e2);
		sumaSoluciones.agregarEmpleado(e3);
		
		e3.vende();
		e3.vende();
		e3.vende();
		e3.vende();
		e3.vende();
		System.out.println(e3.cantventasrealizadas);//5
		System.out.println(e3.getSueldo());//16000
		System.out.println(e2.getSueldo());//20000
		e2.ventarealizada(2000);
		e2.ventarealizada(5000);
		e2.ventarealizada(6000);
		System.out.println(e2.getSueldo());
		System.out.println(e1.getSueldo());//18000
		e1.sumarSueldo(2000);
		System.out.println(e1.getSueldo());//20000
		System.out.println( sumaSoluciones.totalgastosSueldos());
	}

}
