package Ejercicio4CentrodeComputos;

public class Main {

	public static void main(String[] args) {
		ElementoOrdenable proc1= new Proceso(215,8, "thelastofus.exe");
		ElementoOrdenable proc2= new Proceso(57,8, "thelastofus.exe");
		ElementoOrdenable proc3= new Proceso(100,8, "thelastofus.exe");
		ElementoOrdenable proc4= new Proceso(350,8, "thelastofus2.exe");
		

		ElementoOrdenable cpu1= new Computadora("intel", 4, 2300);
		ElementoOrdenable cpu2= new Computadora("amd", 6, 2100);
		ElementoOrdenable cpu3= new Computadora("intel", 8, 2900);
		
		
		CentroComputos Central= new CentroComputos();
		
		Central.agregarProcesos(proc1);
		Central.agregarProcesos(proc2);
		Central.agregarProcesos(proc3);
		Central.agregarProcesos(proc4);
		
		Central.agregarComputadora(cpu1);
		Central.agregarComputadora(cpu2);
		Central.agregarComputadora(cpu3);

		Central.ejecutarProcesos();
		System.out.println(Central);
		Central.agregarComputadora(cpu1);
		Central.ejecutarProcesos();
		System.out.println(Central);
		
	}

}
